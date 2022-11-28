@smoke
Feature: user can use search box
  Scenario Outline: user could search using product name
    When user fills search box by "<Product name>"
    And user clicks on search button
    Then search result is successful with same "<Product name>"


    Examples:
      | Product name |
      | book |
      | laptop |
      | nike |

  Scenario Outline: user could search for product using sku
    When user fills search box by "<Product Sku>"
    And user clicks on search button
    And click on the product result
    Then search result is successful with same "<Product Sku>" and "<Product Name>"

    Examples:
      | Product Sku|Product Name|
      | SCI_FAITH |Science & Faith|
      | APPLE_CAM |Apple iCam     |
      | SF_PRO_11 |Sound Forge Pro 11|







