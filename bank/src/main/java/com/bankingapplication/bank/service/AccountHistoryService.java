package com.bankingapplication.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingapplication.bank.model.Account;
import com.bankingapplication.bank.model.AccountHistory;
import com.bankingapplication.bank.repository.AccountHistoryRepo;

@Service
public class AccountHistoryService {
    @Autowired
    private AccountHistoryRepo accountHistoryRepo;

    public AccountHistory addData(AccountHistory accountHistory)
    {
        return accountHistoryRepo.save(accountHistory);
    }

    public List<AccountHistory> getAll()
    {
        return accountHistoryRepo.findAll();
    }
    
}
