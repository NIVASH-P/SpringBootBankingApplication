package com.bankingapplication.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.bankingapplication.bank.model.AccountInformation;
import com.bankingapplication.bank.service.AccountInformationService;

@RestController
public class AccountIformationController {
    @Autowired
    private AccountInformationService accountInformationService;

    @PostMapping("/postinfo")
    public AccountInformation postAccountInformation(@RequestBody AccountInformation accountInformation)
    {
        return accountInformationService.addAccountInformation(accountInformation);
    }

    @GetMapping("/getinfo")
    public List<AccountInformation> getAccountInformation()
    {
        return accountInformationService.getInformation();
    }
}
