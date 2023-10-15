import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private Admin admin = new Admin();

    private int studentAns;
    private boolean skip;
    private int[] studentAnswers = new int[0];

    private Scanner scan = new Scanner(System.in);
    private static int score=0;

    public void generateQuestions(int num) {
        admin.createQuestions(num);
        studentAnswers = new int[num];
    }

    public void playQuiz() {
        int questNum = 1;
        for (Question quest : admin.questionsList) {
            System.out.println("Question number" + quest.getqId() + ":" + quest.getQuestion());
            for (int i = 0; i < admin.optns.length; i++) {
                System.out.println("option" + i + 1 + admin.optns[i]);
            }
            System.out.println("Student please choose the answer");
            studentAns = scan.nextInt();

            //need to improve by creating a method to check the correct answers
            if(studentAns==quest.getAnswer()){
                score+=2;
                System.out.println("Congratulations its correct answer"+ score);
            }else {
                score-=1;
                System.out.println("Sorry wrong answer your score"+ score);
            }
            questNum++;
        }

        System.out.println("Dear Student your total score is "+ score);
    }



public void checkAnswers(){
        int questNum=1;
    for(Question quest: admin.questionsList){
        System.out.println("Question number"+quest.getqId()+" Correct Answer"+quest.getAnswer());
        for(int i=0;i< admin.optns.length;i++){
            System.out.println("Your answer"+ studentAnswers[i] );
        }
        questNum++;
  }
}



}


