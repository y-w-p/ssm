package com.ywp.dao;

import com.ywp.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户持久层
 */
@Repository
public interface AccountDao {

    /**
     * 查找所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

}
