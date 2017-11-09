package be.cegeka.cleancode.domain.Customer;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class LoyaltyServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private LoyaltyService loyaltyService;

    @Mock
    private LoyaltyRepository loyaltyRepository;

    @Test
    public void whenLoyaltyServiceAddLoyaltyIsCalled_shouldActivateLoyaltyRepositoryAddLoyalty() throws Exception{
        loyaltyService.addLoyalty(123456);
        verify(loyaltyRepository).addLoyalty(Mockito.refEq(new Loyalty(123456)));
    }

}