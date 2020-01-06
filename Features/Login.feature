Feature: Login for Loree

Scenario Outline: Validating the login page 
Given as a user I am on the canvas login page
When user enters vaild "<email_id>" and "<password>" 
Then user navigate to Loree
Examples:
| email_id                       | password   |
| archana.manoj@crystaldelta.com | logout@123 |