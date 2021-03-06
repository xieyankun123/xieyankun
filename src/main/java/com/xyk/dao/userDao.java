package com.xyk.dao;

import com.xyk.model.UserModel;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface userDao {
    List<UserModel> list();
    UserModel selbyid(int id);
    List<UserModel> selbytel(String user_telephone);
    boolean del(int id);
    boolean update(UserModel userModel);
    void add(UserModel userModel);
}
