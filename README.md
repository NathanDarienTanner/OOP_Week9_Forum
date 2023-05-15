# OOP_Week9_Forum

## Part 1

**(A)** By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)

Answer = A class is a blueprint or template for creating objects that share common properties and behaviours. It defines the characteristics and behaviour of a group of objects that belong to the same category or type.
On the other hand, an instantiation is a realization of a class, also known as an object. When a class is instantiated, a specific instance of that class is created, with its own set of properties and behaviours.

**(B)** By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)

Answer = 

Ex 1) Inheritance for Employee Hierarchy

The administration program may have a hierarchy of employees, such as SalesPerson, Manager, and Clerk. These employee types share some common attributes and behaviors, such as name, ID, and salary calculation.

Ex 2) Inheritance for Product Categories

The administration program may have different categories of products, such as Electronics, Clothing, and Books. These product categories may have some shared attributes and behaviors, such as name, price, and discount calculation.

**(C)** Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)

Answer = Libraries are collections of pre-written code (predefined classes). Using them effectively extends efficiency of the program whilst by providing a wide range of functionality

## Part 2

Each instance variable is initialized when a SalesPerson object is instantiated.

**(A)** Complete the constructor public SalesPerson(String id), from the SalesPerson class. (2 points) ~ DONE

![constructor.png](Img/Constructor.png)

**(B)** Explain why accessor methods are necessary for the SalesPerson class. (3 points) 

Answer = Accessor methods are necessary to keep an object's properties (attributes) private or protected, only allowing access through well-defined interfaces.

**(C) (i)** Construct unified modelling language (UML) diagrams to clearly show the relationship between the SalesPerson and Sales classes. (4 points) ~ DONE

![UML.png](Img/UML.png)

**(C) (ii)** Outline a negative effect that a future change in the design of the Sales object might have on this suite of programs. (2 points)

Answer = One negative effect would be compatibility issue between Sales and other classes, such as SalesPerson, as the methods in said class rely on the objects in the Sales class. This means that SalesPerson and other classes requires extensive modifications to work with the updated Sales class.

The salesPeople array contains 100 instantiated objects. The company wishes to reward the salesperson whose sales have the largest total value.

**(D)** State the output after running this code. (4 points)

Answer = The methods getId, getCount, and calcTotalSales outputs 102, 2, and 5000.0 respectively. However, for the method getSalesHistory, it doesn't output anything as it hasn't been implemented.
Having implemented all the methods, the driver class will output:

![Output.png](Img/Output.png)

**(E)** Construct the method calcTotalSales(), in the SalesPerson class that calculates the total value of the sales for a specific SalesPerson object. (5 points) ~ DONE

![CalcTotalSales.png](Img/CalcTotalSales.png)

**(F)** By making use of any previously written methods, construct the method highest(), that returns the ID of the salesperson whose sales have the largest total value. (5 points) ~ DONE

![highest.png](Img/Highest.png)

**(G)** Construct the method addSales(Sales s, String id), in the Driver class, that will add a new Sales object s, to the salesperson with a specified ID. (4 points) ~ DONE

![addSales.png](Img/AddSales.png)

A further class in this suite of programs is the Payroll class. This class is run at the end of each month to calculate each salesperson’s salary, which is based on the sales that have been made during that month.

**(H)** Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made. (3 points)

SalesPerson class:
+ Add a new instance variable salary to store the salesperson's salary.
+ Implement a setter and getter method setSalary() to set and retrieve the salesperson's salary.
+ Modify the calcTotalSales() method to calculate the total sales amount for the month based on the sales history.
+ Implement a new method, (ex: calculateSalary()), which will use the calcTotalSales() method to calculate and set the salesperson's salary. Although, this calculation would be better implemented as a new class.

Sales class:
+ No specific changes are required in the Sales class for the salary calculation. It can continue to store the details of each sale, such as the product name, value, and quantity.

Payroll class (New):
+ It would access each SalesPerson object, retrieve their sales history, and calculate their respective salaries based on the total sales made during the month. The SalesPerson class now includes the necessary functionality to track sales and calculate the salary for each salesperson.

**(I)** Discuss the use of polymorphism that occurs in this suite of programs. (3 points)

Answer = The only form of polymorphism here is overloading, as there are two different constructors in the SalesPerson class.
