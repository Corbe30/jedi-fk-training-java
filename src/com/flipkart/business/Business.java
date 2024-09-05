package com.flipkart.business;

public class Business {
    public void createCustomer() {
        System.out.println("customer created");
    }
    public boolean updateCustomer(int customerId) {
        System.out.println("customer updated");
        return true;
    }
    public boolean deleteCustomer(int customerId) {
        System.out.println("customer deleted");
        return true;
    }
    public void listCustomer(int customerId) {
        System.out.println("customer listed");
    }
}
