package com.sda.vetteam47.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vet")
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "speciality")
    private String speciality;

    //@OneToMany(mappedBy = "vet")
    //private List<Consult> consults;
    public Vet() {
    }

    public Vet(String firstName, String lastName, String address, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.speciality = speciality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Vet " +
                "id: " + id +
                ", firstName:" + firstName +
                ", lastName: " + lastName +
                ", address: " + address +
                ", speciality: " + speciality +
                "; ";
    }
}
