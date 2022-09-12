package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="owners_id")
    private Set<Person> owners;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(Integer number){
        this.number = number;
    }
    public Set<Person> getOwners() {
        return owners;
    }
    public void setOwners(Set<Person> owners){
        this.owners = owners;
    }

}
