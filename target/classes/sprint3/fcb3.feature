@tag
Feature: Creation des authentification sur facebook avec des cas passants et non passante

  @tag1
  Scenario Outline: authentification passante et pas passante
    Given ouvrir le navigateur
    And ouvrir URLs fcb
    When saisir le prénoms "<Prenom>"
    And saisir le nom de Familles "<Nom>"
    And saisir l adresse mails "<adresse Mail>"
    And confirmer l adresse mails "<conf adresse mail>"
    And taper le mot de passe suivants "<MDP>"
    And choisir date de naissances "<jour>"
    And choisi le mois "<mois>"
    And choisi l annee "<annee>"
    And cliquer le genres "<genre>"
    And cliquer sur les boutons inscriress
    Then valider les tests

    Examples: 
      | Prenom | Nom   | adresse Mail    | conf adresse mail | MDP      | jour | mois | annee | genre                              |
      | Amina  | jerbi | amina@gmail.com | amina@gmail.com   | ad123456 |   12 |   10 |  1998 | femme |
      | Alain  | bobo  | bobo            | jojo              | bb125    |   14 |   12 |  2022 | homme |
