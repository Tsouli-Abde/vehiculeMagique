package com.vehiculemagique.steps;

import com.vehiculemagique.Proprietaire;
import com.vehiculemagique.Vehicule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class VehiculeProprietaireSteps {

    private Vehicule vehicule;
    private Proprietaire proprietaire;

    @Given("un vehicule immatricule {string} sans proprietaire")
    public void unVehiculeImmatriculeSansProprietaire(String immat) {
        vehicule = new Vehicule(immat);
    }

    @Given("un proprietaire nomme {string}")
    public void unProprietaireNomme(String nom) {
        proprietaire = new Proprietaire(nom);
    }

    @When("j associe le proprietaire au vehicule")
    public void jAssocieLeProprietaireAuVehicule() {
        vehicule.setProprietaire(proprietaire);
    }

    @Then("le proprietaire du vehicule est {string}")
    public void leProprietaireDuVehiculeEst(String nom) {
        assertNotNull(vehicule.getProprietaire());
        assertEquals(nom, vehicule.getProprietaire().getNom());
    }

    @Then("le vehicule n a pas de proprietaire")
    public void leVehiculeNaPasDeProprietaire() {
        assertNull(vehicule.getProprietaire());
    }
}