Feature: Login Action

  Scenario Outline: Successful Login with alid Credentials
    Given User is on Homepage
    When User navigate to Login page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

