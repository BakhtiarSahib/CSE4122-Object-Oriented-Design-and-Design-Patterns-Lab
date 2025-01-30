public class Main {
    public static void main(String[] args) {

    Employee e1 = Employee.getInstance();
    Employee e2 = Employee.getInstance();
    Employee e3 = Employee.getInstance();




        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());










    }
}