package com.akhilesh.app;

import com.akhilesh.entity.Employee;
import com.akhilesh.util.DynamicList;
import com.akhilesh.util.MyList;
import javax.swing.JOptionPane;

/**
 *
 * @author Akhilesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DynamicList<Employee> myList = new MyList<>();
        StringBuilder displayContent = new StringBuilder();

        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Enter you choice!\n"
                        + "1. Add employee\n"
                        + "2. View employee\n"
                        + "3. Search by empId\n"
                        + "4. Sort by emp id\n"
                        + "5. Exit");
                int ch = Integer.parseInt(input);
                switch (ch) {
                    case 1:

                        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter you empId"));
                        String firstName = JOptionPane.showInputDialog("Enter first name");
                        String lastName = JOptionPane.showInputDialog("Enter last name");
                        String email = JOptionPane.showInputDialog("Enter email");

                        Employee emp = new Employee();
                        emp.setEmpId(id);
                        emp.setFirstName(firstName);
                        emp.setLastName(lastName);
                        emp.setEmail(email);

                        myList.add(emp);
                        break;
                    case 2:
                        for (Employee e : myList) {
                            displayContent.append(e.getEmpId() + ","
                                    + e.getFirstName() + ","
                                    + e.getLastName() + ","
                                    + e.getEmail()).append("\r\n");
                        }
                        JOptionPane.showMessageDialog(null, displayContent.toString());
                        displayContent.setLength(0);
                        break;
                    case 3:
                        boolean found = false;
                        int searchId = Integer.parseInt(JOptionPane.showInputDialog("Enter empId to search"));
                        for (Employee e : myList) {
                            if (searchId == e.getEmpId()) {
                                found = true;
                                displayContent.append("Found!\n").
                                        append(e.getEmpId() + ","
                                                + e.getFirstName() + ","
                                                + e.getLastName() + ","
                                                + e.getEmail()).append("\r\n");
                                break;

                            }
                        }
                        if (found) {
                            JOptionPane.showMessageDialog(null, displayContent.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Not found!");
                        }
                        break;
                    case 4:
//                        Employee tempObj;
//                        for (int i = 0; i < myList.size(); i++) {
//                            for (int j = i + 1; j < myList.size(); j++) {
//                                Employee e = myList.get(i);
//
//                                if (myList.get(j).getEmpId() < myList.get(i).getEmpId()) {
//                                    tempObj = myList.get(i);
////                                    myList[i] = tempObj;
//
//                                }
//                            }
//                        }
                        
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid choice", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }// end of while loop

    }

}


