package be.cegeka.cleancode.domain.Customer;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

//    public void addLoyaltyToCustomer(int customerId, int loyaltyId){
//        entityManager.createQuery("SELECT loyaltyId FROM customers WHERE id=customerId ADD loyaltyId");
//    }



    public List<Customer> getAllCustomers() {
        return entityManager.createQuery("SELECT c from Customer c", Customer.class).getResultList();
    }
}

