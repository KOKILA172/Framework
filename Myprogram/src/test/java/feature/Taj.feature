Feature: Verifing details in Taj web page


Scenario Outline: Validating correct details
Given initialize the browser with chrome
And Navigate to  "https://www.tajhotels.com/" site
And click on the search option enter the seach key Mumbai
When find the The Taj Mahal Palace Mumbai from drop down
And close browser


