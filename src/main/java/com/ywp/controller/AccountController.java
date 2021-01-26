package com.ywp.controller;

import com.ywp.entity.Account;
import com.ywp.services.AccountService;
import com.ywp.services.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    public AccountService accountService;

    /**
     * 查找所有用户
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。");
        //调用service方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }


    /**
     * 保存用户
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：查询所有账户。。。");
        //调用service方法
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
