# Autor: Jorge Luis Barrios Mejia
@stories
Feature: As a new user, I want to register on the Utest page.
  @scenario1
  Scenario: Successful user registration
    Given Jorge wants to register on the platform
    When the user completes all the information in the form
    | strFirstName | strLastName | strEmail             | strBirthMonth | strBirthDay | strBirthYear | strCity  | strZip | strCountry | strPassword |
    | Jorge        | Luis        | mcenf2031@gmail.com  | December      | 27          | 1984         | Bogotá   | 57091  | Colombia   | Clave32101*   |
    Then registration is complete when the Complete Setup button appears
    | strFinal       |
    | Complete Setup |

