Feature: testPF

  Scenario Outline: testPF
    Given brower is open
    Given login page is open
    When user enter <username> and <password>
    And user click on login
    Then user enter home page
    Then user click logout
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |