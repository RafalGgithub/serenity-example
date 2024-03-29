Feature: Rockwell homework

  Scenario: Searching flats for rent
    Given User opens homepage
    And User accepts cookie policy
    When User picks Wynajmę option
    And User inputs Katowice city
    And User inputs from 500 to 8000 price range
    And User filters z 7 dni advanced filtering option
    And User clicks search button