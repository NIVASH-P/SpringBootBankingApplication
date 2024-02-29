package com.bankingapplication.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankingapplication.bank.model.Account;
import com.bankingapplication.bank.service.AccountService;

@RestController
public class AccountController {
    @Autowired
    public AccountService accountService;

    @PostMapping("/postacc")
    public Account postData(@RequestBody Account account)
    {
        return accountService.addData(account);
    }

    @GetMapping("/getAll")
    public List<Account> getAccounts()
    {
        return accountService.getAccount();
    }

    @GetMapping("/get/{phone}")
    public Account getAccountByphone(@PathVariable String phone)
    {
        return accountService.getByid(phone);
    }
    @GetMapping("/get/sort/{field}")
    public List<Account> getSortAccountByphone(@PathVariable String field)
    {
        return accountService.Sorting(field);
    }
    @GetMapping("/get/{off}/{page}")
    public List<Account> getByPage(@PathVariable("off") int off,@PathVariable("page") int page)
    {
        return accountService.ProductPagination(off, page);
    }
    @DeleteMapping("/del/{phone}")
    public void delAccount(@PathVariable String phone)
    {
        accountService.delAccount(phone);
    }
}
