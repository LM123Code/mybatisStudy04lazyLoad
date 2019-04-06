package com.itheima04lazy.dao;

import com.itheima04lazy.domain.User;
import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-04-20:22
 */
public interface IUserDao {
    /**
     * 查询所有的用户
     * @return
     */
    public List<User> findAll();

    public User findById(int id);
}
