Feature: This test covers how to capture screenshot of Failed case
  Scenario: Screenshot of Failed Case
    Given Launch browser window
    When Open google.co.in
    Then fail the scenario and capture the screenshot
