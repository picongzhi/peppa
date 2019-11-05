package com.pcz.mapper;

import com.pcz.model.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @author picongzhi
 */
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
//    List<User> selectAll();
}
