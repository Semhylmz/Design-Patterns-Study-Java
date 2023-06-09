package behavior.iterator;

public class FasiculBook {
    private String fasiculName;
    private Question[] questions;

    public FasiculBook(String fasiculName) {
        this.fasiculName = fasiculName;
        this.questions = new Question[10];

        questions[0] = new Question(6L);
        questions[1] = new Question(7L);
        questions[2] = new Question(8L);
        questions[3] = new Question(9L);
        questions[4] = new Question(10L);
        questions[5] = new Question(11L);
        questions[6] = new Question(12L);
        questions[7] = new Question(13L);
        questions[8] = new Question(14L);
        questions[9] = new Question(15L);
    }

    public String getFasiculName() {
        return fasiculName;
    }

    public void setFasiculName(String fasiculName) {
        this.fasiculName = fasiculName;
    }

    public QuestionIterator getQuestionIterator() {
        return new QuestionIterator(questions);
    }

}
