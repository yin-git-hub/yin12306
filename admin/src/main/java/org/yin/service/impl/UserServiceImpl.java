package org.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yin.domain.User;
import org.yin.mapper.UserMapper;
import org.yin.service.UserService;

/**
* @author yin82
* @description 针对表【t_user(用户表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




