package org.lyh.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lyh.pojo.User;

public interface UserMapper {

    @Select("Select * from user where id = #{id}")
    User selectById(@Param("id") int id);

    void updateByUser(@Param("user") User user);
}
