# Project Manager

## What the Program Does:
This is the first deliverable for a project management system designed for the hypothetical structural engineering firm "Poised." The purpose of this program is to allow Poised to keep track of the many projects on which they work. Due to this only being the first iteration of the application, it does not have any data persistence capabilities at this stage. It was designed as a prototype that gives a sense of what it will feel like to use the final version. At this stage, upon running the program, the user is prompted to input data to log a new project. Once the user has logged a project, they can then edit the details of that project before exiting.

## How the Code Works:
This application makes use of object-oriented programming. It uses three classes, TaskManager, Person, and Project. The main method is in the TaskManager class. This main method runs via a series of nested while loops for logging a project, editing a project, and editing a contractor respectively. Once the user runs the program and finishes inputting all the project data, this data will be used to instantiate three Person objects (Architect, Contractor, and Customer) and a Project object. The Person object has the following attributes: Name, contact number, email, and address. The Project object has the following attributes: project number, project name, building type, address, ERF number, project fee, amount paid so far by the customer, deadline, and whether the project has been finalized. The Project object also takes the three Person objects as attributes (Architect, Contractor, and Customer). After the user runs the program and inputs all the data to log a project, that data will be used to instantiate the Architect, Contractor, and Customer objects and then finally a Project object. From there, the user can edit this project by selecting options from the menus and feeding in new data as prompted. If they update an aspect of the project, the new data will be saved as the value of the appropriate attribute of the corresponding object.

## Running the Program
To run this program:
1. Download the files in this repository
2. Create a new java project
3. Drag the TaskManger, Person, and Project classes into the src folder in the project you just created
4. Run the app in the IDE that the project is open in






