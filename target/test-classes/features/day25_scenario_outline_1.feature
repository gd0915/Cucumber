@scenario_outline
Feature: search_feature
  Background: user_goes_to_google_page
    Given user is on the google home page

  Scenario Outline: search_scenario
    When user search for "<search_item>" on google
    Then verify page title contains "<search_item>"
    Then close the application

    Examples: test_data
      | search_item |
      | tesla       |
      | nio         |
      | mercedes    |
      | bmw         |
      | lexus       |
      | acura       |




#    Scenario outline can be used instead of scenario
#    It will complain if we do not use Examples: keyword
#    One difference between parameterizing and scenario outline is that we should also use angle bracket "<search_item>" to hold the test data
#    Scenario outline also uses parameter
#    It is easier and shorter way to run multiple test cases/scenarios with different parameter