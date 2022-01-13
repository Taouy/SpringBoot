package com.example.springbootdemo.biz;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;

import javax.annotation.Resource;

/**
 * @author Taouy
 * @Description
 * @date 2021/11/23 11:34
 */
@Service
@Transactional(rollbackFor = BizException.class )
public class UserBiz {

    @Resource
    private UserDao userDao;
    public void reg(User user, Errors errors) throws BizException {
        if(errors.hasErrors() == false){
            if (userDao.countByName(user.getName())>0){
                errors.rejectValue("name","NameDup....","该用户已经被注册");

            }else{
                userDao.insert(user);
            }
        }

        if(errors.hasErrors()){

            throw new BizException("注册失败",errors.getAllErrors());
        }

    }
}
