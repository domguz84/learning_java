package OOP;

public class Question {
    private String question;
    private Answer[] answers;
    private int no_answer;

    public Question(String question) {

        this.question = question;
        this.answers = new Answer[3];
        this.no_answer = 0;
    }

    public void addAnswer(String content, boolean is_correct) {
        if (no_answer == 2) {
            throw new RuntimeException("You cannot set more than three answers in one question");
        }
        answers[no_answer] = new Answer(content, is_correct);
        no_answer++;
    }

}
