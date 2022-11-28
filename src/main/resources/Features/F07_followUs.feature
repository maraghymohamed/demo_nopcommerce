@smoke
Feature:  F07_followUs | users could open followUs links
  Scenario: user can open nopcommerce facebook page from website
    When user click on facebook icon
    Then user is redirected to website facebook page

  Scenario: user can open nopcommerce twitter page from website
    When user clicks on twitter  icon
    Then user is redirected to website twitter page

  Scenario: user can open nopcommerce rss page from website
    When user clicks on rss icon
    Then user is redirected to website rss page

  Scenario: user can open nopcommerce youtube page from website
    When user clicks on youtube icon
    Then user is redirected to website youtube page