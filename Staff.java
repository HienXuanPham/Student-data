import java.util.ArrayList;

public class Staff extends Person{
    public Staff(){
        super();
    }

    public Staff(int id, String n, String d, String c){
        super.setID(id);
        super.setName(n);
        super.setDepartment(d);
        super.setCourse(c);
    }
    public void printOutput(){
        System.out.println("\nThis is a staff data: ");
    }
}
