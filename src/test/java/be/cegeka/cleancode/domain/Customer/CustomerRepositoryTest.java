package be.cegeka.cleancode.domain.Customer;

import be.cegeka.cleancode.Application;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class CustomerRepositoryTest {
    @Inject
    private CustomerRepository customerRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void whenCustomeraddad_CheckIfUserIsaActuallyAdded() throws Exception {
    Customer len = new Customer("Len");
    customerRepository.addCustomer(len);
    Assertions.assertThat(entityManager.find(Customer.class,len.getId())).isEqualTo(len);
    }
}