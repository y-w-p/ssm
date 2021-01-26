package com.ywp.services;

import com.ywp.entity.Account;

import java.util.List;

/**
 * 账户业务层接口
 */
public interface AccountService {

    /**
         * 查找所有账户
         * @return
         */
        public List<Account> findAll();

        /**
         * 保存账户
         * @param account
         */
        public void saveAccount(Account account);
}
