package baseline;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String separationDate;

    public Employee(String firstName, String lastName, String department, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.separationDate = separationDate;
    }

    //set first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //get
    public String getFirstName(){
        return firstName;
    }

    //setget last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    //setget department
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    //setget date
    public void setSeparationDate(String separationDate){
        this.separationDate = separationDate;
    }
    public String getSeparationDate(){
        return separationDate;
    }

    //get their first and last name
    public String getName(){
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString(){
        return String.format("%-12s %-12s | %-18s | %-12s", getFirstName(), getLastName(), getDepartment(), getSeparationDate());
    }
}
