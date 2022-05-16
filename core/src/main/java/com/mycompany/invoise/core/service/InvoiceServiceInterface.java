package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

/**
 * @author k.milet
 */
public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
}
