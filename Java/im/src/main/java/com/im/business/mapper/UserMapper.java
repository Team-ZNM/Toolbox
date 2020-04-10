package com.im.business.mapper;

import com.im.business.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Godlys
 * @since 2020-04-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
