package com.chethan.solidprinciples.DependencyInversionPrinciple.After;

public class DataAccess {

    public DataAccess() {
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name"; // get it from DB in real app
    }
}
