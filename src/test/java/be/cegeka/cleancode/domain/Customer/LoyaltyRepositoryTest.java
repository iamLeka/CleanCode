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

public class LoyaltyRepositoryTest {
    @Inject
    private LoyaltyRepository loyaltyRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void whenLoyaltyAdded_checkIfLoyaltyIsActuallyAdded()throws Exception{
        Loyalty supahDupah = new Loyalty(123456);
        loyaltyRepository.addLoyalty(supahDupah);
        Assertions.assertThat(entityManager.find(Loyalty.class, supahDupah.getId())).isEqualTo(supahDupah);
    }
}