package com.bankingapplication.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.*;
import com.bankingapplication.bank.model.Account;
import com.bankingapplication.bank.repository.AccountRepo;

@Service
public class AccountService {
    @Autowired
    public AccountRepo accountRepo;

    public Account addData(Account account)
    {
        return accountRepo.save(account);
    }
    public Account getByid(String phone)
    {
        return accountRepo.findById(phone).orElse(null);
    }
    public List<Account> getAccount()
    {
        return accountRepo.findAll();
    }
    public List<Account> ProductPagination(int offset,int page)
    {
        return accountRepo.findAll(PageRequest.of(offset, page)).getContent();
    }
    public void delAccount(String phone)
    {
        accountRepo.deleteById(phone);
        return;
    }
    public List<Account> Sorting(String phone)
    {
        return accountRepo.findAll(Sort.by(Sort.Direction.ASC,phone));
    }
}
