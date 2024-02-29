package com.bankingapplication.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountHistory {
    @Id
    private int id;
    private Date date;
    private int debit;
    private int credit;
    private int total;

    @JsonBackReference
    @ManyToOne
    public Account account;
}
