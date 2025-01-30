public class Employee {

    private void Employee(){

    }
    public static Employee e;

    public static Employee getInstance(){


        if(e == null) {

            e = new Employee();
        }

        return e;
    }







    }






