To-Do App
This is a simple To-Do application built with Java and Spring Boot. This application allows users to add and view tasks in a to-do list. It is deployed on AWS EC2.
Features
•	Add new tasks to the to-do list.
•	View all added tasks.
Technologies Used
•	Java (Spring Boot)
•	Maven (for project management and dependencies)
•	AWS EC2 (for deployment)
Getting Started Locally
Step 1: Clone the Repository
git clone https://github.com/YourUsername/Todoapp.git
cd Todoapp
Step 2: Install Java (JDK 17 or higher)
Make sure that Java 17 (or higher) is installed on your system. You can verify this by running:
java -version
If Java is not installed, download and install it from the Oracle Java Downloads page or use an OpenJDK distribution.
Step 3: Build the Application
Use Maven to build the application and create a JAR file:
mvn clean package
The built JAR file will be located in the target/ folder.
Step 4: Run the Application Locally
Run the application using the following command:
java -jar target/Todoapp.jar
The application will be available at http://localhost:8080.
Deploying on AWS EC2 (Windows)
This application is deployed on an AWS EC2 Windows instance.
Step 1: Launch an EC2 Instance
1.	Log in to the AWS Management Console and go to the EC2 Dashboard.
2.	Launch a new Windows-based EC2 instance (for example, using Windows Server 2019).
3.	Make sure to open port 8080 in the Security Group settings to allow access to the Spring Boot app.
Step 2: Install Java on EC2
Once connected to the EC2 instance, install Java (JDK 17 or higher):
•	Download and install JDK 17 from the official Oracle site.
•	Verify the installation: 
•	java -version
Step 3: Upload the JAR File to EC2
You can use MobaXterm or WinSCP to upload the Todoapp.jar file from your local machine to your EC2 instance.
For Mobaxterm:
1.	Connect to your EC2 instance using Mobaxterm with your EC2 credentials.
2.	Upload the Todoapp.jar file to a directory on your EC2 instance (for example, C:\Users\Administrator\).
Step 4: Run the Application on EC2
Open Command Prompt or PowerShell on the EC2 instance. Navigate to the directory where the JAR file is uploaded. Run the Spring Boot application:
java -jar Todoapp.jar
The application will run on port 8080.
Step 5: Access the Application
Open your web browser and enter the Public IP address of the EC2 instance followed by :8080.
Example:
http://43.204.236.34:8080
You should now be able to access the Spring Boot To-Do app running on your AWS EC2 instance.
Future Improvements
•	User Authentication: Add a user login and registration system to allow users to securely manage their tasks.
•	Database Integration: Integrate a database (like MySQL or PostgreSQL) to store tasks persistently instead of in-memory storage.
•	Task Priority: Add the ability to set priorities or deadlines for tasks.
•	Task Categories: Organize tasks into different categories or tags for better management.
Conclusion
Your Spring Boot To-Do app is now live on AWS EC2, and you can access it through the public URL provided by AWS. This guide showed you how to deploy the application without using Docker, directly on a Windows-based EC2 instance.
________________________________________
Scalable Web Application Architecture
Objective:
Design a cloud-agnostic architecture for a simple web application that can scale to meet increased demand.
Project Overview
This project involves designing a scalable web application architecture for a simple web application. The design ensures that the system can handle variable traffic and scale as needed while remaining cloud-agnostic. The architecture is built using open-source tools and technologies.
Components of the Architecture:
1.	Load Balancer: The architecture uses a load balancer (e.g., Nginx) to distribute incoming traffic across multiple instances of the web application. This helps in balancing the load and ensuring high availability.
2.	Auto-Scaling: The application is designed to scale automatically to meet changing demands. Using auto-scaling groups, additional instances can be launched when traffic increases, and they can be terminated when traffic decreases.
3.	Storage: For persistent storage, object storage services such as AWS S3 or similar services can be used for storing static assets, backups, or logs.
Architecture Diagram:
![Load balancers_page-0001](https://github.com/user-attachments/assets/9335b325-ed1a-4e1f-a7d8-417212607586)

Explanation of the Architecture:
1.	Traffic Flow: When a user requests the web application, the request is routed through the load balancer, which distributes the load across multiple instances of the application servers. This ensures that no single instance is overwhelmed with traffic.
2.	Auto-Scaling: If the traffic increases beyond a certain threshold, the system will automatically scale by launching new instances. Conversely, if the traffic decreases, the system will terminate unnecessary instances, ensuring cost-efficiency.
3.	Fault Tolerance: If any instance fails, the load balancer will automatically reroute traffic to healthy instances. This ensures high availability and reliability.

