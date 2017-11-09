package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.Customer.CustomerService;
import be.cegeka.cleancode.domain.Customer.LoyaltyService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;
public class LoyaltyControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private LoyaltyController loyaltyController;

    @Mock
    private LoyaltyService loyaltyService;

    @Test
    public void whenAddLoyalty_shouldActivateAddLoyaltyInLoyaltyService() throws Exception{
        loyaltyController.addLoyalty(123456);
        verify(loyaltyService).addLoyalty(123456);
    }

}