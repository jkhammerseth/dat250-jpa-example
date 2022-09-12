package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Set<Address> addresses;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "creditCard_id")
    private Set<CreditCard> creditCards;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Set<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<Address> addresses){
        this.addresses = addresses;
    }
    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
