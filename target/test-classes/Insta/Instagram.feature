 @tag
  Feature:   Automating the instagram signup page
  Scenario: Entering the user details on signup page

  Given  User on Instagram login page
  When  User enters all Mandatory fields.
  And      Clicks on Signup button 
  Then    Succesful sign in message should be displayed.