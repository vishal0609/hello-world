@diff
Feature: Test feature to launch browser
@same
Scenario: Open Chrome browser and get google
Given All setup is ther
|user1|pass1|
|user2|pass2|
Then GET google page
|id|name|
|1|"dffd"|


@same
Scenario: Open Chrome browser and get google
Given All setup is ther
|user2|pass1|
Then GET google page
|id|name|
|2|"dffd"|

@same1
Scenario: Open Chrome browser and get google
Given All setup is ther
|user3|pass1|
Then GET google page
|id|name|
|3|"dffd"|
And everthing is as required


Scenario: Open Chrome browser and get google
Given All setup is ther
|user4|pass1|
Then GET google page
|id|name|
|4|"dffd"|