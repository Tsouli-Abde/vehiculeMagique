package com.vehiculemagique.steps;

import com.vehiculemagique.Proprietaire;
import com.vehiculemagique.Vehicule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculeAssuranceSteps {

    private Vehicule vehicule;
    private Proprietaire proprietaire;
    private int coutAssurance;

    @Given("un vehicule immatricule {string} avec un kilometrage initial {int}")
    public void unVehiculeAvecKilometrage(String immat, int km) {
        vehicule = new Vehicule(immat);
        vehicule.setKilometrage(km);
    }

    @Given("un proprietaire nomme {string}")
    public void unProprietaireNomme(String nom) {
        proprietaire = new Proprietaire(nom);
    }

    @When("je calcule l assurance du vehicule")
    public void jeCalculeLAssuranceDuVehicule() {
        coutAssurance = proprietaire.calculerAssuranceAnnuelle(vehicule);
    }

    @Then("le cout de l assurance vaut {int}")
    public void leCoutDeLAssuranceVaut(int attendu) {
        assertEquals(attendu, coutAssurance);
    }
}