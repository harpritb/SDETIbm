@retailm
Feature: Register user

  @register
  Scenario: To verify whether application allows the user to get registered
    Given launch the application
    When hover on login/register
    And user clicks on Resister
    And Enters the details
      | firstname | Harprit                 |
      | lastname  | Bedwal                  |
      | E-mail    | harprit.bedwal@test.com |
      | telephone | 9123                    |
      | address1 | test                    |
      | address2 | test                    |
      | city      | delhi                   |
      | postcode  | delhi                   |
    And click continue
    Then user should able to reister successfully
    
    @login
    Scenario: To verify registered user login
    Given launch the application
    When hover on login/register
    And user enters valid credentials
    | email | harprit.bedwal182@test.com|
    | password | Com@2468 |
    And clicks login
    Then user should redirect to My accounts page
