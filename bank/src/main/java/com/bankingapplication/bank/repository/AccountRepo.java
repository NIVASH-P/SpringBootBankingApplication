package com.bankingapplication.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingapplication.bank.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,String> {
    
}
