Feature: testPO

  Scenario Outline: testPO
    Given Chrome is open
    Given userB login page is open
    When userB enter <username> and <password>
    And userB click on login
    Then userB enter home page
    Then userB click logout
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |