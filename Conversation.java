import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;


class Conversation {
  /**
   * @param arguments 
   */

   public static void main(String[] arguments) {

    //This transcript is going to have all the input/dialogue
    ArrayList<String> transcript = new ArrayList<String>(); 


    //Genric Responses array for later
    String [] genericResponses = {"Wowza!", "LOL no one cares.", "if you say so.","That's neat","Well, okay then", "It is what it is", "Brruuhhhhh", "Cool man!", ":D", "Uh huh"};
    // These arrays are going to used for splitting
   
    //The min and max doubles will be used to be the genericResponses array's index's range.
    double max = 9;
    double min = 0;
        
    //genericResponses' index
    double index = (int)(Math.random()*((max-min)+1))+min;
    
    //The Math.random function only uses doubles so I had to convert it to an integer for the genericResponses
    int indexInt = (int) index;

    //Prompting user for input
    String intro = "Welcome to chat with a Smithie :D! How many rounds would you want to talk?";
    System.out.println(intro);
    transcript.add(intro);
   
    // Establishing Scanner thingy for rounds input
    Scanner inputR = new Scanner (System.in);

    // Establishing Scanner thingy for user input the answer to "Cool! What's on your mind"
    Scanner input = new Scanner (System.in);

    //Scanner that's going to store the number of rounds given
    int rounds = inputR.nextInt();
    
    
    System.out.println("Cool! What's on your mind?");

    //Going to add the next input to the transcript     
     

      for (int i = 0; i < rounds-1; i++) {
        
        //Scanner for the sentences that I'm going need to split    
        String sentences = input.nextLine();
        transcript.add(sentences);
        
        
        String [] arrayForSplittingStoring = sentences.split(" ", 1000);
        String upperInput = sentences.toUpperCase();

        //mirror word check
        if (upperInput.contains("YOU")|| upperInput.contains(" I ") || upperInput.contains("I ") || upperInput.contains("ME") || upperInput.contains("AM") || upperInput.contains("ARE") || upperInput.contains("MY") || upperInput.contains("YOUR")) {

          //splitting loop
        for (int a = 0; a < arrayForSplittingStoring.length; a++) {
          String word = arrayForSplittingStoring[a].toUpperCase();

          //the word swapping
          if(word.equals("YOU")) {

            arrayForSplittingStoring[a] = "I";

        }   else if (word.equals ("I")) {

          arrayForSplittingStoring[a] = "you";

        } else if (word.equals("ME")) {

          arrayForSplittingStoring[a] = "you";

         } else if (word.equals("AM")) {

          arrayForSplittingStoring[a] = "are";
          
          } else if (word.equals("ARE")) {
           
            arrayForSplittingStoring[a] = "am";

          } else if (word.equals("MY"))  {
            
            arrayForSplittingStoring[a] = "your";

          } else if (word.equals("YOUR")) {
            
            arrayForSplittingStoring[a] = "my";

          }
          String questionMark = String.join(" ", arrayForSplittingStoring);
          sentences = questionMark + "?";
        }
       
        } else {
          String genericResponsesPrint = (genericResponses[indexInt]);
          sentences = (genericResponsesPrint);
        }
        transcript.add(sentences);
        System.out.println(sentences);
        }
        System.out.println(" Goodbye~" + "\n");
        transcript.add(" Goodbye~");

      
        //final transcript output
        System.out.println("FINAL TRANSCRIPT:");
        for (int f = 0; f < transcript.size(); f++) {
          System.out.print(transcript.get(f) + "\n");
        }

    input.close();
    inputR.close();

    }
   

      }

   

  
    