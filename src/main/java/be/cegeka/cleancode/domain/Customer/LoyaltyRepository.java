package be.cegeka.cleancode.domain.Customer;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class LoyaltyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addLoyalty(Loyalty loyalty, int customerid) {
        entityManager.find(Customer.class,customerid).addLoyalty(loyalty);
        entityManager.persist(loyalty);

    }
}
