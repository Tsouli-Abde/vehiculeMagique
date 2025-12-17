Feature: Suivi du kilometrage d'un vehicule
  En tant que utilisateur
  Je veux faire rouler un vehicule
  Afin de suivre son kilometrage

  Scenario: Rouler augmente le kilometrage
    Given un vehicule immatricule "AA-123-BB" avec un kilometrage initial 0
    When je roule de 100 km
    And je roule de 50 km
    Then le kilometrage vaut 150

  Scenario: Rouler avec une distance negative est refuse
    Given un vehicule immatricule "AA-123-BB" avec un kilometrage initial 0
    When je tente de rouler de -10 km
    Then une exception IllegalArgumentException est levee