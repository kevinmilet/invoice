package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @author k.milet
 */
public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {

}
