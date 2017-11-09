package be.cegeka.cleancode.domain.Customer;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class LoyaltyService {

    @Inject
    private LoyaltyRepository loyaltyRepository;

    public void addLoyalty(int barcode, int customerId) {
        loyaltyRepository.addLoyalty(new Loyalty(barcode), customerId);
    }
}
