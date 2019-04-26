Feature: CaseStudy Feature
Scenario: Add product Scenario
Given The Url of the TestMeApp
When login with a valid credentials
And add category
And add subcategory
And add a product
Then product is added successfully
