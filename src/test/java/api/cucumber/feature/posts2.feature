Feature: Post feature of facebook
  This will test the functionality at the user wall
  Background: This is for common steps
    Given User should be logged in and should be present on his wall

    Scenario: Post a message on user wall
      When I type the message in the box
      And Click on the Post button
      Then the message should be posted

      Scenario: Post a video on user wall
        When User supply the youtube link in the text box
        And Click on the Post button
        Then The video should get posted on the user wall
        And the video should have proper thumbnail