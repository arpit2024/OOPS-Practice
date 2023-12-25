package AccessModifiers;
import AccessModifiers.Student;
public class StudentChild extends Student {
    public static void main(String[] args){
        //Student st=new Student();
        Student st=new StudentChild();

        //st.name="raghu";
        st.age=10;
        st.psp=22;
        st.batchid=36;

    }
}
