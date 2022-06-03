Feature: Account Management


  Scenario Outline: To verify valid username and password
    Given user is on Luma homepage
    When user enters "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And  user clicks on Create an Account button
    Then user homepage should be displayed







    Examples:

    |FirstName| |LastName| |Email| |Password| |ConfirmPassword|
    |Chris    | |Rock    | |chris.rock@gmail.com| |chris1990| |chris1990|