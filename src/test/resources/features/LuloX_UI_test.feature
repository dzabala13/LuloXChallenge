Feature: Chatting whit Lulo X

  Scenario: Having a conversation with lulo X
    Given User go to the LuloX webPage
    And  User go to the chat section
    When User chat whit the chatbot
    Then I should see the response from the chatbot
