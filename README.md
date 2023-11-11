# Gestion des Interventions Mécaniques

Cette application a été développée en Java dans le cadre d'un atelier de réparation mécanique. Elle permet de gérer les interventions sur des véhicules, les employés, les clients, et les différents aspects liés à la mécanique automobile.

## Partie I : Conception et Modélisation

### 1. Modélisation Orientée Objet

Nous avons utilisé une approche orientée objet pour modéliser les entités du système. Les principaux composants sont :
- **Intervention**: avec un numéro unique, un type, une date de début et de fin, et un coût.
- **Employé**: caractérisé par un numéro d'employé, un nom, un prénom, une catégorie, un salaire, et une date d'installation.
- **Véhicule**: identifié par un numéro d'immatriculation, un modèle, une année de première mise en circulation, et le numéro du client.
- **Modèle et Marque**: utilisés pour détailler les caractéristiques des véhicules.
- **Client**: caractérisé par un numéro, un nom, un prénom, une civilité, une date de naissance, une adresse, et des numéros de téléphone.

### 2. Ajout de l'attribut "date d'installation" dans l'entité "Employé"

Nous avons ajouté l'attribut "date d'installation" à l'entité "Employé" pour enregistrer la date à laquelle l'employé a été installé dans l'atelier. Cela peut être utile pour suivre l'ancienneté des employés.


### 4. Contrôle sur la validité de la période d'intervention

Nous avons ajouté un contrôle au niveau de la classe "Intervention" pour s'assurer que la date de début est inférieure à la date de fin, garantissant ainsi la validité de la période d'intervention.

### 5. Méthodes et/ou attributs supplémentaires pour les actions demandées

a. **Chargement des données**
   - Méthode pour créer et instancier les objets à partir d'une source de données (base de données, fichiers texte, saisie au clavier).

b. **Augmentation de salaire**
   - Méthode pour augmenter le salaire d'un employé donné.

c. **Rajout de jours aux interventions de Février**
   
d. **Suppression des véhicules du modèle precis
   - Méthode pour supprimer tous les véhicules d'un modèle x avec gestion des répercussions sur les données.

e. **Liste des modèles et leur marque**
   - Méthode pour lister les modèles et leur marque.

f. **Liste des véhicules avec au moins une intervention**
   - Méthode pour lister les véhicules ayant subi au moins une intervention.

g. **Liste des employés dont le nom commence par un T**
   - Méthode pour lister les employés dont le nom commence par un T.

h. **Liste des interventions faites par l'employé nommé LACHEMI**
   - Méthode pour déterminer la liste des interventions faites par l'employé nommé LACHEMI.

i. **Liste des interventions faites en mois de Mars**
   - Méthode pour lister les interventions faites en mois de Mars.

j. **Récompense des meilleurs employés de l'année **
   - Méthode pour récompenser les trois meilleurs employés ayant effectué le maximum d'interventions dans l'année.

k. **Privilège des clients les plus fidèles **
   - Méthode pour privilégier les trois clients les plus fidèles ayant sollicité le maximum d'interventions.

## Partie II : Implémentation

### 1. Codes d'implémentation

Les codes d'implémentation correspondant à la modélisation sont disponibles dans les classes respectives du projet.

### 2. Classe Application

Une classe Application contenant un point d'entrée "main" a été ajoutée pour permettre l'exécution des actions demandées.

### 3. Interface Graphique 

Une interface graphique et un menu textuel dans la console a été implémenté pour déclencher les différentes actions.

N'hésitez pas à explorer le code source et à contribuer à l'amélioration de cette application de gestion des interventions mécaniques. Merci de votre intérêt !

## Demo 
<img width="695" alt="image" src="https://github.com/Zvki1/Gestion-des-Interventions-M-caniques/assets/98493579/df8bd597-7e80-4c06-a892-785819da28c6">

