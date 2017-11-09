package be.cegeka.cleancode.domain.Customer;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class CustomerServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void whenCustomerServiceaddCustomerIsCalled_ShouldActivatedCustomerRepositaryAddCustomer() throws Exception {
        customerService.addCustomer("Len");
        verify(customerRepository).addCustomer(Mockito.refEq(new Customer("Len")));
    }
}