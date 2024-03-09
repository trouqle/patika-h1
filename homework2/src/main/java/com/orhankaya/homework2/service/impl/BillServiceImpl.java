package com.orhankaya.homework2.service.impl;

import com.orhankaya.homework2.entity.Bill;
import com.orhankaya.homework2.entity.Customer;
import com.orhankaya.homework2.service.BillService;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BillServiceImpl implements BillService {

    private final List<Bill> bills;

    public BillServiceImpl(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public double findTotalBillForJune() {
        return this.findAllBills()
                .stream()
                .filter(Bill -> Bill.getBillDateTime().getMonth().equals(Month.JUNE))
                .mapToDouble(Bill::getTotalPrice).sum();

    }

    @Override
    public List<Bill> findAllBills() {

        return bills.stream()
                .map(bill -> new Bill(bill.getId(),
                        bill.getBillDateTime(),
                        bill.getTotalPrice(),
                        bill.getOrder()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Bill> findBillsOver1500() {

        return bills.stream()
                .filter(bill -> bill.getTotalPrice() > 1500)
                .map(bill -> new Bill(bill.getId(),
                        bill.getBillDateTime(),
                        bill.getTotalPrice(),
                        bill.getOrder()))
                .collect(Collectors.toList());
    }

    @Override
    public double findAverageBillsOver1500() {
        return findAllBills().stream()
                .filter(bill -> bill.getTotalPrice()>1500)
                .mapToDouble(Bill::getTotalPrice)
                .average()
                .orElse(0.0);
    }

    @Override
    public void add(Bill bill) {
        bills.add(bill);
    }
}
