Feature:  Adding numbers
  In order to generate accurate invoices
  As grocery store cashier
  I want to be able to use my Cash Register
  to add up the item prices correctly

  Scenario:  Adding two positive numbers
    #Testing the addition of two positive numbers
    Given I have a cashRegister
    When I add 1 and 1
    Then the sum should be 2

  Scenario:  Adding a positive and negative number
    #Testing the addition of opposite signs
    Given I have a cashRegister
    When I add 1 and -1
    Then the sum should be 0

  Scenario:  Adding two negative numbers
    #Testing addition of two negative numbers
    Given I have a cashRegister
    When I add -1 and -1
    Then the sum should be -2

  #Scenario:  Provoke a failure same sign numbers
    #changing the result to provoke a failure
    #Given I have a cashRegister
    #When I add 1 and 1
    #Then the sum should be 3


