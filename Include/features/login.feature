#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Test Swaglab
  I want to login and validation sucess login in swaglab website

  Scenario Outline: I want to login and validation sucess login in swaglab
    Given user visit the swaglab url
    When user input <username> and <password>
    And user click login button
    Then system will validation user have the login

    Examples: 
      | username                        | password                 |
      | barcanaufal@gmail.com           | nhpo3vJDjqfVDW06cn/RPw== |
      | ammarwalker@example.com         | nhpo3vJDjqfVDW06cn/RPw== |
