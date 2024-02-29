package com.bankingapplication.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.bankingapplication.bank.model.AccountInformation;
import com.bankingapplication.bank.repository.AccountInformationRepo;

@Service
public class AccountInformationService {
    @Autowired
    public AccountInformationRepo accountInformationRepo;

    public AccountInformation addAccountInformation(AccountInformation accountInformation)
    {
        return accountInformationRepo.save(accountInformation);
    }

    public List<AccountInformation> getInformation()
    {
        return accountInformationRepo.findAll();
    }
}
