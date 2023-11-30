@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3


  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4	    |

  Scenario Outline: operator X two numbers
    Given Two input values, <first> and <second>
    When I X the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 16     | 1     | 4.00    |
      | 9    | 4      | 1.50      |
      | 136     | 11      | 3.52	    |
      | -80     | -5      | 4.00	    |
      | -80     | 5      | negativeUnderSqrt	    |
      | 10     | 0      | divideByZero	    |
      | 0     | 10      | 0.00	    |
      | 4 | 1 | 2 |
      | 36 | 4 | 3 |
