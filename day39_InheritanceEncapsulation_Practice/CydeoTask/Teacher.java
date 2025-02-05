package day39_InheritanceEncapsulation_Practice.CydeoTask;

public class Teacher extends Employee {


    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println( getJobTitle() + " " + getName() +  " is working" );
    }
}





/* . Create a sub class of Employee named Teacher

        Override the work method */