#Author: abhinav.dev@gmail.com
#Scenario: Logout from Amazon web application

@tag
Feature: Check log out from Amazon
  I want to use this template for my feature file

  
  Background: Login to Amazon portal
    Given Amazon portal is launched
    When navigate to login page
    And enter user id
    And enter password and click on submit
    Then user clicks on profile
    And user is able to login successfully
    
  @test
  Scenario: Logout from Amazon portal
    Given user is at home page
    When user hovers on 'Account and Lists' link
    And user clicks on logout link
    Then user successfully logs out

  