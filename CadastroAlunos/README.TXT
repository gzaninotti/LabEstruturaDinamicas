This project was built for Dynamic Structure Lab classes from PUC-SP, managed by Professor Julio Arakaki 
----------------------------------------------------------------------------
The project is meant to be a java codification of a students register system.
For the data storage it must be used an Array of Students type.

In future implementations, this storage should be replaced by a dynamic allocation data storage such as linked lists, for example.

There is a diagram represeting the classes and their dependencies on each other.
------------------------------------------------------------------------

-- Initial Requirements
Develop the application with basic register and view functions. Respect the classes from diagram and their dependencies.

-- Data:
Student must have: Name, RA (id), Course, Classes;
For each class: Name, Grade;

--Functional Requirements:
-REQ01: Menu with each operation provided by the system.
    (Insert, Remove, List, Exit)

-REQ01_01: Insert allows the user to provide infos about a student and this must be inserted at the data storage talked about above. If there is already a student with the ID provided, return to the user with a error msg.

-REQ01_02: Remove option asks for the student RA (id). In case this student does not exists, it should return to the user with a error msg.

-REQ01_03: List option must show all informations from registred students.

-REQ01_04: Exit option should end the application. In the future it should be implemented a data persistence by files with will save the students data, if opted by the user.