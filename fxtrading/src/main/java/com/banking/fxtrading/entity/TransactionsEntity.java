package com.banking.fxtrading.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "transactions", schema = "public")
public class TransactionsEntity {

    private int id;
    private String username;
    private String primaryCurrency;
    private String secondaryCurrency;
    private String action;
    private double transaction;
    private Timestamp date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "primary_ccy")
    public String getPrimaryCurrency() {
        return primaryCurrency;
    }

    public void setPrimaryCurrency(String primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }

    @Basic
    @Column(name = "secondary_ccy")
    public String getSecondaryCurrency() {
        return secondaryCurrency;
    }

    public void setSecondaryCurrency(String secondaryCurrency) {
        this.secondaryCurrency = secondaryCurrency;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "transaction")
    public double getTransaction() {
        return transaction;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
