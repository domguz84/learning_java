package OOP;

public class Teacher extends Person {


    public Teacher(String name) {
        super(name);
    }

    public Exam createExam(Student exam_student) {

        Exam ex = new Exam(this, exam_student);
        return ex;
    }
}
