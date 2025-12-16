# 🚗 Classe Vehicule

## Description
La classe **Vehicule** est un composant Java simple modélisant un véhicule terrestre. Elle permet de gérer les informations de base d'un véhicule, notamment son immatriculation (plaque) et son kilométrage total parcouru.

Ce projet est idéal pour comprendre les concepts d'encapsulation, d'accesseurs/mutateurs (getters/setters) et la gestion d'exceptions simples en Java.

## 📋 Fonctionnalités

* **Gestion de l'immatriculation :** Attribution et lecture du numéro de plaque.
* **Suivi du kilométrage :** Lecture et modification du kilométrage courant.
* **Simulation de déplacement :** La méthode `rouler()` permet d'ajouter des kilomètres au compteur de manière cumulative.
* **Sécurité des données :** La méthode `rouler()` empêche l'ajout de distances négatives via une exception.

---

## 🛠️ Installation et Compilation

Assurez-vous d'avoir le [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) installé.

1.  Enregistrez le code dans un fichier nommé `Vehicule.java`.
2.  Ouvrez votre terminal ou invite de commande.
3.  Compilez le fichier :

```bash
javac Vehicule.java
