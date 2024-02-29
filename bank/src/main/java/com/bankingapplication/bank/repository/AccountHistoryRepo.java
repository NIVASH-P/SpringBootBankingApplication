package com.bankingapplication.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingapplication.bank.model.AccountHistory;

@Repository
public interface AccountHistoryRepo extends JpaRepository<AccountHistory,Integer>{
    
}
