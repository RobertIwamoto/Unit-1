import java.util.Scanner;

class game {
public boolean loop = true;
public  int questionCount = 1;
public  int time = 5000;
public  int score = 0;

  public static void main(String[] args) {
//Quiz Introduction
    System.out.println("----------WELCOME TO THE QUIZ----------\n\n");
//The quiz will loop until the user gives up
    while(loop){
      System.out.println("----------QUESTION #"+questionCount+"----------\n");
      questionCount++;
      //Calculates the time in seconds
      int timeInSeconds = time / 1000;
      Scanner input = new Scanner(System.in);
      System.out.print("Are you willing to wait " + timeInSeconds +" seconds? (yes or no) ");
      String text = input.nextLine();
      //Checks the input, and either increases the time you must wait, or exits the loop
      if(text.equals("yes")){
        System.out.println("Okay! Let's wait!\nWaiting...");
        sleep(time);
        System.out.println("Done!");
        score++;
        time*=2;
      }else if(score == 0 && text.equals("no")){
        score-=1;
        System.out.println("If you say so...");
        loop = false;
      }else if(text.equals("no")){
        System.out.println("Alright then...");
        loop = false;
      //Simple command that will output if you don't input "yes" or "no"
      }else{
        System.out.println("Error: Text not recognized");
        //Makes it so the question number does not increase when you input incorrect statements.
        questionCount--;
      }
    }
    //Results of the users patience
      System.out.println("\n----------RESULTS----------");
      System.out.println("Your patience score: "+score);
      if(score == -1){
        System.out.println("You are so impatient that its incredible!\nThey that good things come to those that wait...");
      }else if(score < 5 && score > 2){
        System.out.println("Wow! You are very patient! Nice!");
      }else if(score < 2 && score >= 1){
          System.out.println("You are somewhat patient, but its better than nothing I suppose...");
      }else{
        System.out.println("Incredible! You are super patient! Amazing!");
      }
      System.out.println("\n----------END----------\n");
}
//This method makes the program pause for (time) milliseconds
public static void sleep(int time){
    try{
        Thread.sleep(time);
        }
    catch(InterruptedException ex){
        Thread.currentThread().interrupt();
                                }
}
}
