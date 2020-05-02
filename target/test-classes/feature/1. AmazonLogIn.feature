#Author: abhinav.dev@gmail.com
#Comments: Demo project
#Scenario Description: User is able to login and logout from Amazon successfully


#@test1
Feature: Amazon Login 
  
  
  @test1
    Scenario: Login to Amazon portal
    Given Amazon portal is launched
    When navigate to login page
    And enter user id
    And enter password and click on submit
    Then user clicks on profile
    And user is able to login successfully
    


