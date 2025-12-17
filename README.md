# 🚗 Projet Véhicule Magique

Ce projet est une application Java conçue pour illustrer les concepts fondamentaux de la **Programmation Orientée Objet (POO)**. Il modélise la gestion d'un véhicule, de son propriétaire et simule des interactions métier comme le calcul d'assurance.

Le développement a été réalisé avec l'environnement **BlueJ**, permettant une interaction directe avec les objets.

---

## 📋 Description

L'application repose sur deux classes principales qui interagissent entre elles. Elle permet de simuler le cycle de vie d'un véhicule (création, déplacement, changement de propriétaire) et d'effectuer des calculs basés sur son état.

### Fonctionnalités principales :
* **Modélisation d'objets :** Création d'instances de véhicules et de propriétaires.
* **Simulation de comportement :** Méthode pour faire "rouler" le véhicule et incrémenter son kilométrage.
* **Gestion des erreurs :** Protection contre les entrées invalides (ex: distance négative).
* **Collaboration entre classes :** Calcul de coûts basé sur les attributs d'un autre objet.

---

## 🏗 Architecture du Code

### 1. Classe `Vehicule`
C'est la classe centrale du projet.
* **Attributs :**
    * `immatriculation` (String) : Identifiant unique du véhicule.
    * `kilometrage` (int) : Initialisé à **0** par défaut dans le constructeur.
    * `proprietaire` (Proprietaire) : Référence vers l'objet propriétaire (association 0..1).
* **Méthodes clés :**
    * `rouler(int km)` : Ajoute la distance `km` au kilométrage total. Lève une `IllegalArgumentException` si `km < 0`.
    * `setProprietaire(Proprietaire p)` : Définit le lien vers le propriétaire.

### 2. Classe `Proprietaire`
Représente le possesseur du véhicule.
* **Attributs :**
    * `nom` (String) : Le nom de la personne.
* **Méthode de collaboration :**
    * `calculerAssuranceAnnuelle(Vehicule v)` : Calcule le coût de l'assurance en fonction du kilométrage du véhicule passé en paramètre.

### 📊 Logique Métier (Formule)

Le calcul de l'assurance annuelle suit la formule suivante :

$$
Coût = 300 + \left( \frac{\text{Kilométrage du véhicule}}{1000} \right)
$$

---

## 🔗 Relations entre les classes

Le projet met en œuvre une **association unidirectionnelle** avec une multiplicité **0..1 vers 0..1**.
* Le `Vehicule` connaît son `Proprietaire`.
* Le `Proprietaire` ne stocke pas le véhicule comme attribut, mais l'utilise via ses méthodes (dépendance).


---

## 🧪 Tests automatisés (JUnit & Cucumber)

Le projet est désormais bâti avec **Maven**. Deux types de tests sont exécutés via `mvn test` :

1. **Tests unitaires JUnit 5**
   * La classe `src/test/java/com/vehiculemagique/VehiculeTest.java` vérifie les règles de base (initialisation, incrément du kilométrage, erreur sur distance négative, etc.).
2. **Scénarios Cucumber**
   * Les scénarios Gherkin vivent dans `src/test/resources/features/vehicule.feature`.
   * Les steps sont définis dans `src/test/java/com/vehiculemagique/steps/VehiculeSteps.java` et exécutés par `VehiculeCucumberTest`.

Exemple de commande :

```bash
mvn test
```

La sortie affiche les résultats détaillés des scénarios et des tests unitaires.

---

## 🚀 Utilisation avec BlueJ

Le projet est optimisé pour l'environnement BlueJ, permettant :
1.  L'**instanciation interactive** (clic droit sur la classe -> `new Vehicule()`).
2.  L'**inspection des objets** pour voir l'état interne (kilométrage, références).
3.  L'**appel de méthodes** direct via l'interface graphique (ex: appeler `rouler(120)`).

> **Note :** La compilation réussie dans BlueJ est indiquée par l'absence de hachures sur les classes.
