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


## ✨ Seconde Itération — Les Épreuves Avancées du Véhicule Magique

Après avoir maîtrisé les premiers sortilèges, notre Véhicule Magique a dû affronter des épreuves plus subtiles, réservées aux mages confirmés. Cette seconde itération raconte comment l’univers a gagné en profondeur, en robustesse et en sagesse.

### 🧩 Épreuve 14 — Le Lien Sacré
**Association bidirectionnelle 0..1 ↔ \***

Jusqu’ici, le pacte entre le véhicule et son propriétaire était simple. Mais le monde réel est plus complexe :
- un **propriétaire peut posséder plusieurs véhicules**,
- un **véhicule ne peut avoir qu’un seul propriétaire (ou aucun)**.

Un lien bidirectionnel **0..1 ↔ \*** a donc été instauré entre `Vehicule` et `Proprietaire`.
Ce lien a été **soigneusement encapsulé** afin de garantir la cohérence des deux côtés. Deux gardiens (méthodes) veillent au grain :
- `Vehicule.setProprietaire(Proprietaire)` : Le point d'entrée principal.
- `Proprietaire.ajouterVehicule(Vehicule)` : Une autre voie pour sceller le pacte.

Des **tests unitaires dédiés** (`ProprietaireVehiculeAssociationTest`) vérifient que si j'achète une voiture, elle sait que je suis son propriétaire, et je sais qu'elle est à moi.

### 🔧 Épreuve 15 — L’Art du Raffinement
**Techniques de refactoring**

Un bon sorcier sait que la puissance ne suffit pas : le code doit rester **clair et élégant**.

Deux techniques de refactoring ont été appliquées :

#### 🔹 Rename
La méthode qui fait avancer le véhicule a été renommée pour être plus précise.
*   *Avant* : `rouler()` (C'était vague...)
*   *Maintenant* : `ajouterKilometres()` (C'est clair !)

#### 🔹 Extract Method
La logique de calcul du surcoût d'assurance était cachée au milieu d'une formule. Elle a été extraite dans une méthode privée `calculerSurcoutKilometrique` dans la classe `Proprietaire`.
*Gain* : La formule principale est plus lisible, et le détail du calcul est isolé.

### 🧪 Épreuve 16 — La Malédiction du « Test Infected »

En parcourant le site officiel de **JUnit** et en lisant l’article mythique *« Test Infected »* de Beck et Gamma, une vérité s’est imposée :

> Un développeur doit devenir dépendant de ses tests.

Pour adapter cette philosophie, nous avons invoqué des **Tests Paramétrés** (`VehiculeParameterizedTest`).
Au lieu d'écrire 50 fois le même test pour 50 distances différentes, nous donnons une liste de cas au test :
*   `0 + 100 + 50 = 150`
*   `10 + 0 + 5 = 15`
...et le test s'exécute pour chacun d'eux. Magique !

### 🖥️ Épreuve 17 — Le Rituel de l’Invocation
**Exécution des tests en ligne de commande**

Un sort n’est véritablement fiable que s’il fonctionne hors de l’IDE. Les tests ont été exécutés via la commande suprême :

```bash
mvn test
```

### 🍀 Épreuve 18 — La Loi de Murphy

> "Tout ce qui est susceptible de mal tourner tournera mal."

Dans notre péripétie, cela s'est vérifié : nous pensions avoir tout prévu, mais qu'arrive-t-il si on essaie d'ajouter un véhicule `null` à un propriétaire ? Ou de retirer un véhicule qui ne nous appartient pas ?
Heureusement, nos gardes-fous (les exceptions et les checks dans le code) étaient là pour empêcher le chaos.
