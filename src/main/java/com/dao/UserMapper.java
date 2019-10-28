package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by wanggq on 2019/10/25.
 */
@Mapper
@Repository
public interface UserMapper {

    public User login(@Param("name")String name,
                      @Param("pwd")String pwd);
    public List<User> list();
}
