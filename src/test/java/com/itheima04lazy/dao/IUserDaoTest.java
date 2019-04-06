package com.itheima04lazy.dao;

import com.itheima04lazy.domain.User;
import com.itheima04lazy.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-05-11:02
 */
public class IUserDaoTest {
    SqlSession sqlSession = null;
    IUserDao userDao = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        userDao = sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("-----------------------");
            System.out.println(user);
//            System.out.println(user.getAccounts());
        }
    }
    @Test
    public void testFindById(){
        User user = userDao.findById(43);
        System.out.println(user);
    }
}
