// This is the first deliverable for a project management system
// designed for the structural engineering firm 'Poised'.

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

//      Allow user to add project details if they pressed 1.
        Scanner scan = new Scanner(System.in);
        boolean optionMenu1 = true;
        while (optionMenu1) {
            System.out.println("Welcome to the task manager application! Select 1 to log a new project or 2 to exit: ");
            int logOrExit = scan.nextInt();
            if (logOrExit == 1) {

//          Project input.
                System.out.println("Project number: ");
                int projectNumber = scan.nextInt();
                System.out.println("Project Name: ");
                String projectName = "";
                projectName = scan.next();
                projectName += scan.nextLine();
                System.out.println("Building type: ");
                String buildingType = scan.next();
                System.out.println("Address: ");
                String address = "";
                address = scan.next();
                address += scan.nextLine();
                System.out.println("ERF number: ");
                int erfNumber = scan.nextInt();
                System.out.println("Project fee: ");
                long projectFee = scan.nextLong();
                System.out.println("Amount paid: ");
                long amountPaid = scan.nextLong();
                System.out.println("Deadline: ");
                String deadline = scan.next();
                String finalized = "No";

//          Architect input.
                System.out.println("Architect name: ");
                String architectName = "";
                architectName = scan.next();
                architectName += scan.nextLine();
                System.out.println("Architect contact number: ");
                String architectNumber = scan.next();
                System.out.println("Architect email: ");
                String architectEmail = scan.next();
                System.out.println("Architect address: ");
                String architectAddress = "";
                architectAddress = scan.next();
                architectAddress += scan.nextLine();

//          Contractor input.
                System.out.println("Contractor name: ");
                String contractorName = "";
                contractorName = scan.next();
                contractorName += scan.nextLine();
                System.out.println("Contractor contact number: ");
                String contractorNumber = scan.next();
                System.out.println("Contractor email: ");
                String contractorEmail = scan.next();
                System.out.println("Contractor address: ");
                String contractorAddress = "";
                contractorAddress = scan.next();
                contractorAddress += scan.nextLine();

//          Customer input.
                System.out.println("Customer name: ");
                String customerName = "";
                customerName = scan.next();
                customerName += scan.nextLine();
                System.out.println("Customer contact number: ");
                String customerNumber = scan.next();
                System.out.println("Customer email: ");
                String customerEmail = scan.next();
                System.out.println("Customer address: ");
                String customerAddress = "";
                customerAddress = scan.next();
                customerAddress += scan.nextLine();

//          Instantiate Person and Project objects using input data.
                Person architect = new Person(architectName, architectNumber, architectEmail, architectAddress);
                Person contractor = new Person(contractorName, contractorNumber, contractorEmail, contractorAddress);
                Person customer = new Person(customerName, customerNumber, customerEmail, customerAddress);
                Project project = new Project(projectNumber, projectName, buildingType, address, erfNumber, projectFee,
                        amountPaid, deadline, finalized, architect, contractor, customer);

                System.out.println("Project logged. \n\nProject details: ");
                System.out.println(project);

//          Offer user options for updating the project or exiting the program.
                boolean optionMenu2 = true;
                while (optionMenu2) {
                    System.out.println("\nPress 1 to edit this project or 2 to exit: ");
                    int editOrExit = scan.nextInt();
                    boolean editing = true;
                    if (editOrExit == 1) {
                        while (editing) {
                            System.out.println("\nPress \n1 to change due date \n2 to update the fee paid to date" +
                                    "\n3 to update contractor details \n4 to finalize the project" +
                                    "\n5 to view project details \n6 to go back: ");
                            int editToMake = scan.nextInt();

//                        Change date.
                            if (editToMake == 1) {
                                System.out.println("Please enter a new date, e.g., 2021-01-01: ");
                                String newDeadline = scan.next();
                                project.deadline = newDeadline;
                            }

//                        Change fee paid so far.
                            else if (editToMake == 2) {
                                System.out.println("Please enter the new amount: ");
                                project.amountPaid = scan.nextInt();
                            }

//                        Change contractor's details.
                            else if (editToMake == 3) {
                                boolean contractorEdit = true;
                                while (contractorEdit) {
                                    System.out.println("Press \n1 to edit the name \n2 to edit the contact number" +
                                            "\n3 to edit the email address \n4 to edit the physical address" +
                                            "\n5 to stop editing the contractor: ");
                                    int newContractorDetail = scan.nextInt();

//                                 Change name.
                                    if (newContractorDetail == 1) {
                                        System.out.println("Please enter a new name: ");
                                        String newName = "";
                                        newName = scan.next();
                                        newName += scan.nextLine();
                                        project.contractor.name = newName;
                                    }

//                                 Change contact number.
                                    else if (newContractorDetail == 2) {
                                        System.out.println("Please enter a new contact number: ");
                                        project.contractor.contactNumber = scan.next();
                                    }

//                                 Change email address.
                                    else if (newContractorDetail == 3) {
                                        System.out.println("Please enter a new email: ");
                                        project.contractor.email = scan.next();
                                    }

//                                 Change physical address.
                                    else if (newContractorDetail == 4) {
                                        System.out.println("Please enter a new address: ");
                                        String newAddress = "";
                                        newAddress = scan.next();
                                        newAddress += scan.nextLine();
                                        project.contractor.address = newAddress;
                                    }

//                                 Stop editing the contractor.
                                    else if (newContractorDetail == 5) {
                                        contractorEdit = false;
                                    }

//                            Catch invalid entry errors.
                                    else {
                                        System.out.println("That was not a valid entry.");
                                    }
                                }
                            }

//                        Finalize project.
                            else if (editToMake == 4) {
                                project.finalized = "Yes";
                            }

//                        Show edited project.
                            else if (editToMake == 5) {
                                System.out.println(project);
                            }

//                        Exit project editing loop.
                            else if (editToMake == 6) {
                                editing = false;
                            }

//                        Catch invalid entry errors.
                            else {
                                System.out.println("That was not a valid entry!");
                            }
                        }
                    }

//               Exit project editing loop.
                    else if (editOrExit == 2) {
                        editing = false;
                        optionMenu1 = false;
                        optionMenu2 = false;
                    }

//               Catch invalid entry errors.
                    else {
                        System.out.println("That was not a valid entry.");
                    }
                }
            }

//      Exit program.
            else if (logOrExit == 2) {
                optionMenu1 = false;
            }

//      Catch invalid entry errors.
            else {
                System.out.println("Sorry, that was not a valid entry");
            }
        }
        System.out.println("Goodbye");
    }
}

