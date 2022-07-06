
class base{
    int id = 101;
}
class derived extends base{
    int salary = 60000;
}

public class Sinherit {
    public static void main(String args[]){
        System.out.println("This is just simple inheritance");
        derived i = new derived();

        System.out.println("Your  id is "+ i.id);
        System.out.println("Your salary is "+ i.salary);
    }
}
