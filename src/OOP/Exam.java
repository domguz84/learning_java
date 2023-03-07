package OOP;

public class Exam {

    private Teacher exam_creator;
    private Student exam_student;
    private Question[] exam_questions;
    private int no_question;

    public Exam(Teacher exam_creator, Student exam_student) {
        this.exam_creator = exam_creator;
        this.exam_student = exam_student;
        this.no_question = 0;
        this.exam_questions = new Question[5];
    }

    public void addQuestion(String question) {
        if (no_question == 4) {
            throw new RuntimeException("You cannot set more than five questions in one exam");
        }
        exam_questions[no_question] = new Question(question);
        no_question++;
    }
}
