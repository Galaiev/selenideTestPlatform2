Feature: Check mini card

  Scenario Outline: Check mini crad
    When I login to platform with "standard_user"
    Then Then I check <name>, <price>
    Examples:
      | name                | price |
      | Sauce Labs Backpack | 29.99 |