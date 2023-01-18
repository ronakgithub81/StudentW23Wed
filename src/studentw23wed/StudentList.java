
package studentw23wed;

/**
 *
 * @author Ronak
 */
public class StudentList {
    public static void main(String[] args){
        //StudentW23Wed s1= new StudentW23Wed("s1","ronak");
        StudentW23Wed[] studentList = new StudentW23Wed[3];
        studentList[0]= new StudentW23Wed("s1","ronak");
        studentList[1]= new StudentW23Wed("s2","john");
        studentList[2]= new StudentW23Wed("s3","kevin");
        
        for(int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
        
        
    }//end of main
}//end of class
