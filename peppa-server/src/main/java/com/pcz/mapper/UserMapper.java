package com.pcz.mapper;

import com.pcz.model.User;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author picongzhi
 */
public interface UserMapper extends Mapper<User>, MySqlMapper<User>, ConditionMapper<User> {
}
