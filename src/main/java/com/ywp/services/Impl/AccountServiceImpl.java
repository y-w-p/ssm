package com.ywp.services.Impl;

import com.ywp.dao.AccountDao;
import com.ywp.entity.Account;
import com.ywp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * 账户业务层实现
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查找所有账户。。。");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {

        System.out.println("业务层：保存账户。。。");

        accountDao.saveAccount(account);
    }
}
