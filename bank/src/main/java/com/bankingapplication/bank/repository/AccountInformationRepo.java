package com.bankingapplication.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingapplication.bank.model.AccountInformation;

@Repository
public interface AccountInformationRepo extends JpaRepository<AccountInformation,Integer>{

    
}
