@hookdemo
Feature: check testurl


  Scenario: checkhook1
    Given step1
    When step2
    And step3
    Then step4

  @condition
  Scenario: checkhook2
    Given step1
    When step2
    And step3
    Then step4

  @condition
  Scenario: checkhook3
    Given step1
    When step2
    And step3
    Then step4

