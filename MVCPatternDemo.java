public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        //fetch  student record based on his roll no from the database

        StudentView view = new StudentView();
        //Create a view: to write student details on console

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");  //update model data
        controller.setStudentRollNo("11");  //update model data

        controller.updateView();

    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName( "Robert");
        student.setRollNo("10");
        return student;
    }
}
