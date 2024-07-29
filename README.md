# atm-simulator-system

Description
The ATM Simulator System is a Java-based application designed to simulate the functionality of an Automated Teller Machine (ATM). It utilizes Java Swing for the user interface, MySQL for database management, and JDBC for database connectivity. The system allows users to perform basic banking transactions such as checking account balance, depositing funds, and withdrawing cash.

Features
User Authentication: Secure login for users to access their accounts.
Balance Inquiry: Check account balance.
Cash Withdrawal: Withdraw funds from the account.
Deposit Funds: Add money to the account.
Transaction History: View a history of transactions.

Installation

1.Clone the Repository:
git clone https://github.com/yourusername/atm-simulator-system.git

2.Set Up MySQL Database:
Create a new MySQL database and user for the application.
Import the provided schema.sql file to set up the necessary tables.
Configure Database Connection:

3.Edit the config.properties file to include your MySQL database details:
db.url=jdbc:mysql://localhost:3306/your_database
db.username=your_username
db.password=your_password

4.Build the Project:
Use your preferred IDE to build the project, or run the following Maven command:
mvn clean install

5.Run the Application:
Execute the main class to start the application:
java -cp target/atm-simulator-system-1.0.jar com.yourpackage.Main


Usage
1.Launch the application.
2.Log in using the provided credentials.
3.Use the GUI to perform various banking operations.

Contributing
Contributions are welcome! Please follow these guidelines to contribute:
1.Fork the repository.
2.Create a new branch for your feature or bug fix.
3.Commit your changes and push to your branch.
4.Open a pull request with a detailed description of your changes.

Acknowledgements
Java: Programming language used for development.
Swing: For creating the graphical user interface.
MySQL: Database management system.
JDBC: For database connectivity.
