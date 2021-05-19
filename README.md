# poc-springboot-travel-web-service
# JIRA board : https://openworksociety.atlassian.net/jira/software/projects/TWS/boards/4
# Feature branch creation tips:
Please use "TWS" as prefix to branch name which is short form of repository name. (i.e TWS - Travel-Web-Service) e.g If there is issue with number e.g 1. then create your branch like TWS-1 Then create Pull request to merge your branch changes into master.

*Important : Please don't merge the branches directly into master or don't commit anything directly on master.

# Steps to Run the Application:

1. Checkout this Spring boot application
2. Do this : mvn clean install
3. Run as application and the main class will be com.travel.service.TravelAppServiceApplication.

# Authentication & Authorization
* 2021.5 version will come with spring security authorization and authentication feature.
* REST API are not allows with creating access token.

# Steps to generate access token
* call rest api "/user/register" with username and password. then service will return the detail of user on successfull call.
* then use those credentials in the request body to call "/user/authenticate" API to get the access token.
* use this access token to call any rest API by adding this in the header of request with prefix "Bearer ".
* this user will have READ access and USER role.

# Some default user account for authorization and Authentication
1. Username : admin, Password: admin
2. Username : user, Password: user
3. Username : manager, Password: manager
4. Username : agency, Password: agency
