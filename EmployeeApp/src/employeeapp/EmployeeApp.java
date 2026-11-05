package employeeapp;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class EmployeeApp {

    private static JTable table;

    public static void main(String[] args) {
        // Set up the UI
        JFrame frame = new JFrame("Employee Management System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        // Make the frame visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Label for the table
        JLabel label = new JLabel("Employee List:");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);

        // Table to display employee details
        String[] columnNames = {"ID", "Name", "Email", "Salary"};
        String[][] data = {};  // Placeholder for employee data

        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 50, 560, 200);
        panel.add(scrollPane);

        // Button to load employees
        JButton loadButton = new JButton("Load Employees");
        loadButton.setBounds(10, 270, 150, 25);
        loadButton.addActionListener(e -> loadEmployees());
        panel.add(loadButton);

        // Button to add a new employee
        JButton addButton = new JButton("Add Employee");
        addButton.setBounds(170, 270, 150, 25);
        addButton.addActionListener(e -> addEmployee(panel));
        panel.add(addButton);
    }

    // Load the employee data and display it in the table
    private static void loadEmployees() {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employees = employeeDAO.getAllEmployees();

        String[][] employeeData = new String[employees.size()][4];

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            employeeData[i][0] = String.valueOf(emp.getId());
            employeeData[i][1] = emp.getName();
            employeeData[i][2] = emp.getEmail();
            employeeData[i][3] = String.valueOf(emp.getSalary());
        }

        table.setModel(new javax.swing.table.DefaultTableModel(employeeData, new String[] {"ID", "Name", "Email", "Salary"}));
    }

    // Show a dialog to add a new employee
    private static void addEmployee(JPanel panel) {
        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JTextField salaryField = new JTextField(20);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Salary:"));
        inputPanel.add(salaryField);

        int option = JOptionPane.showConfirmDialog(panel, inputPanel, "Add Employee", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String email = emailField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            Employee employee = new Employee();
            employee.setName(name);
            employee.setEmail(email);
            employee.setSalary(salary);

            EmployeeDAO employeeDAO = new EmployeeDAO();
            employeeDAO.addEmployee(employee);

            // Reload the employee list after adding the new employee
            loadEmployees();
        }
    }
}
