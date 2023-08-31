public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
//        Student student = new Student("Andrej", 12345, 1, 4.0);

        Student student1 = new Student();
            student1.setName("Andrej");
            student1.setStudentId(1216);
            student1.setNumberOfCredits(1);
            student1.setGpa(4.0);

        System.out.println(student1.getName());
    }
}
