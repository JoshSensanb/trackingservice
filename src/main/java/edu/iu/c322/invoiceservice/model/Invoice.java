package edu.iu.c322.invoiceservice.model;

import java.util.ArrayList;
import edu.iu.c322.orderservice.model.Items;
import edu.iu.c322.orderservice.model.Payment;


public class Invoice {

    private int id;
    private String orderPlaced;
    private float total;

    private String status;

    private Payment payment;

    public String getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(String orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
