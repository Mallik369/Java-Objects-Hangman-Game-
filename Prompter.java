import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompter
{
    private Game mGame;
    private BufferedReader mreader;

    public Prompter(Game game)
    {
        mGame = game;
        mreader = new BufferedReader(new InputStreamReader(System.in));
    }

    /*
    Application Runnable Method
    Game Runs till user has tries left and Game is not solved

    */

    public void play ( )
    {
        while( mGame.remainingTries() > 0 && !mGame.isSolved())
        {
            displayProgress();
            guessForPrompter();
         }
         if(mGame.isSolved())
         {  
            System.out.printf("Congratulation you have completed %s word with %d tries remaining\n",
                    mGame.getAnswer(), mGame.remainingTries());
         }
         else
         {
           System.out.printf("%s is the word, Please Try Again, All the Best\n",mGame.getAnswer());
         }
    } 

    /*
    Input : Receives Input from User
    Pass the Input to apply Guess Method
    */

    public boolean guessForPrompter( ) {


        boolean isHit   = false;
        boolean isValid = false;
        while(!isValid)
        {
            System.out.println("Enter the Guess: ");

            try
            {
                String guessAsString = mreader.readLine();
                isHit = mGame.applyGuess(guessAsString);
                isValid = true;
            }
            catch(IllegalArgumentException iae)
            {
                System.out.printf("%s ,Please try Again\n ",iae.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
       return isHit;
    } 

    //Output : Display the Remaining Tries left to User and Current Progress of Game

    public void displayProgress()
    {
        System.out.printf("Try to Solve: %d Tries are remaining %s\n", mGame.remainingTries(),mGame.currentProgress());
    }
}