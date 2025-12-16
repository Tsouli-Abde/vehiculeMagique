# 🚗 Projet Véhicule Magique

Ce projet est une application Java conçue pour illustrer les concepts fondamentaux de la **Programmation Orientée Objet (POO)**. [cite_start]Il modélise la gestion d'un véhicule, de son propriétaire et simule des interactions métier comme le calcul d'assurance[cite: 1, 3, 132].

[cite_start]Le développement a été réalisé avec l'environnement **BlueJ**, permettant une interaction directe avec les objets[cite: 48, 56].

---

## 📋 Description

L'application repose sur deux classes principales qui interagissent entre elles. [cite_start]Elle permet de simuler le cycle de vie d'un véhicule (création, déplacement, changement de propriétaire) et d'effectuer des calculs basés sur son état[cite: 11, 216].

### Fonctionnalités principales :
* **Modélisation d'objets :** Création d'instances de véhicules et de propriétaires.
* **Simulation de comportement :** Méthode pour faire "rouler" le véhicule et incrémenter son kilométrage.
* **Gestion des erreurs :** Protection contre les entrées invalides (ex: distance négative).
* **Collaboration entre classes :** Calcul de coûts basé sur les attributs d'un autre objet.

---

## 🏗 Architecture du Code

### 1. Classe `Vehicule`
[cite_start]C'est la classe centrale du projet[cite: 3].
* **Attributs :**
    * [cite_start]`immatriculation` (String) : Identifiant unique du véhicule[cite: 20].
    * [cite_start]`kilometrage` (int) : Initialisé à **0** par défaut dans le constructeur[cite: 28].
    * [cite_start]`proprietaire` (Proprietaire) : Référence vers l'objet propriétaire (association 0..1)[cite: 156, 170].
* **Méthodes clés :**
    * `rouler(int km)` : Ajoute la distance `km` au kilométrage total. [cite_start]Lève une `IllegalArgumentException` si `km < 0`[cite: 39, 42].
    * [cite_start]`setProprietaire(Proprietaire p)` : Définit le lien vers le propriétaire[cite: 173].

### 2. Classe `Proprietaire`
[cite_start]Représente le possesseur du véhicule[cite: 132].
* **Attributs :**
    * [cite_start]`nom` (String) : Le nom de la personne[cite: 141].
* **Méthode de collaboration :**
    * [cite_start]`calculerAssuranceAnnuelle(Vehicule v)` : Calcule le coût de l'assurance en fonction du kilométrage du véhicule passé en paramètre[cite: 238].

### 📊 Logique Métier (Formule)

[cite_start]Le calcul de l'assurance annuelle suit la formule suivante[cite: 241]:

$$
Coût = 300 + \left( \frac{\text{Kilométrage du véhicule}}{1000} \right)
$$

---

## 🔗 Relations entre les classes

[cite_start]Le projet met en œuvre une **association unidirectionnelle** avec une multiplicité **0..1 vers 0..1**[cite: 150, 151].
* Le `Vehicule` connaît son `Proprietaire`.
* Le `Proprietaire` ne stocke pas le véhicule comme attribut, mais l'utilise via ses méthodes (dépendance).

---

## 🧪 Tests Unitaires (JUnit)

La fiabilité du code est assurée par la classe de test `VehiculeTest`. [cite_start]Une méthode `setUp()` (@BeforeEach) est utilisée pour créer une "fixture" propre avant chaque test (un véhicule "AA-123-BB" et un propriétaire "Lilia")[cite: 96, 266].

| Scénario de Test | Description | Résultat Attendu |
| :--- | :--- | :--- |
| **Initialisation** | [cite_start]Vérifie l'état initial de l'objet après construction[cite: 88]. | Kilométrage = 0, Immatriculation correcte. |
| **Rouler** | [cite_start]Vérifie l'incrémentation du compteur[cite: 89]. | 100 km + 50 km = 150 km. |
| **Rouler Négatif** | [cite_start]Tente de faire rouler le véhicule avec une distance négative (-10)[cite: 90]. | Lève une `IllegalArgumentException`. |
| **Modification** | [cite_start]Teste le changement d'immatriculation via le setter[cite: 92]. | La nouvelle immatriculation est bien enregistrée. |
| **Collaboration** | [cite_start]Teste le calcul d'assurance après un trajet de 2500 km[cite: 303, 326]. | Coût assurance = 302 (300 + 2500/1000). |

---

## 🚀 Utilisation avec BlueJ

[cite_start]Le projet est optimisé pour l'environnement BlueJ, permettant[cite: 58, 61]:
1.  L'**instanciation interactive** (clic droit sur la classe -> `new Vehicule()`).
2.  L'**inspection des objets** pour voir l'état interne (kilométrage, références).
3.  L'**appel de méthodes** direct via l'interface graphique (ex: appeler `rouler(120)`).

> [cite_start]**Note :** La compilation réussie dans BlueJ est indiquée par l'absence de hachures sur les classes[cite: 48].
