package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.Customer.Customer;
import be.cegeka.cleancode.domain.Customer.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping(path = "/customer")
@Transactional
public class Customercontroller {

    @Inject
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    @PostMapping
    public void addCustomer(
            @RequestParam(value = "firstName", required = true) String firstName) {
        customerService.addCustomer(firstName);
    }

}
