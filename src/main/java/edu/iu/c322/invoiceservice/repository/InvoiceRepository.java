package edu.iu.c322.invoiceservice.repository;

import edu.iu.c322.invoiceservice.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {


    private List<Invoice> invoices = new ArrayList<>();



    public List<Invoice> findAll() {
        return invoices;
    }

    public Invoice getInvoice(int id) {
        return invoices.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }

    public void update(int id, String status) {
        Invoice x = getInvoice(id);

        if(x!=null){
            x.setStatus(status);


        }
        else{
            throw new IllegalStateException("Order item with this id does not exist in the system");
        }


    }
}
