package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.CustomerRepositoryInterface;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author k.milet
 */
@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepository = invoiceRepositoryInterface;
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
//        Iterable<Invoice> invoices = invoiceRepository.findAll();
//        // Permet d'initailiser le cilent de chaque facture
//        invoices.forEach(invoice -> invoice.getCustomer().getName());

//        return invoices;
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }

    @Transactional
    public Invoice createInvoice(Invoice invoice) {
        customerRepository.save(invoice.getCustomer());
        return invoiceRepository.save(invoice);
    }
}
