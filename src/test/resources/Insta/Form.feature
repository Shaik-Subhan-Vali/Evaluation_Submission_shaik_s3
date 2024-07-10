 @tags1
  Feature:   Automating the simple form page
  Scenario: Entering all the mandatory details on simple form page

  Given  User on simple form page
  When  User enters all Mandatory fields
  And  User enters text in message field
  And  Clicks on submit button 
  Then  Thank you should be displayed.