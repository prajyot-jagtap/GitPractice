package com.sunny.GitPractice.model;

import java.util.Date;
import java.util.Objects;

public class transaction {

    private String business;
    private String desc;
    private double amount;
    private Date date;

    public transaction(String business, String desc, double amount, Date date) {
        this.business = business;
        this.desc = desc;
        this.amount = amount;
        this.date = date;
    }

    public String getBusiness() {
        return business;
    }

    public String getDesc() {
        return desc;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof transaction)) return false;
        transaction that = (transaction) o;
        return Double.compare(that.amount, amount) == 0 && business.equals(that.business) && Objects.equals(desc, that.desc) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(business, desc, amount, date);
    }

    @Override
    public String toString() {
        return "transaction{" +
                "business='" + business + '\'' +
                ", desc='" + desc + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
