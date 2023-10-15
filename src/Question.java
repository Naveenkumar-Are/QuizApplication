public class Question {
    private String question;
   protected   String [] options;
   private int answer;
    private static int score;
    private int qId;

    private int[] answerList;

    public Question() {
    }

    public int[] getAnswerList() {
        return answerList;
    }

    public void setAnswerList(int[] answerList) {
        this.answerList = answerList;
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public Question(int qId, String question, String[] options, int answer){
        this.question=question;
        this.options=options;
        this.answer=answer;
        this.qId=qId;
    }
   // public void points(){
     //   if(this.answer==) {
       //     score += 2;
       //     System.out.println("Hey!Congratulations correct answer you score is increased by 2 points"+ score);
      //  } else {
       //     score -= 1;
       //     System.out.println("Sorry Its wrong answer your score is decreased by 1 point"+score);
      //  }

    //}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Question.score = score;
    }
}
