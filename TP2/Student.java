/**
 * The Student class contains the personal data of a student, including: lu, name, last name and their two grades
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
public class Student
{
    private int lu;
    private String name;
    private String lastName;
    private double grade1;
    private double grade2;

    /**
     * This is a constructor to initialize an object of the class Student
     * @param p_lu the report card of the student
     * @param p_lastName the last name of the student
     * @param p_name the name of the student
     */
    Student(int p_lu, String p_name, String p_lastName){
        this.setLu(p_lu);
        this.setName(p_name);
        this.setLastName(p_lastName);
        this.setGrade1(0.0);
        this.setGrade2(0.0);
    }
    
    //setters
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setName(String p_name){
        this.name = p_name;
    }
    
    private void setLastName(String p_lastName){
        this.lastName = p_lastName;
    }
    
    public void setGrade1(double p_grade){
        this.grade1 = p_grade;
    }
    
    public void setGrade2(double p_grade){
        this.grade2 = p_grade;
    }
    
    //getters
    private int getLU(){
        return this.lu;
    }
    
    private String getName(){
        return this.name;
    }
    
    private String getLastName(){
        return this.lastName;
    }
    
    private double getGrade1(){
        return this.grade1;
    }
    
    private double getGrade2(){
        return this.grade2;
    }
    
    /**
     * This method calculates the grades´ average of the student
     * @return: average points
     */
    public double average(){
        return ((this.getGrade1() + this.getGrade2())/2);
    }
    
    /**
     * This method indicates wether the student had approved or dissaproved based on the average and their grades
     * @return: true (if the average is greater or equal than 7 and both grades are greater or equal than 6)
     * @return: false (if the average is lower than 7 OR if any grade is lower than 6)
     */
    private boolean approves(){
        
        return(average()>=7 && (this.getGrade1() >=6 && this.getGrade2() >= 6));
        
    }
    
    /**
     * This method indicates wether the student had approved or dissaproved based on the return value of the previous method
     * @return A string "APROOVED" is returned if the approves() method returns true
     * @return A string "DISAPPROVED" is returned if the approves() method returns false
     */
    private String approveLegend(){
        if(approves()){
            return("APROOVED");
        }else{
            return("DISAPPROVED");
        }
    }
    
    /**
     * This method returns the student´s name and last name
     * @return name and last name (in that order)
     */
    public String nameAndLast(){
        return(this.getName() + " " + this.getLastName());
    }
    
    
    /**
     * This method returns the student´s name and last name
     * @return last name and name (in that order)
     */
    public String lastAndName(){
        return(this.getLastName() + " " + this.getName());
    }
    
    /**
     * This method shows the personal data of the student, their grades, average and indicates if it is approved or not
     */
    public void print(){
        System.out.println("Name and last name: "+ this.nameAndLast());
        System.out.println("LU: " + this.getLU() + "\t" + "Grades: " + this.getGrade1() + "-" + this.getGrade2());
        System.out.println("Average: " + this.average() + "-" + this.approveLegend());
    }
    
    
    
    
}