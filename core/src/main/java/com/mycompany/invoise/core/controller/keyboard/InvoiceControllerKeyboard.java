package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

import java.util.Scanner;

/**
 * @author k.milet
 */
//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoice(Invoice invoice) {
        System.out.println("What is the customer name?");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        invoice = new Invoice();
        Customer customer = new Customer(customerName);
        invoice.setCustomer(customer);

        invoiceService.createInvoice(invoice);
        return null;
    }
}
