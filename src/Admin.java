import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    protected ArrayList<Question> questionsList= new ArrayList<>();

    private final Scanner scan=new Scanner(System.in);
    int studentAns;

    private final Question question1= new Question();
public void createQuestions(int numOfQuestions){


for(int i=0;i< numOfQuestions;i++){

  Question question= new Question();
  System.out.println("Please enter the question number");
  int num= scan.nextInt();
  question.setqId(num);
  scan.nextLine();
    System.out.println();
    System.out.println("Please enter question");
    String quse=scan.nextLine();
    question.setQuestion(quse);



    System.out.println("Please enter the options");
     question.options= new String[4];
    for (int j=0;j<question.options.length;j++){
       question.options[j] = scan.nextLine();
    }
    question.setOptions(question.options);

    System.out.println("Please enter answer");
    int answ=scan.nextInt();
    question.setAnswer(answ);

    questionsList.add(question);
}



}
public void display(){
    int questionNumber=1;
    for(Question quest: questionsList){
        System.out.println("Question number"+quest.getqId()+":"+quest.getQuestion());
        for(int i=0;i<= question1.options.length;i++){
        System.out.println("option"+question1.options[i]);
    }
        questionNumber++;
    }

}


}


