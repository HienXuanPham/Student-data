import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person{
    public Student(){
        super();
    }
    public Student(int id, String n, String d, String c){
        super.setID(id);
        super.setName(n);
        super.setDepartment(d);
        super.setCourse(c);
    }

    public void printOutput(){
        System.out.println("This is a student data: ");
    }
    // find the staff with the same course as this student
    // and return their name
    public String getTeacherName(ArrayList<Staff> arrayOfStaff, int len) {
        String staff = "";
        for(int i = 0; i < len; i++){
            if(Objects.equals(this.getCourse(), arrayOfStaff.get(i).getCourse())){
                staff =  arrayOfStaff.get(i).getName();
                break;
            }
        }
        return staff;
    }
}
