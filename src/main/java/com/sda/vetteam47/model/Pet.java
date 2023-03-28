package com.sda.vetteam47.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "pet_name")
    private String petName;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "race")
    private String race;
    @Column(name = "is_vaccinated")
    private boolean isVaccinated;
    @Column(name = "owner_name")
    private String ownerName;
    @OneToMany(mappedBy = "pet")
    private List<Consult> consults;

    public Pet() {
    }

    public Pet(String petName, String birthDate, String race, boolean isVaccinated, String ownerName) {
        this.petName = petName;
        this.birthDate = birthDate;
        this.race = race;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Consult> getConsults() {
        return consults;
    }

    public void setConsults(List<Consult> consults) {
        this.consults = consults;
    }

    @Override
    public String toString() {
        return "Pet " +
                "id:" + id +
                ", pet_name: " + petName +
                ", birth_date: " + birthDate +
                ", race: " + race +
                ", isVaccinated: " + isVaccinated +
                ", ownerName: " + ownerName +
                "; ";
    }
}
