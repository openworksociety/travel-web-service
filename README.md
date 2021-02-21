# poc-springboot-travel-app-service

# Feature branch creation tips:
Please use "TW" as prefix to branch name which is short form of repository name. (i.e TW - Travel-Web) e.g If there is issue with ID #5 then create your branch like TW-#5 Then create Pull request to merge your branch changes into master.

*Important : Please don't merge the branches directly into master or don't commit anything directly on master.

# Steps to Run the Application:

1. Checkout this Spring boot application
2. Do this : mvn clean install
3. Run as application and the main class will be com.travel.service.TravelAppServiceApplication.
4. There is sample service added to test it.
5. After running hit this URL in browser : www.localhost:8080/sample/testmsg 
   then it will print this in browser screen : "Helloo, This is sample text message for REST service"
   
   
# Steps to test the newly added endpoints

# Create Schema (If not present)
	Schema name: "traveldev"

# Find
	GET : http://localhost:8080/sample/findAllVehicles

# Create:
	POST : http://localhost:8080/sample/create
	
   Request Body:
   {
	"id": null,
	"type": "intercity",
	"number": "MH24BA5111",
	"color": "BLACK",
	"deactive": false
	}
	
# Delete:
	DELETE : http://localhost:8080/sample/deletebyId/{id}
   
   
   
