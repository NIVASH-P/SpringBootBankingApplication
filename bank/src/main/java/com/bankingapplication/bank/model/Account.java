package com.bankingapplication.bank.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    private String phoneNumber;
    private int accountNumber;
    private String accountName;
    private String accountType;
    private String cifnumber;
    private String branch;
    private String postcode;
    private String IFSC;
    private String Address;

    @JsonManagedReference
    @OneToMany(mappedBy = "account" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    public List<AccountHistory> accountHistory;
    
    @JsonManagedReference
    @OneToOne(mappedBy = "account",cascade = CascadeType.ALL)
    public AccountInformation accountInformation;
}
