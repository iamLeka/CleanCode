package be.cegeka.cleancode.domain.Customer;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")

public class Customer {
    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @OneToOne
    @JoinColumn(name="LOYALTY_ID")
    private Loyalty loyalty;


    public Customer(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void addLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }
}
