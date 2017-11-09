package be.cegeka.cleancode.application;


import be.cegeka.cleancode.domain.Customer.LoyaltyService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;


@RestController
@RequestMapping(path = "/loyalty")
@Transactional
public class LoyaltyController {

    @Inject
    private LoyaltyService loyaltyService;


    @PostMapping
    public void addLoyalty(
            @RequestParam(value = "barcode", required = true) int barcode,
            @RequestParam(value = "customerid", required = true) int customerId
    ) {
        loyaltyService.addLoyalty(barcode,customerId);
    }

}
