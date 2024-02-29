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
import com.bankingapplication.bank.model.AccountHistory;
import com.bankingapplication.bank.service.AccountHistoryService;

@RestController
public class AccountHistoryController {
    @Autowired
    public AccountHistoryService accountHistoryService;

    @PostMapping("/postacchis")
    public AccountHistory postData(@RequestBody AccountHistory accountHistory)
    {
        return accountHistoryService.addData(accountHistory);
    }

    @GetMapping("/getHistroy")
    public List<AccountHistory> getAll()
    {
        return accountHistoryService.getAll();
    }
    

}
