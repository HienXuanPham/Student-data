import java.io.File;
import java.io.FileNotFoundException;
import java.io.OptionalDataException;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import static java.lang.Integer.*;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        // Load file
        // Create two arrays, one for staff and one for students
        // they will be empty at the start
        // Loop through each line
        // split using StringTokenizer
        // if the Type is "Student", then put their information into Student array.
        // if the Type is "Staff", then put their information into Staff array.

        String fileName = "C:\\Users\\phamx\\Documents\\LaGuardia CC\\MAC190\\student2.csv";
        Scanner input = null;

        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        int i = 0;
        int j = 0;

        ArrayList<Student> students = new ArrayList<Student>(100);
        ArrayList<Staff> staffs = new ArrayList<Staff>(100);

        input.nextLine();
        while (input.hasNextLine()) {
            StringTokenizer token = new StringTokenizer(input.nextLine(), ",");

            int id = parseInt(token.nextToken());
            String name = token.nextToken();
            String type = token.nextToken();
            String department = token.nextToken();
            String course = token.nextToken();

            if (Objects.equals(type, "Student")) {

                // set details for person here
                // put this person into the student array

                students.add(i, new Student(id, name, department, course));
                i++;
            } else if (Objects.equals(type, "Staff")) {

                // set details for person here
                // put this person into the staff array

                staffs.add(j, new Staff(id, name, department, course));
                j++;
            }
        }
        input.close();
        // now the file is loaded, do something using methods:
        // loop through all of the students
        // for each student:
        //    print their information.
        //    print the name of their teacher using student.getTeacherName( staff )
        Student s = new Student();
        s.printOutput();
        for(int k = 0; k < i; k++) {
            System.out.println("Name: " + students.get(k).getName() +
                    "\t\t\t ID: " + students.get(k).getID() +
                    "\t\t\t Student's teacher name: " + students.get(k).getTeacherName(staffs, j) +
                    "\t\t\t Course: " + students.get(k).getCourse());
        }
        Staff t = new Staff();
        t.printOutput();
        for(int k = 0; k < j; k++){
            System.out.println("Staff's name: " + staffs.get(k).getName() +
                    "\t\t\t Department: " + staffs.get(k).getDepartment());
        }
    }
}
