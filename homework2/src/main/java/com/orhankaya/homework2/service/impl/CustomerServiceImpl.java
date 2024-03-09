package com.orhankaya.homework2.service.impl;

import com.orhankaya.homework2.entity.Customer;
import com.orhankaya.homework2.service.CustomerService;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customers;

    public CustomerServiceImpl(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customers.stream()
                .map(customer -> new Customer(customer.getId(),
                        customer.getName(),
                        customer.getSurname(),
                        customer.getEmail(),
                        customer.getPhoneNumber(),
                        customer.getOrders(),
                        customer.getCreatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> findCustomersWithNameC() {
        return customers.stream()
                .filter(customer -> customer.getName().startsWith("C"))
                .map(customer -> new Customer(customer.getId(),
                        customer.getName(),
                        customer.getSurname(),
                        customer.getEmail(),
                        customer.getPhoneNumber(),
                        customer.getOrders(),
                        customer.getCreatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> findCustomersWithBillsUnder500() {
        return customers.stream()
                .filter(customer -> customer.getOrders().stream()
                .anyMatch(order -> order.getAmount()<500))
                .map(customer -> new Customer(customer.getId(),
                        customer.getName(),
                        customer.getSurname(),
                        customer.getEmail(),
                        customer.getPhoneNumber(),
                        customer.getOrders(),
                        customer.getCreatedAt()))
                .collect(Collectors.toList());
    }


    @Override
    public List<Customer> findCustomersWithInvoicesUnder750Average() {
//        return customerList.stream()
//                .filter(customer -> customer.getOrders().stream()
//                        .anyMatch(order -> order.getAmount() < 750))
//                .map(customer -> {
//                    CustomerDto dto = new CustomerDto();
//                    dto.setFirstName(customer.getFirstName());
//                    dto.setLastName(customer.getLastName());
//                    return dto;
//                })
//                .collect(toList());
        return customers.stream()
                .filter(customer -> customer.getOrders().stream()
                        .anyMatch(order -> order.getAmount() < 750))
                .map(customer -> new Customer(customer.getId(),
                        customer.getName(),
                        customer.getSurname(),
                        customer.getEmail(),
                        customer.getPhoneNumber(),
                        customer.getOrders(),
                        customer.getCreatedAt()))
                .collect(Collectors.toList());
    }
}
