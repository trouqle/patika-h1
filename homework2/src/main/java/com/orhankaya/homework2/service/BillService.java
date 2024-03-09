package com.orhankaya.homework2.service;

import com.orhankaya.homework2.entity.Bill;

import java.util.List;

public interface BillService {

    double findTotalBillForJune();
    List<Bill> findAllBills();
    List<Bill> findBillsOver1500();
    double findAverageBillsOver1500();
    void add(Bill bill);
}
