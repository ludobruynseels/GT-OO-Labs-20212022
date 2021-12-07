 


public class Course
{
    private String name;
    private Teacher teacher;
    
    public Course(String newName, Teacher newTeacher)
    {
        name = newName;
        teacher = newTeacher;
    }
    
    public void printInfo(){
        String taughtBy;
        if(teacher != null){
            taughtBy = teacher.getName();
        }
        else{
            taughtBy = "nobody";
        }
        
        System.out.println(name + " taught by " + taughtBy);
    }

   

}
