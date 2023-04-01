package edu.iu.c322.invoiceservice.model;

import edu.iu.c322.orderservice.model.Items;
import edu.iu.c322.orderservice.model.ShippingAddress;

import java.util.ArrayList;

public class InvoiceItem {
    private String status;
    private ArrayList<Items> invoiceItem;
    private String on;
    private ShippingAddress address;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Items> getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(ArrayList<Items> invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public ShippingAddress getAddress() {
        return address;
    }

    public void setAddress(ShippingAddress address) {
        this.address = address;
    }
}
