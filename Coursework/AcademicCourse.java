public class AcademicCourse extends Course{
    private String lecturerName;
    private String level;
    private String credit;
    private String startDate;
    private String completionDate;
    private int numOfAssessments;
    Boolean isRegistered;
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numOfAssessment){
        super(courseID, courseName, duration);
        this.level = level;
        this.credit = credit;
        this.numOfAssessments = numOfAssessment;
        this.lecturerName = "";
        this.startDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    String getlevel(){ 
        return level;
    }
    String getcredit(){
        return credit;
    }
    int getnumOfAssessments(){
        return numOfAssessments;
    }
    String getstartDate(){
        return startDate;
    }
    String getcompletionDate(){
        return completionDate;
    }
    Boolean getisRegistered(){
        return isRegistered;
    }
    void setlecturerName(String lecturerName){
        this.lecturerName = lecturerName;
    }
    String getlecturerName(){
        return lecturerName;
    }
    void setnumOfAssessment(int newnumOfAssessments){
        this.numOfAssessments = newnumOfAssessments;
    }
    void register(String courseLeader, String lecturerName, String startDate, String completionDate){
        if(this.isRegistered == true){
            System.out.println("This course is already registered.");
            System.out.println("The name of the lecturer is " + lecturerName);
            System.out.println("The start date of the course is " + startDate);
            System.out.println("The completion date of the course is  " + completionDate);
        }
        else{
            super.setcourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startDate= startDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    public void display(){
        super.display();
        if(this.isRegistered = true) {
            System.out.println("The name of the lecturer is " + lecturerName);
            System.out.println("The level of the course is " + level);
            System.out.println("The total credit of the course is " + credit);
            System.out.println("The start date of the course is " + startDate);
            System.out.println("The completion date of the course is  " + completionDate);
            System.out.println("The total number of assessments of this course is " + numOfAssessments);
        }
        else{
            System.out.println("This course is not registered.");
        }
    }
}
