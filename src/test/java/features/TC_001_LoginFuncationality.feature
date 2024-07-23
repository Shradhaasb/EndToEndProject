Feature: Validateloginfuncationality

  Scenario: LoginFunctionalitytobetested
    Given UserisonLoginPageusing "Chrome"
    When UserentersUsernameandPassword
    Then UserclicksonLoginbutton

  Scenario: ValidateHomePageFuncationality
    Then UserenterstheHomePage
    And UserverifytheURLandLogo
