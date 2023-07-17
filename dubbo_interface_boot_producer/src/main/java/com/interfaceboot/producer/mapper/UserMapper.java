package com.interfaceboot.producer.mapper;

import com.interfaceboot.api.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    @Results(id = "base_map", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "username", property = "username")
    })
    @Select("select * from user where id = #{id}")
    User selectUserById(Long id);
}
