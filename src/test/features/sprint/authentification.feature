@tag
Feature: Authentification Admin
  Je vais  m authentifier en tant qu administrateur

  @tag1
  Scenario: Authentification valide
  	Given ouvrir le navigateur
  	And acceder a l URL 
  	When saisir le login
  	And saisir le mot de passe 
  	And cliquer sur le bouton 
  	Then ouvrir page home 
