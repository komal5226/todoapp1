To-Do App
This is a simple To-Do application built with Java and Spring Boot. This application allows users to add and view tasks in a to-do list. It is deployed on AWS EC2.

Features
Add new tasks to the to-do list.
View all added tasks.

Technologies Used
Java (Spring Boot)
Maven (for project management and dependencies)
AWS EC2 (for deployment)

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
Log in to the AWS Management Console and go to EC2 Dashboard.
Launch a new Windows-based EC2 instance (for example, using Windows Server 2019).
Make sure to open port 8080 in the Security Group settings to allow access to the Spring Boot app.

Step 2: Install Java on EC2
Once connected to the EC2 instance, install Java (JDK 17 or higher):

Download and install JDK 17 from the official Oracle site.
Verify the installation:

java -version
Step 3: Upload the JAR File to EC2
You can use MobaXterm or WinSCP to upload the Todoapp.jar file from your local machine to your EC2 instance.

For Mobaxterm:

Connect to your EC2 instance using Mobaxterm with your EC2 credentials.
Upload the Todoapp.jar file to a directory on your EC2 instance (for example, C:\Users\Administrator\).

Step 4: Run the Application on EC2
Open Command Prompt or PowerShell on the EC2 instance.
Navigate to the directory where the JAR file is uploaded.
Run the Spring Boot application:

java -jar Todoapp.jar
The application will run on port 8080.

Step 5: Access the Application
Open your web browser and enter the Public IP address of the EC2 instance followed by :8080.

Example:
http://43.204.236.34:8080
You should now be able to access the Spring Boot To-Do app running on your AWS EC2 instance.

Future Improvements
User Authentication: Add a user login and registration system to allow users to securely manage their tasks.
Database Integration: Integrate a database (like MySQL or PostgreSQL) to store tasks persistently instead of in-memory storage.
Task Priority: Add the ability to set priorities or deadlines for tasks.
Task Categories: Organize tasks into different categories or tags for better management.

Conclusion
Your Spring Boot To-Do app is now live on AWS EC2 and you can access it through the public URL provided by AWS. This guide showed you how to deploy the application without using Docker, directly on a Windows-based EC2 instance.
