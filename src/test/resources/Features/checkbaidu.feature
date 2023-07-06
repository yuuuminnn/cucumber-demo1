Feature: check testurl
@demo
  Scenario: check baidu and search
    Given Open chrome and open url
    When user input search parameters
    And click search butten
    Then valid search deatils
