package employeeapp;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Method to add an employee to the database
    public void addEmployee(Employee employee) {
        String query = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Set values in the prepared statement
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getEmail());
            stmt.setDouble(3, employee.getSalary());
            
            // Execute the query to insert employee into database
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve all employees from the database
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employees";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                // Creating employee object from the result set
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setSalary(rs.getDouble("salary"));
                
                // Adding employee object to the list
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return employees;
    }

    // Method to update an employee's details in the database
    public void updateEmployee(Employee employee) {
        String query = "UPDATE employees SET name = ?, email = ?, salary = ? WHERE id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Set values in the prepared statement
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getEmail());
            stmt.setDouble(3, employee.getSalary());
            stmt.setInt(4, employee.getId());
            
            // Execute the update query
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete an employee from the database
    public void deleteEmployee(int employeeId) {
        String query = "DELETE FROM employees WHERE id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Set the employee ID to be deleted
            stmt.setInt(1, employeeId);
            
            // Execute the delete query
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get a single employee by ID
    public Employee getEmployeeById(int employeeId) {
        Employee employee = null;
        String query = "SELECT * FROM employees WHERE id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, employeeId);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setSalary(rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return employee;
    }
}
