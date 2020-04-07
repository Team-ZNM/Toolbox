package com.im.business.service.impl;

import com.im.business.entity.User;
import com.im.business.mapper.UserMapper;
import com.im.business.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Godlys
 * @since 2020-04-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
