public class NonAcademicCourse extends Course{
    private String instructorName;
    private int duration;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private Boolean isRegistered;
    private Boolean isRemoved;
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false; 
    }
    int duration(){
        return duration;
    }
    String startDate(){
        return startDate;
    }
    String completionDate(){
        return completionDate;
    }
    String examDate(){
        return examDate;
    }
    String prerequisite(){
        return prerequisite;
    }
    Boolean isRegistered(){
        return isRegistered;
    }
    Boolean isRemoved(){
        return isRemoved;
    }
    void setinstructorName(String instructorName){
        if(this.isRegistered == true){
            System.out.println("This course is already registered. So it is not possible to change the instructor name");
        }
        else{
            this.instructorName = instructorName;
        }
    }
    void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(this.isRegistered == true){
            System.out.println("This course is already registered.");
        }
        else{
            super.setcourseLeader(courseLeader);
            this.instructorName = instructorName;
            this.startDate= startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
        }
    }
    void remove(){
        if(this.isRemoved == true){
            System.out.println("The course is already removed");
        }
        else{
            System.out.println("The course is removed");
            super.setcourseLeader("");
            this.instructorName = "";
            this.startDate= "";
            this.completionDate = "";
            this.examDate = "";
            this.isRemoved = true;
        }
    }
    public void display(){
        super.display();
        if(this.isRegistered = true){
            System.out.println("The name of the instructor is " + this.instructorName);
            System.out.println("The course will start from " + this.startDate);
            System.out.println("The course will be completed in " + this.completionDate);
            System.out.println("The exam of this course will be held in " + this.examDate);
        }
        else{
            System.out.println("The course has not yet been registered");
        }
    }
}


    
