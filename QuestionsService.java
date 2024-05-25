
import java.util.Scanner;
public class QuestionsService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionsService(){
        //using constructor we set all the values
        questions[0] = new Question(1,"what is oops means", "object","oriented","programming","object oriented programming","object oriented programming");
        questions[1] = new Question(2,"what is size of int", "2","6","4","8","4");
        questions[2] = new Question(3,"what is size of char", "2","6","4","8","2");
        questions[3] = new Question(4,"what is size of long","2","6","4","8","8");
        questions[4] = new Question(5,"what is size of boolean", "1","6","4","8","1");

    }

    public void playQuiz(){
        //printing values enhance for loop
        int i=0;
        for(Question q: questions){
            System.out.println("Question:"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            //this loop runs 5 times save it in array
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s: selection){
            System.out.println(s);
        }



    }

    public void printScore()
    {
        int score = 0;
        for(int i=0;i<questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is:"+ score);
    }

    
}
