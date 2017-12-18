package com.meylinagunawan.dao;

import com.meylinagunawan.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductService {
    
    @PersistenceUnit
    EntityManagerFactory emf;
    EntityManager em;
    public List<Product> showAllProduct(){
        em = emf.createEntityManager();
        List<Product> products = em.createQuery("select t from Product t").getResultList();
            
        return products;
    }
}
