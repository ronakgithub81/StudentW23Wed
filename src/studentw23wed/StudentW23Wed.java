
package studentw23wed;

/**
 *
 * @author Ronak
 */
public class StudentW23Wed {
    private String studentId;
    private String studentName;
    private String studentAddress;

    public StudentW23Wed(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }//end of constructor

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
      
    
}//end of class
