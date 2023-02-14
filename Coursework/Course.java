public class Course {
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    public Course(String courseID, String courseName, int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    public String getcourseID(){
        return courseID;
    } 
    public String getcourseName(){ 
        return courseName;
    } 
    public int getduration(){ 
        return duration;
    }
    public void setcourseLeader(String courseLeader){
        this.courseLeader = courseLeader;
    }
    public String getcourseLeader(){
        return courseLeader;
    }
    public void display(){
        System.out.println("The course ID is: " + courseID);
        System.out.println("The course name is: " + courseName);
        System.out.println("The course duration is: " + duration);
        if(courseLeader!=""){
        System.out.println("The course lead is: " + courseLeader);
        }
    }
}