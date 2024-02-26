package com.ditanrai.stockmanagement.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "stock")
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private BigDecimal lastTransactionPrice;
    private long quantity;
    private String transactionProcess;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getLastTransactionPrice() {
        return lastTransactionPrice;
    }

    public void setLastTransactionPrice(BigDecimal lastTransactionPrice) {
        this.lastTransactionPrice = lastTransactionPrice;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getTransactionProcess() {
        return transactionProcess;
    }

    public void setTransactionProcess(String transactionProcess) {
        this.transactionProcess = transactionProcess;
    }
}
