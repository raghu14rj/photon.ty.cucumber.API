Feature: TO PERFORM GET OPERATION

@Reg
Scenario: User is performing List of user api validation
Given user enter the base url
When user enters the "list_of_user" endpoint with the GET http request
Then user should get the statuscode as "200"

@Reg
Scenario: User is performing Single user api validation
Given user enter the base url
When user enters the "Single_user" endpoint with the GET http request
Then user should get the statuscode as "200"

@Reg
Scenario: User is performing Single resource api validation
Given user enter the base url
When user enters the "Single_resource" endpoint with the GET http request
Then user should get the statuscode as "200"

@Smoke
Scenario: User is performing List of resource api validation
Given user enter the base url
When user enters the "List_of_resource" endpoint with the GET http request
Then user should get the statuscode as "200"

@Smoke
Scenario: User is performing List of resource api validation
Given user enter the base url
When user enters the "List_of_resource" endpoint with the GET http request
Then user should get the statuscode as "200"

@Smoke
Scenario: User is performing Single user not found api validation
Given user enter the base url
When user enters the "Single_user_not_found" endpoint with the GET http request
Then user should get the statuscode as "404"

@Demo
Scenario: User is performing Single resouce not found api validation
Given user enter the base url
When user enters the "Single_resource_not_found" endpoint with the GET http request
Then user should get the statuscode as "404"

@Demo
Scenario: User is performing Delay response api validation
Given user enter the base url
When user enters the "Delay_response" endpoint with the GET http request
Then user should get the statuscode as "200"
