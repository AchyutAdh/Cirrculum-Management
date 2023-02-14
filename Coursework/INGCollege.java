import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

    public class INGCollege implements ActionListener{
    public JFrame mainframe;
    public JPanel acapanel1, nonpanel2;
    public JLabel label0, label1, label2, label3, label4, label5,label6, label7,label8,label9,label10,
            label11,label12,label13, label23, label14, label15,label16, label17, label18, label19, label20, label21, label22;
    public JTextField textField1,textField2, textField3, textField4, textField5, textField6,
                        textField7, textField8, textField9, textField10, textField11,
                        textField12, textField13, textField14, textField15, textField16,textField17, textField18, textField19, textField20,
                        textField21;
    public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    public JMenu filemenu,editmenu,helpmenu;  
    public JMenuItem helpItem1, fileItem2, fileItem3, fileItem4, fileItem5; 
    
    ArrayList<Course> CourseArraylist = new ArrayList<Course>();
    
    public INGCollege () {
        mainframe = new JFrame(" Registration Form");
        mainframe.setSize(1100,600);
        mainframe.getContentPane().setBackground(new Color(224,208,216));
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        acapanel1 = new JPanel();
        acapanel1.setBounds(10,70,525,460);
        acapanel1.setBackground(new Color(229,144,126));
        acapanel1.setLayout(null);
        
        label1 = new JLabel("Academic Course");
        label1.setBounds(160,10,400,40);
        label1.setFont(new Font("Bookman Old Style",Font.BOLD,23));
        acapanel1.add(label1);
        
        label2 = new JLabel("Course ID:");
        label2.setBounds(15,70,120,25);
        label2.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label2);
        
        textField1 = new JTextField();
        textField1.setBounds(100,68,120,23);
        textField1.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField1);
        
        label3 = new JLabel("Course Name :");
        label3.setBounds(280,65,120,35);
        label3.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label3);
        
        textField2 = new JTextField();
        textField2.setBounds(390,70,120,23);
        textField2.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField2);
        
        label4 = new JLabel("Duration: ");
        label4.setBounds(15,130,120,25);
        label4.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label4);
    
        textField3 = new JTextField();
        textField3.setBounds(100,128,80,23);
        textField3.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField3);
        
        label5 = new JLabel("Credit: ");
        label5.setBounds(340,120,190,35);
        label5.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label5);
    
        textField4 = new JTextField();
        textField4.setBounds(390,125,80,23);
        textField4.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField4);
        
        label6 = new JLabel("Level :");
        label6.setBounds(15,190,120,25);
        label6.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label6);
        
        textField5 = new JTextField();
        textField5.setBounds(100,188,120,23);
        textField5.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField5);
        
        label7 = new JLabel("Num. Of Assessment: ");
        label7.setBounds(250,185,180,35);
        label7.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label7);
    
        textField6 = new JTextField();
        textField6.setBounds(390,190,70,25);
        textField6.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField6);
        
        
        label23 = new JLabel("Course ID: ");
        label23.setBounds(15,280,180,35);
        label23.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label23);
    
        textField21 = new JTextField();
        textField21.setBounds(110,280,120,23);
        textField21.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField21);
        
        label8 = new JLabel("Start Date: ");
        label8.setBounds(15,330,120,25);
        label8.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label8);
    
        textField7 = new JTextField();
        textField7.setBounds(110,328,120,23);
        textField7.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField7);
        
        label9 = new JLabel("Completion Date: ");
        label9.setBounds(270,330,150,35);
        label9.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label9);
    
        textField8 = new JTextField();
        textField8.setBounds(390,328,120,23);
        textField8.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField8);
        
        label10 = new JLabel("Lecturer Name: ");
        label10.setBounds(15,380,130,25);
        label10.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label10);
    
        textField9 = new JTextField();
        textField9.setBounds(120,378,120,23);
        textField9.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField9);
        
        label11 = new JLabel("Course Leader: ");
        label11.setBounds(270,380,130,25);
        label11.setFont(new Font("Arial",Font.BOLD,13));
        acapanel1.add(label11);
        
           
        textField10 = new JTextField();
        textField10.setBounds(390,378,120,23);
        textField10.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        acapanel1.add(textField10);
        
        button1 = new JButton("Add Course");
        button1.setFont(new Font("Arial",Font.BOLD,13));
        button1.setBounds(210,240,110,25);
        acapanel1.add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Register");
        button2.setFont(new Font("Arial",Font.BOLD,13));
        button2.setBounds(40,420,120,30);
        acapanel1.add(button2);
        button2.addActionListener(this);
        
        button3 = new JButton(" Display ");
        button3.setFont(new Font("Arial",Font.BOLD,13));
        button3.setBounds(230,420,90,30);
        button3.addActionListener(this);

        acapanel1.add(button3);
        
        button4 = new JButton("Clear ");
        button4.setFont(new Font("Arial",Font.BOLD,13));
        button4.setBounds(400,420,90,30);
        button4.addActionListener(this);
        acapanel1.add(button4);
        
        
        //code for non academic course in panel 2 
        
        nonpanel2 = new JPanel();
        nonpanel2.setBounds(550,70,525,460);
        nonpanel2.setBackground(new Color(195,150,213));
        nonpanel2.setLayout(null);
        
        label12 = new JLabel("Non-Academic Course");
        label12.setBounds(150,10,400,40);
        label12.setFont(new Font("Bookman Old Style",Font.BOLD,23));
        nonpanel2.add(label12);
        
        label13 = new JLabel("Course ID:");
        label13.setBounds(15,70,120,25);
        label13.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label13);
        
        textField11 = new JTextField();
        textField11.setBounds(100,68,120,23);
        textField11.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField11);
        
        label14 = new JLabel("Course Name:");
        label14.setBounds(280,65,120,35);
        label14.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label14);
        
        textField12 = new JTextField();
        textField12.setBounds(390,70,120,23);
        textField12.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField12);
        
        label15 = new JLabel("Duration:");
        label15.setBounds(15,130,120,25);
        label15.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label15);
        
        textField13 = new JTextField();
        textField13.setBounds(100,128,120,23);
        textField13.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField13);
        
        label16 = new JLabel("Prerequisite: ");
        label16.setBounds(280,125,190,35);
        label16.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label16);
    
        textField14 = new JTextField();
        textField14.setBounds(390,130,120,23);
        textField14.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField14);
        
        button5 = new JButton("Add Course");
        button5.setFont(new Font("Arial",Font.BOLD,13));
        button5.setBounds(200,180,110,25);
        nonpanel2.add(button5);
        button5.addActionListener(this);
        
        label17 = new JLabel("Course ID: ");
        label17.setBounds(20,240,120,25);
        label17.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label17);
        
        textField15= new JTextField();
        textField15.setBounds(100,238,120,23);
        textField15.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField15);
        
        label18 = new JLabel("Course Leader: ");
        label18.setBounds(280,235,150,35);
        label18.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label18);
    
        textField16 = new JTextField();
        textField16.setBounds(390,238,120,23);
        textField16.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField16);
        
        label19 = new JLabel("Instructor: ");
        label19.setBounds(20,300,120,25);
        label19.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label19);
    
        textField17 = new JTextField();
        textField17.setBounds(100,298,120,23);
        textField17.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField17);
        
        
        label20 = new JLabel("Start Date: ");
        label20.setBounds(280,295,150,35);
        label20 .setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label20 );
    
        textField18 = new JTextField();
        textField18.setBounds(390,298,120,23);
        textField18.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField18);
        
        label21 = new JLabel("Completion Date: ");
        label21.setBounds(20,360,120,25);
        label21.setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label21);
    
        textField19 = new JTextField();
        textField19.setBounds(140,358,120,23);
        textField19.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField19);
        
        
        label22 = new JLabel("Exam Date: ");
        label22.setBounds(300,355,150,35);
        label22 .setFont(new Font("Arial",Font.BOLD,13));
        nonpanel2.add(label22);
    
        textField20 = new JTextField();
        textField20.setBounds(390,358,120,23);
        textField20.setFont(new Font("Bookman Old Style",Font.BOLD,13));
        nonpanel2.add(textField20);
        
        button6 = new JButton("Register");
        button6.setFont(new Font("Arial",Font.BOLD,13));
        button6.setBounds(40,420,100,30);
        nonpanel2.add(button6);
        button6.addActionListener(this);
        
        button7 = new JButton(" Remove ");
        button7.setFont(new Font("Arial",Font.BOLD,13));
        button7.setBounds(170,420,100,30);
        nonpanel2.add(button7);
        button7.addActionListener(this);
        

        button8 = new JButton("Display");
        button8.setFont(new Font("Arial",Font.BOLD,13));
        button8.setBounds(300,420,80,30);
        nonpanel2.add(button8);
        button8.addActionListener(this);

        button9 = new JButton("Clear");
        button9.setFont(new Font("Arial",Font.BOLD,13));
        button9.setBounds(420,420,70,30);
        button9.addActionListener(this);
        nonpanel2.add(button9);
        
        JMenuBar menubar = new JMenuBar();
        filemenu = new JMenu("File");
        filemenu.add(new JSeparator());
      
        editmenu = new JMenu("Edit");
        editmenu.add(new JSeparator());
      
        helpmenu = new JMenu("Help");
        helpItem1 = new JMenuItem("About");
        
        helpItem1.addActionListener(this);
        helpmenu.add(new JSeparator());
        
        
        
        fileItem2 = new JMenuItem("New1");
        
        fileItem2.addActionListener(this);
        
        fileItem3 = new JMenuItem("Save");
        fileItem3.addActionListener(this);
        
        
        fileItem4 = new JMenuItem("Exit");
        fileItem4.addActionListener(this);
        
        
        
        filemenu.add(fileItem2);
        filemenu.add(fileItem3);
        filemenu.add(fileItem4);
        helpmenu.add(helpItem1);
        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);
        mainframe.setJMenuBar(menubar);
        
        
    
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
        mainframe.setLayout(null);
        mainframe.setResizable(true);
        mainframe.add(acapanel1);
        mainframe.add(nonpanel2);
        
                
        JLabel label0 = new JLabel ("Course Registration");
        label0.setBounds(390,10,400,40);
        label0.setFont(new Font("Bookman Old Style",Font.BOLD,29));
        mainframe.add(label0);
        
    }
    
        public void actionPerformed(ActionEvent e){
    
             if(e.getSource()==button1){ /*adding academic course*/
                try{
                String courseid = textField1.getText();
                String coursename = textField2.getText();
                String duration = textField3.getText();
                String level = textField4.getText();
                String Credit = textField5.getText();
                String numOfAssessments = textField6.getText();
                if(courseid.isEmpty() || coursename.isEmpty() || duration.isEmpty() || level.isEmpty() || Credit.isEmpty() || 
                numOfAssessments.isEmpty()){
                    throw new Exception();
                }                    
                else{ 
                    int Duration = Integer.parseInt(duration);
                    int NumOfAssessments = Integer.parseInt(numOfAssessments);
                    
                    AcademicCourse academic = new AcademicCourse(courseid, coursename,Duration , level, Credit,NumOfAssessments);
                    
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    textField6.setText("");

                    
                    CourseArraylist.add(academic); 
                    JOptionPane.showMessageDialog(acapanel1, "Success!! The Academic Course has been added.", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    
           
                }
            }
            
            catch(NumberFormatException es)
                    {
                JOptionPane.showMessageDialog(acapanel1, "Please enter a whole number in duration and no. of assessment.","WARNING MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
             
            catch(Exception es)
            {
                    JOptionPane.showMessageDialog(acapanel1,"The text fields cannot be empty. Please fill it.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        else if(e.getSource()==button2) { // for registering academic course
            try{
                String courseid = textField21.getText();
                String courseleader = textField10.getText();
                String lecturername = textField9.getText();
                String startdate = textField7.getText();
                String completiondate = textField8.getText();
                
 
                if(courseid.isEmpty() || courseleader.isEmpty() || lecturername.isEmpty() || startdate.isEmpty() || completiondate.isEmpty()){
                    throw new Exception();
                }
                else{
                    if (CourseArraylist.isEmpty()){
                        JOptionPane.showMessageDialog(acapanel1, "Please add a course first to register it.","Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        boolean ValidCheck = false;
                        //int courseid = Integer.parseInt(courseID);
                        for (Course co: CourseArraylist){
                            if(co instanceof AcademicCourse && courseid.equals(co.getcourseID())){
                                AcademicCourse ac = (AcademicCourse)co;
                                if(ac.getisRegistered()==false){
                                    ac.register(courseleader, lecturername, startdate, completiondate );
                                    JOptionPane.showMessageDialog(acapanel1, "The course has been registered.Thank you!","Message",JOptionPane.INFORMATION_MESSAGE);
                                    ValidCheck = true;
                                    textField21.setText("");
                                    textField10.setText("");
                                    textField9.setText("");
                                    textField7.setText("");
                                    textField8.setText("");
                                }
                                else{
                                    JOptionPane.showMessageDialog(acapanel1, "Ops! The Course has already been registered.","Message",JOptionPane.INFORMATION_MESSAGE);
                                    ValidCheck = true;
                                }
                                
                            }
                            

                        }
                        
                        if(!ValidCheck){
                            JOptionPane.showMessageDialog(acapanel1, "Sorry! No course with such ID exist.","Message",JOptionPane.INFORMATION_MESSAGE);
                        
                            textField21.setText("");
                            textField10.setText("");
                            textField9.setText("");
                            textField7.setText("");
                            textField8.setText("");
                        }  
                    
                    }
                }
                }
            catch(Exception es)
            {
                JOptionPane.showMessageDialog(acapanel1, "Fields cannot be empty. Please fill it.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == button4 ){
                textField1.setText(""); textField2.setText(""); textField3.setText(""); textField4.setText("");
                textField5.setText(""); textField6.setText(""); textField7.setText(""); textField8.setText(""); 
                textField9.setText(""); textField10.setText(""); textField21.setText("");
        }
        else if(e.getSource() == button4){
            if(CourseArraylist.size()<=0){
                JOptionPane.showMessageDialog(acapanel1,"Course is not yet registered!","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            }
        
        
        else if (e.getSource() == button3) { //displaying academic course
                    for (Course course: CourseArraylist){
                    if(course instanceof AcademicCourse)
                    {
                        AcademicCourse academic = (AcademicCourse)course;
                        academic.display();
                    }
                    else{
                        NonAcademicCourse nonacademic = (NonAcademicCourse)course;
                        nonacademic.display();  
            
                    }  
                
      
                } 
    
            }
        }
        else if(e.getSource() == button5){ //addingnonacdemic
            try{
                String courseid = textField11.getText();
                String coursename = textField12.getText();
                String Duration = textField13.getText();
                String Prerequisite = textField14.getText();
                
                if(courseid.isEmpty() || coursename.isEmpty() || Duration.isEmpty() || Prerequisite.isEmpty()){
                    throw new Exception();
                }
                else{
                    int duration = Integer.parseInt(Duration);
                    NonAcademicCourse nonacademic = new NonAcademicCourse(courseid, coursename, duration, Prerequisite);
                    
                    textField11.setText("");
                    textField12.setText("");
                    textField13.setText("");
                    textField14.setText("");
                    
                    
                    CourseArraylist.add(nonacademic);
                    JOptionPane.showMessageDialog(nonpanel2, "Success!! The Non-Academic Course has been added.", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    
                    

                }
            }
             catch(NumberFormatException es)
                    {
                JOptionPane.showMessageDialog(nonpanel2, "Please enter a whole number in duration textfield.","WARNING MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
             
            catch(Exception es)
            {
                    JOptionPane.showMessageDialog(nonpanel2,"The text fields cannot be empty. Please fill it.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }

        }
        else if(e.getSource() == button6){ //registering nonacademiccourse
            try{
                String courseid = textField15.getText();
                String courseleader = textField16.getText();
                String lecturername = textField17.getText();
                String startdate = textField18.getText();
                String completiondate = textField19.getText();
                String examdate = textField20.getText();
                
                if(courseid.isEmpty() || courseleader.isEmpty() || lecturername.isEmpty() || startdate.isEmpty() || completiondate.isEmpty() || examdate.isEmpty()){
                    throw new Exception();
                }
                else{
                    if (CourseArraylist.isEmpty()){
                        JOptionPane.showMessageDialog(nonpanel2, "Please add a course first to register it.","Message",JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                    else{
                        boolean ValidCheck = false;
                        for(Course course : CourseArraylist){
                            if(course instanceof NonAcademicCourse && courseid.equals(course.getcourseID())){
                                NonAcademicCourse nonacademic = (NonAcademicCourse)course;
                                if(nonacademic.isRegistered() == false){
                                    nonacademic.register(courseleader, lecturername, startdate, completiondate, examdate);
                                    JOptionPane.showMessageDialog(nonpanel2, "The course has been registered.Thank you!","Message",JOptionPane.INFORMATION_MESSAGE);
                                    ValidCheck = true;
                                    textField15.setText("");
                                    textField16.setText("");
                                    textField17.setText("");
                                    textField18.setText("");
                                    textField19.setText("");
                                    textField20.setText("");
                                }
                                else{
                                    JOptionPane.showMessageDialog(nonpanel2, " Course has already been registered.","Message",JOptionPane.INFORMATION_MESSAGE);
                                    ValidCheck = true;
                                    textField15.setText("");
                                    textField16.setText("");
                                    textField17.setText("");
                                    textField18.setText("");
                                    textField19.setText("");
                                    textField20.setText("");
                                }
                            
                            }
                            
                        }
                        if(!ValidCheck){
                            JOptionPane.showMessageDialog(nonpanel2, "Sorry! No any course with such ID is added.","Message",JOptionPane.INFORMATION_MESSAGE);
                            textField15.setText("");
                        }
                    }
                }
            }
            catch(Exception es){
                JOptionPane.showMessageDialog(nonpanel2, "Fields cannot be empty.Please fill it.","Warning Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(e.getSource() == button9){
                textField11.setText(""); textField12.setText(""); textField13.setText(""); textField14.setText("");
                textField15.setText(""); textField16.setText(""); textField17.setText(""); textField18.setText(""); 
                textField19.setText(""); textField20.setText("");
        }
        else if(e.getSource() == button7){
            
            String courseid = textField15.getText();
            String courseleader = textField16.getText();
            String instructorname = textField17.getText();
            String startdate = textField18.getText();
            String completiondate = textField19.getText();
            String examdate = textField20.getText();
            
            
            boolean ValidCheck = false;
                    for(Course course : CourseArraylist){
                        if(course instanceof NonAcademicCourse && courseid.equals(course.getcourseID())){
                            NonAcademicCourse nonacademic = (NonAcademicCourse)course;
                            if(nonacademic.isRemoved() == false)
                            {
                                nonacademic.remove();
                                
                    int response= JOptionPane.showConfirmDialog(nonpanel2, "Are you sure you want to remove the course?","Confirm",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                                if (response == JOptionPane.YES_OPTION){
                        ValidCheck = true;
                        textField11.setText("");
                        textField12.setText("");
                        textField13.setText("");
                        textField14.setText("");
                        textField15.setText("");
                        textField16.setText("");
                        textField17.setText("");
                        textField18.setText("");
                        textField19.setText("");
                        textField20.setText("");
                        System.out.println("The Course has been removed.");
                    }
                    
                    }
                }
            }  
            
                    if(!ValidCheck){
                        JOptionPane.showMessageDialog(nonpanel2, "course ID is not registered..","Message",JOptionPane.INFORMATION_MESSAGE);
                    } 
            
        
        
        }
        else if(e.getSource() == button8 || e.getSource()== button3){

            
                for (Course course: CourseArraylist){
                    if(course instanceof AcademicCourse)
                    {
                        AcademicCourse academic = (AcademicCourse)course;
                        academic.display();
                    }
                    else{
                        NonAcademicCourse nonacademic = (NonAcademicCourse)course;
                        nonacademic.display();  
            
                    }  
            
      
                } 
        
    
            
        }
        else if(e.getSource() == fileItem2)
            {
                textField1.setText(""); textField2.setText(""); textField3.setText(""); textField4.setText(""); textField5.setText("");
                textField6.setText(""); textField7.setText(""); textField8.setText(""); textField9.setText(""); textField10.setText("");
                textField11.setText("");textField12.setText("");textField13.setText(""); textField14.setText(""); textField15.setText(""); 
                textField16.setText(""); textField17.setText(""); textField18.setText(""); textField19.setText(""); textField20.setText("");
                textField21.setText("");
                }
                
        else if(e.getSource() == fileItem4){
                System.exit(0);  
            
            }
        
        else if(e.getSource() == helpItem1)
            {
                
            JOptionPane.showMessageDialog(mainframe, "This GUI is a registration form which consists of information related to academic and non academic course in Islington College.",
                                                        "INFO", JOptionPane.INFORMATION_MESSAGE);
                    
            }
    
    }
    
    
   public static void main(String[]arg)
       {
          new INGCollege();
       }
}
