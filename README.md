# 🚗 L'Odyssée du Véhicule Magique

Bienvenue, voyageur ! Ce n'est pas simplement du code que vous voyez ici, mais le grimoire numérique d'un **Véhicule Magique**.

Ce projet a pour vocation d'initier les apprentis sorciers (vous !) aux arcanes de la **Programmation Orientée Objet**, en donnant vie à un véhicule capable de prouesses extraordinaires.

---

## 📖 Le Livre des Légendes (Fonctionnalités)

Découvrez les aventures que notre véhicule peut vivre. Chaque chapitre raconte une histoire, et pour les plus curieux, un parchemin magique (User Story) détaille les règles de l'univers.

### Chapitre 1 : La Route Infinie 🛣️
Notre véhicule est un explorateur né. Il parcourt le monde, et son compteur garde la mémoire de chaque lieue traversée.
Mais attention ! Le temps ne s'inverse pas, et notre véhicule ne peut pas "dé-rouler" pour rajeunir. Toute tentative de reculer le compteur (kilomètres négatifs) se heurtera à une barrière magique.

📜 **Le Parchemin des Règles (Specs) :**
👉 **[Lire l'histoire complète (Feature Suivi Kilométrage)](src/test/resources/features/SuiviKilometrage.feature)**

### Chapitre 2 : Le Pacte du Cavalier 🤝
Un véhicule sans conducteur est une âme en peine. Il cherche son compagnon de route. Une fois le pacte scellé, le véhicule connaît son propriétaire, et le propriétaire peut veiller sur sa monture. C'est une alliance sacrée.

📜 **Le Parchemin des Règles (Specs) :**
👉 **[Lire l'histoire complète (Feature Association Propriétaire)](src/test/resources/features/AssocierProprietaire.feature)**

### Chapitre 3 : Le Tribut de la Protection 🛡️
Dans ce monde, la sécurité a un prix. Mais pas n'importe lequel ! Le coût de la protection (l'assurance) est calculé par une formule alchimique précise, basée sur l'expérience du véhicule (son kilométrage). Plus il a voyagé, plus le tribut évolue.

📜 **Le Parchemin des Règles (Specs) :**
� **[Lire l'histoire complète (Feature Calcul Assurance)](src/test/resources/features/CalculAssurance.feature)**

---

## 🧙‍♂️ Le Coin des Sorciers (Guide Technique)

Pour ceux qui souhaitent voir les rouages internes ou modifier l'enchantement, voici les instructions du grand œuvre.

### 🏗 Architecture
L'univers repose sur deux piliers (classes) :
*   `Vehicule` : L'entité centrale, gardienne du kilométrage.
*   `Proprietaire` : L'entité humaine, capable de calculer le coût de l'assurance.

### 🧪 Rituels de Vérification (Tests)
Pour vous assurer que la magie opère sans failles, lancez les incantations suivantes dans votre terminal :

```bash
mvn test
```

Cette commande invoquera :
1.  Les **Tests Unitaires** (JUnit) pour la solidité des briques de base.
2.  Les **Scénarios Cucumber** (les parchemins cités plus haut) pour vérifier que l'histoire se déroule comme prévu.

### 🚀 Lancement Rapide (BlueJ)
Si vous préférez une manipulation directe :
1.  Ouvrez le projet dans **BlueJ**.
2.  Faites un clic droit sur `Vehicule` pour en invoquer un nouveau (`new Vehicule()`).
3.  Jouez avec lui ! Faites-le rouler, assignez-lui un propriétaire, et observez la magie opérer sous vos yeux.

---
*Fait avec ❤️ et un peu de poussière de fée.*
