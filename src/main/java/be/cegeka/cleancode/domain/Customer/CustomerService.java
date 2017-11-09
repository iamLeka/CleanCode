package be.cegeka.cleancode.domain.Customer;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    public void addCustomer(String firstName) {
        customerRepository.addCustomer(new Customer(firstName));
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
