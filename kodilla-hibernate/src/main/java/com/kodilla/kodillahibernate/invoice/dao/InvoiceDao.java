package com.kodilla.kodillahibernate.invoice.dao;


import com.kodilla.kodillahibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
