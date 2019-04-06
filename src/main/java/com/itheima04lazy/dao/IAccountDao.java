package com.itheima04lazy.dao;

import com.itheima04lazy.domain.Account;
import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-04-20:22
 */
public interface IAccountDao {
    /**
     * 查询所有的账户
     * @return
     */
    public List<Account> findAll();

    public List<Account> findAccountsByUid(int uid);
}
