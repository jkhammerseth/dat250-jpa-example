package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "creditCard_id")
    private Set<CreditCard> creditCards;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<CreditCard> getOwnedCards() {
        return creditCards;
    }
}