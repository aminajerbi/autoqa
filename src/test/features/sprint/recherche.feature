
@tag
Feature: Recherche Tunisie
  Je souhaite rechercher le mot environ dans le msg

  @tag1
  Scenario: Recherche Tunisie
    Given Ouvrir navigateur 
    And chercher URL
    When taper le mot "Tunisie" 
    And cliquer sur le bouton entrer
    Then ouvrir page de recherche 
    

 