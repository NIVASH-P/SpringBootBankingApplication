package com.bankingapplication.bank.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountInformation {
    @Id
    private int id;
    private String atharNumber;
    private String panNumber;
    private String debitcard;
    private String creditcard;
    private String cibilScore;

    @JsonBackReference
    @OneToOne
    private Account account;
}
