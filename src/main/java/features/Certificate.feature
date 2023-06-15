@Certificate
Feature: Check certificate
  Scenario Outline:
    When I send certificate number "<NUMBER>"
    Then I check result "<RESULT>"
    Examples:
      | NUMBER   | RESULT |
      | 45924126 | true   |
      | 78008248 | true   |
      | 00000000 | false  |
      | 11111111 | false  |
      | 012345Aa | false  |
