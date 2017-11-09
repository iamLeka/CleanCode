package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.Customer.CustomerService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class CustomercontrollerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private Customercontroller customerController;

    @Mock
    private CustomerService customerService;

    @Test
    public void whenAddCustomer_shouldActivateAddCustomerInUserService() throws Exception{
        customerController.addCustomer("Len");
        verify(customerService).addCustomer("Len");
    }

}
