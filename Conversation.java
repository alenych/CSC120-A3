import java.util.Scanner;
import java.util.Random;
class Conversation {

  public static void main(String[] arguments) {
    //boolean stillGoing = true;

    // A list of chatbot responses that will be pulled at random
    String[] chatbot_responses = {"Very interesting",
                                  "Cool!",
                                  "Tell me more!",
                                  "I dont understant that",
                                  "Can you explain?"};
    Random rand = new Random();
  
    
    Scanner sc = new Scanner(System.in);
    
    // Chatbot introduction
    System.out.println("\nHello! My name is chatbot!");
    System.out.println("How many rounds of conversation would you like to have?");
    int nRound = sc.nextInt();
    sc.nextLine();
    
    // defining a variable transcript and count to keep count of how many lines in the chat
    String[] transcript = new String[nRound + 2];
    transcript[0] = "\nCool! What is on your mind today?";
    System.out.println(transcript[0]);
    
    // For loop that runs the chatbot until the user wants to stop
    for (int count = 0; count < nRound; count++) {
      String words = sc.nextLine();
      String computer_response;


      String mirrored_r = words.replace("\\bI\\b","you");
      mirrored_r = mirrored_r.replace("me", "you");
      mirrored_r = mirrored_r.replace("am", "are");
      mirrored_r = mirrored_r.replace("my","your");
      mirrored_r = mirrored_r.replace("your","my");
      mirrored_r = mirrored_r.replace("you", "I");


      

      
      // Chatbot mirrored version:
      
      
      if (!mirrored_r.equals(words)) {
        computer_response = mirrored_r;
        System.out.println(computer_response);
      }
      else {
        computer_response = chatbot_responses[rand.nextInt(chatbot_responses.length)];
        System.out.println(computer_response);
      }
    }
    System.out.println("Have a good day!");
    System.out.println(transcript);
    sc.close();
    
  }
}
  

    