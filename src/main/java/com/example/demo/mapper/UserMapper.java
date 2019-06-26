package com.example.demo.mapper;

import com.example.demo.model.User;

public interface UserMapper {

    /*@Select("select * from student where id = #{id}")
    User selectUser(long id);

    @Insert("insert into student values(#{id}, #{name})")
    void insertUser(User user);*/

    //@Select("select id, stu_name as name from student where id = #{id}")
    User selectUser(long id);

    //@Insert("insert into student values(#{id}, #{name})")
    void insertUser(User user);

    User selectUserAndCars(long id);

}
