Feature: To validate login functionality of Facebook

Scenario Outline: To validate negative and positive combination of data
Given To launch the browser and maximise it
When To launch the url of the Faceboook
And To Pass the data in "<emailid>" in email field
And To Pass the data in "<password>" in password field
And To click the login button
Then To close the browser

Examples:
|emailid               |password   |
|sbraman11839@gamil.com|Sb@raman007|
|sbramdf11839@g        |Sb@raman007|
|sbraman11839@gamil.com|Sb@fvman007|
|sbraman11839@gamil.com||
||Sb@raman007|
|||