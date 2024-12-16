
# TalentForce

An **employee and department management system** that allows organizations to efficiently manage employees' records, department details, and associated data.

## Problem
Managing employee and department data manually can be inefficient, error-prone, and time-consuming.

## Solution
TalentForce simplifies employee and department management with a web-based interface that provides **real-time data manipulation**, **CRUD operations**, and clear, organized displays of employee and department details.

## Unique Value Proposition
TalentForce ensures **clean architecture**, modern UI/UX design, and seamless integration with backend APIs to provide a powerful, scalable, and user-friendly management tool.

---

## Features

### 1. **Employee Management**
- Add, Update, Delete, and View employees.
- Includes all employee fields:
  - First Name, Last Name, Age, Gender, Email, Location, Leave Days Left, Contract Type, Salary, Hire Date, Employment Status, and Department.
- Supports validation for critical fields.

### 2. **Department Management**
- Add, Update, Delete, and View departments.
- View all employees associated with a specific department.

### 3. **Search Functionality**
- Search for employees by ID, Name, or Location.
- Search for departments by ID.

### 4. **Real-Time Updates**
- Employee and department data is updated dynamically without requiring page reloads.

### 5. **Organized Tables**
- Neatly formatted tables with options to:
  - View all employees.
  - View employees filtered by department.

---

## Tech Stack

### Front-end
- **React**: Used for creating dynamic, component-based UI.
- **Boostrap**: For styling and creating responsive layouts.

### Back-end
- **Spring Boot**: Handles API logic, database connections, and validation.
- **JPA (Hibernate)**: Provides ORM functionality.
- **MySQL**: Relational database for storing data.

---

## Database Schema

Here is a simple schema overview:

### **Employee Table**
| Column             | Type           | Description                        |
|--------------------|----------------|------------------------------------|
| `employee_id`      | Long           | Auto-generated unique ID           |
| `first_name`       | String         | Employee's first name              |
| `last_name`        | String         | Employee's last name               |
| `age`              | Long           | Employee's age                     |
| `gender`           | String (M/F)   | Employee's gender                  |
| `email`            | String         | Employee's email                   |
| `location`         | String         | Employee's location                |
| `leave_days_left`  | Integer        | Remaining leave days               |
| `contract_type`    | Enum           | Contract type (PERMANENT/TEMPORARY)|
| `salary`           | BigDecimal     | Employee's salary                  |
| `hire_date`        | String (Date)  | Date of hire                       |
| `employment_status`| Enum           | Status (ACTIVE/TERMINATED/RETIRED) |
| `department_id`    | Long (FK)      | Reference to the department        |

### **Department Table**
| Column          | Type   | Description                        |
|-----------------|--------|------------------------------------|
| `department_id` | Long   | Auto-generated unique ID           |
| `name`          | String | Department name                   |

---

## Getting Started

### Prerequisites
- **Node.js**: v18+ recommended.
- **Java**: JDK 17+.
- **MySQL**: Ensure a MySQL server is running.
- **Maven**: For managing backend dependencies.
- **Yarn**: Install Yarn globally:
   ```bash
   npm install -g yarn
   ```

---

### Installation

#### 1. **Backend Setup**
1. Clone the repository:
   ```bash
   git clone https://github.com/gianni-jin/talentforce.git
   cd talentforce
   ```
2. Configure the database:
   - Create a MySQL database:
     ```sql
     CREATE DATABASE emp_management;
     ```
3. Build and run the backend:
   ```bash
   mvn spring-boot:run
   ```

#### 2. **Frontend Setup**
1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the frontend server:
   ```bash
   yarn start dev
   ```
   The application will be available at `http://localhost:5173`.
---

## Future Enhancements
- **Pagination**: Add pagination for employee and department tables.
- **Role-Based Authentication**: Secure the app and introduce role-based permissions.
- **Export/Import Functionality**: Allow exporting data to CSV or Excel and importing records.
- **Dashboard Analytics**: Integrate charts to display metrics for departments and employees.
- **Notifications**: Real-time notifications for critical actions (e.g., low leave days).

---

## References
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [React Documentation](https://reactjs.org/)
- [MySQL Reference Manual](https://dev.mysql.com/doc/)

---

## License
This project is licensed under the MIT License.

