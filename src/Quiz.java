import java.util.Scanner;

public class Quiz {

    private Admin admin= new Admin();
   Question quest=new Question();

    int[] studentAnsList= new int[0];
    int studentAns;
    private static int score=0;

    private Student student=new Student();
    private Scanner scan = new Scanner(System.in);

    public void generateQuestions(int num) {
        admin.createQuestions(num);
        studentAnsList = new int[num];
    }

    public void playQuiz() {
        int questNum = 1;
        for (Question quest : admin.questionsList) {
            System.out.println("Question number " + quest.getqId() + ": " +" "+ quest.getQuestion());
            for (int i = 0; i < quest.options.length; i++) {
                System.out.println("option " + (i + 1)  +"  "+ quest.options[i]);
            }
            System.out.println("Student please choose the answer");
            studentAns = scan.nextInt();

            questNum++;
        }
        evaluateScore();

    }
public void evaluateScore() {
        int questionNum=1;
    for (Question quest : admin.questionsList) {
        if (studentAns == quest.getAnswer()) {
         score+=2;
            System.out.println("Congratulations its correct answer" + score);
        } else {
            score -= 1;
            System.out.println("Sorry wrong answer your score" + score);
        }
     questionNum++;
    }
}



    public void checkAnswers() {
        int questNum = 1;
        for (Question quest : admin.questionsList) {
            System.out.println("Question number " + quest.getqId() + " Correct Answer is " + quest.getAnswer());
              if (quest.getAnswer()==studentAns){
                System.out.println("Your answer is correct " + studentAns);
            } else {
                  System.out.println("Your answer is wrong");
        }
            questNum++;
        }
    }
}

