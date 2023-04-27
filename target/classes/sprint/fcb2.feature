
@tag
Feature: Inscrire sur la page facebook
	je veux faire un compte facebbok 

  @tag1
  Scenario: Authentification Valide 
    Given ouvrir le navigateur 
    And ouvrir URL fcb
    When saisir le prénom "Amina"
    And saisir le nom de Famille "Jerbi"
    And saisir l adresse mail "amina.jerbi@gmail.com"
    And confirmer l adresse mail "amina.jerbi@gmail.com" 
    And taper le mot de passe suivant "123456"
    And choisir date de naissance "17"
    And choisir le mois "Juillet"
    And choisir l annee "1988"
    And cliquer le genre 
    And  cliquer sur le bouton inscrire 
    Then valider le test