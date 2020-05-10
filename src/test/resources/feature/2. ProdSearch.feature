#Author: abhinav.dev@gmail.com
#Comments: Demo project
#Scenario Description: User is able to search product Amazon successfully


@test1
Feature: Product search and check wish list on Amazon

  
  Background: Login to Amazon portal
    Given Amazon portal is launched
    When navigate to login page
    And enter user id
    And enter password and click on submit
    Then user clicks on profile
    And user is able to login successfully
    

  @test @sanity
  Scenario: Product search
    Given input file is available at the path
    When user is at home page
    And user searches for the product
    Then Lists all result on first page and saves the result price in same excel


  @test
  Scenario Outline: Check distinct supplier
    Given user is at home page
    And user searches for the product
    When User filters for "<brand>" in step
    Then Lists result with minimum price on first page

    Examples: 
      | brand  | 
      | Lenovo | 
      | Dell | 

  @test @Sprint100
  Scenario: Check wish list
    Given user is at home page
    When user hovers on 'Account and Lists' link
    And user clicks on 'your wish list' link
    Then user navigates to wish list page
    And print the wish list items on console

