package be.cegeka.cleancode.domain.Customer;


import javax.persistence.*;

@Entity
@Table(name = "LOYALTY")

public class Loyalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "barcode")
    private int barcode;
    @Column(name ="bonuspoints")
    private int bonusPoints;


    public Loyalty(int barcode) {
        this.barcode = barcode;
        this.bonusPoints = 0;
    }

    public int getId() {
        return id;
    }
}
