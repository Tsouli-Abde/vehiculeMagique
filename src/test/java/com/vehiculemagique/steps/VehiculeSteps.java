package com.vehiculemagique.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.vehiculemagique.Vehicule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehiculeSteps {

    private Vehicule vehicule;
    private Exception derniereException;

    @Given("un vehicule immatricule {string} avec un kilometrage initial {int}")
    public void unVehiculeImmatriculeAvecUnKilometrageInitial(String immatriculation, int kilometrageInitial) {
        vehicule = new Vehicule(immatriculation);
        vehicule.setKilometrage(kilometrageInitial);
        derniereException = null;
    }

    @When("je roule de {int} km")
    public void jeRouleDeKm(int km) {
        vehicule.rouler(km);
    }

    @When("je tente de rouler de {int} km")
    public void jeTenteDeRoulerDeKm(int km) {
        try {
            vehicule.rouler(km);
        } catch (Exception e) {
            derniereException = e;
        }
    }

    @Then("le kilometrage vaut {int}")
    public void leKilometrageVaut(int attendu) {
        assertEquals(attendu, vehicule.getKilometrage());
    }

    @Then("une exception IllegalArgumentException est levee")
    public void uneExceptionIllegalArgumentExceptionEstLevee() {
        assertNotNull(derniereException, "Une exception aurait dû être levée");
        assertTrue(derniereException instanceof IllegalArgumentException);
    }
}
