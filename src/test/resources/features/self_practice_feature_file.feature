@amazon_search
Feature: first practice file
  Background: user_goes_to_amazon_page
    Given user is on the amazon home page

    @heartNecklace_search
    Scenario: TC_01_HeartNecklace_search
      When user search "HeartNecklace" on amazon
      Then verify Results visible on the page
      Then close the application

    @longSleeveShirt_search
    Scenario: TC_02_LongSleeveTShirt_search
      When user search "LongSleeveShirt" on amazon
      Then verify Results visible on the page
      Then close the application