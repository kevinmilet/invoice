package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.List;

/**
 * @author k.milet
 */
public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
}
