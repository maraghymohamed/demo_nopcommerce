@smoke
Feature: F08_Wishlist |  user can add item to wishlist
  Scenario: notification
    When user click on add to wishlist button
    Then success notification bar appears to user

  Scenario: quantity
    When user click on add to wishlist button
    And user click on top menu wishlist icon
    Then item is added successfully