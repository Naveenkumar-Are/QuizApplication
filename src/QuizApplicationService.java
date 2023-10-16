public class QuizApplicationService {
    public static void main(String[] args) {

     Quiz std=new Quiz();
     System.out.println("Hey admin please create questions");
     std.generateQuestions(2);
     System.out.println("Dear student please note that if your answer" +
             " is correct you will be awarded by 2 points else your score will be deducted by -1"
     +"/n All the best and Start your quiz");
std.playQuiz();
std.checkAnswers();

    }
}