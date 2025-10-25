/**
 * Executable class of Student class
 * 
 * @author (Eduardo Lopez)
 * @author (Joan Mauri) 
 * @version (22/08/25)
 */

public class StudentApp
{
    public static void main(String args[]){
        //Arguments are passed by the main method
        int lu = Integer.valueOf(args[0]);
        String name = args[1];
        String lastName = args[2];
        
        //Instance of class
        Student oneStudent = new Student(lu, name, lastName);
        
        //setGrade1() and setGrade2() methods
        oneStudent.setGrade1(5.99);
        oneStudent.setGrade2(10);
        oneStudent.print();
        
        //lastAndName() method
        System.out.println(oneStudent.lastAndName());
        
    }
}