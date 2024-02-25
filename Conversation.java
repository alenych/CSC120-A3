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
    //String[] transcript = new String[nRound+2];
    //transcript[0] = "\nCool! What is on your mind today?";
    //System.out.println(transcript[0]);
    
    // For loop that runs the chatbot until the user wants to stop
    for (int count = 0; count < nRound; count++) {
      String words = sc.nextLine();
      String computer_response;


      /* 
      String[] arrwords = words.split(" ");
      //for (int i=0; i < arrwords.length; i++){
      for (String checkPronouns : arrwords){
        //System.out.println(checkPronouns);
        if (checkPronouns.contains("I")){
          String[] new = checkPronouns.replace("I","you");
          System.out.println(new);
        }
      }
        /* */

      
      String mirrored_r = words.replace("I","you");
      mirrored_r = mirrored_r.replace("me", "you");
      mirrored_r = mirrored_r.replace("am", "are");
      mirrored_r = mirrored_r.replace("my","your");
      
      // To make sure it does not re replace already converted pronouns
      if (!words.contains("I")){
        mirrored_r = mirrored_r.replace("you", "I");
      }
      if (!words.contains("my")){
        mirrored_r = mirrored_r.replace("your","my");
      }
      if (!words.contains("am")){
        mirrored_r = mirrored_r.replace("are", "am");
      }
      

      

      
      // Chatbot mirrored version:
      
      
      if (!mirrored_r.equals(words)) {
        computer_response = mirrored_r;
        System.out.println(computer_response);
      }
      else {
        computer_response = chatbot_responses[rand.nextInt(chatbot_responses.length)];
        System.out.println(computer_response);
      }

      Arraylist<string> transcript = new Arraylist<string>();
        for (int c = nRound; c>0 ; c--){
        transcript.add(computer_response);

        }
    }
    
    
    System.out.println("\nHave a good day!\n");
    System.out.println(transcript);
    
    
    
    //System.out.println("transcript is:" + transcript);
    sc.close();
    
  }
}

  

    