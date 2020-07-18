@tag
Feature: To validate  the facebook application

  @smoke
  Scenario: To validate the search functionality in amazon app
    Given user launches google chrome and amazon application
    When user seaches laptop  and click seach
    Then user navigates to laptop page

     @sanity
  Scenario: To validate the search functionality in amazon application
    Given user launches google chrome and amazon app
    When user seaches iphone  and click seach
    Then user navigates to iphone page
    
     @retest
  Scenario: To validate the search functionality in amazon
    Given user launches google chrome and amazon 
    When user seaches watches  and click seach
    Then user navigates to watches page