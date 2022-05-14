package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author k.milet
 */
//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static final List<Invoice> invoices = new ArrayList<>();

    public Invoice create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added in memory with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
        return invoice;
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }
}
