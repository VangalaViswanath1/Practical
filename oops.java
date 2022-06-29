
    class Employee{
                   
        int id;
        String name;
        int salary;
                    //defining a method here 
        public void stdDetails(){
            System.out.println("My name is : " + name);
            System.out.println("and my id is : "+ id );
        }

        public int getSalary(){
            return salary;
        }

    }

public class oops{
    public static void main(String[] args){
        System.out.println("This is the custom object creation here!");

        Employee vijay = new Employee();    //initialize new Employee Object here
        Employee john = new Employee();

        //First Employee details here
        
        vijay.id = 101;                           //providing properties or attributes here to the Employee
        vijay.name = "Vijay Vangala"; 
        vijay.salary = 34000;
        

        //Second Employee details here
        
        john.id = 201;
        john.name = "John Tripati";
        john.salary = 15000;
       
        System.out.println(("first employee details here").toUpperCase());
        System.out.println(vijay.id);       //Printing attributes or properties here
        System.out.println(vijay.name);
        System.out.println(" ");

        System.out.println(("Second employee details here").toLowerCase());
        System.out.println(john.id);
        System.out.println(john.name);
        System.out.println(" ");

        System.out.println("First employee output from method:");
        vijay.stdDetails();                 //From the method printing we are printing properties here

        int salary = vijay.getSalary();
        System.out.println(salary);

        System.out.println(" ");

        

        System.out.println("Second employee output from method:");
        john.stdDetails();

        salary = john.getSalary();
        System.out.println(salary);     
        john.getSalary();

        System.out.println(john.getSalary());

    }
}