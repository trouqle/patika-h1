package com.orhankaya.homework2.service;

import com.orhankaya.homework2.entity.Customer;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);
    List<Customer> findAllCustomers();
    List<Customer> findCustomersWithNameC();
    List<Customer> findCustomersWithBillsUnder500();
    List<Customer> findCustomersWithInvoicesUnder750Average();
}
