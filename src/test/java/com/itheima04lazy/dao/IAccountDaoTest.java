package com.itheima04lazy.dao;

import com.itheima04lazy.domain.Account;
import com.itheima04lazy.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-05-11:01
 */
public class IAccountDaoTest {
    SqlSession sqlSession = null;
    IAccountDao accountDao = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(false);
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println("---------------------------------");
//            System.out.println(account);
//            System.out.println(account.getUser());
        }
    }
    @Test
    public void testFindAccountsByUid(){
        List<Account> accounts = accountDao.findAccountsByUid(46);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
