@tag
Feature: checkout
i want to check out  the cost of your groceries at the supermarket


Scenario Outline: checkout a banana
Given the price of a "banana" is 40
When I checkout <count> "banana"
Then the total price should be <total>

Examples:
|count|total|
|1    |40   |
|2    |80   |


Scenario: Two banans scanned separately
Given the price of a "banana" is 40
When I checkout 1 "banana"
And I checkout 1 "banana"
Then the total price should be 80


Scenario: A banana and Apple
Given the price of a "banana" is 40
And the price of a "apple" is 25
When I checkout 1 "banana"
And I checkout 1 "apple"
Then the total price should be 65


Scenario: one banana
Given the price of a "banana" is 40
When I checkout 1 "banana"
Then the total price should be 40


Scenario: two bananas at once
Given the price of a "banana" is 40
When I checkout 2 "banana"
Then the total price should be 80


Scenario: A banana and two Apples and three oranges
Given the price of a "banana" is 40
And the price of a "apple" is 25
And the price of a "orange" is 20
When I checkout 1 "banana"
And I checkout 2 "apple"
And I checkout 3 "orange"
Then the total price should be 150
