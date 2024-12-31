package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerRepo implements ICustomerRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer> findAll() {
        // JPQL: Java Persistence Query Language
        String jpql = "SELECT c FROM Customer c";

        // HQL: Hibernate Query Language
        // createQuery: truy vấn động
        // createNameQuery : truy vấn tĩnh
        String hql = "FROM Customer c";
        TypedQuery<Customer> query = entityManager.createQuery(jpql, Customer.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        entityManager.persist(customer);
    }
}
