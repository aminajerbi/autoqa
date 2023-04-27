@tag
Feature: authentification cas passant et cas non passant

  @tag2
  Scenario Outline: connexion cas passant et non passant
    Given ouvrir le navigateurs
    And acceder a l URLs
    When saisir le logins "<LOGIN>"
    And saisir le mot de passes "<MDP>"
    And cliquer sur le boutons
    Then ouvrir page homes

    Examples: 
      | LOGIN  | MDP       |
      | Admin  | admin123  |
      | log    | admin123  |
      | Admin  | test2023  |
      | log123 | test45684 |
