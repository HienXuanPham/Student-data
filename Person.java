public abstract class Person {
    private String name;
    private int ID;
    private String department;
    private String course;
    //Constructor
    public Person(){
        name = null;
        ID = 0;
        department = null;
        course = null;
    }
    // abstract method
    public abstract void printOutput();
    //Mutator
    public void setName(String newName){ name = newName; }
    public void setID(int newID){ ID = newID; }
    public void setDepartment(String newDepartment) { department = newDepartment; }
    public void setCourse(String newCourse){ course = newCourse; }
    //Accessor
    public String getName(){ return name; }
    public int getID(){ return ID; }
    public String getDepartment(){ return department; }
    public String getCourse(){ return course; }
}
