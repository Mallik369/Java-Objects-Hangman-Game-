public class Game
{
    // @MAX_TREIS : Maximum tries avialabel to User to Guess 
    public static final int MAX_TRIES = 7;
    private String mAnswer;
    private String mHits;
    private String mMisses;
  
    public Game(String answer) 
    {
      
        mAnswer = answer;
        mHits   = "";
        mMisses = "";

    }
    public String getAnswer( )
    {
        return mAnswer;
    }
    /*
      Validate Method : Input
      Validate Input is a letter , digit or Special Character
      Process Input : Convert Input to Lower Case
      Validate Process Input is already is guessed from user
      pass the Process Input to Compute Method: applyGuess(char letter)
     */
    private char validateGuess(char letter)
    {
        //Validate the user Input Character
        if(!Character.isLetter(letter))
        {
            throw new IllegalArgumentException(letter+ "is not a letter"); 
        }
        letter =Character.toLowerCase(letter);
        
        if ( mHits.indexOf(letter) >= 0 || mMisses.indexOf(letter) >= 0)
        {
            throw new IllegalArgumentException(letter + "is guessed letter");
        }
        return letter;
    }
    
    /*
    Error Checking Method : Input
    Checks for the Empty String from User Input
    Process Input : Obtain Character from String
    Pass the Process Input to Compute Method
    Compute Method : applyGuess(char letter)
     */

    public boolean applyGuess(String letters)
    {
        //Checks for Empty String
        if(letters.length( ) == 0)
        {
            throw new IllegalArgumentException("It is an Empty Guess");
        }
        applyGuess(letters.charAt(0));
        return true;
    }

    /*
      Compute Method: Intermediate Output
      Input : letter
      processing :
      Checks the letter is existing in mAnswer
      Adds letter mHits or mMisses
      Intermediate Output : mHits or mMisses

    */
    public boolean applyGuess(char letter) 
    {
         letter = validateGuess(letter);
        
        if ( mAnswer.indexOf(letter) >= 0) 
        {
            mHits +=letter;
            return true;
        }
        else
        {
            
          mMisses += letter;
          return false;
        }
   }

   /*
   Compute Method : Intermediate Output
   @ progress : Holds current status of User Guess
   */

   public String currentProgress( )
   {
      
        String progress = "";
        for (char letter : mAnswer.toCharArray())
        {
            char display = '-';
            if(mHits.indexOf(letter) >= 0)
            {
          
                display = letter;
            }
            progress += display;
        }
        return progress;
   }
  /*
    Helper Methods :
     Checks for the Progress of the Application
    to further proceed or to Abort the Application
    @MAX_TREIS : Maximum tries avialabel to User to Guess 
    @remainingTries : Holds user remaining tries available to Guess
    Compute Method : Final Output
    @remainingTries : Holds user Guessed Letter with no of tries remaining
   */

   public int remainingTries( )
   {
        int remainingTries = (MAX_TRIES - mMisses.length());
        return remainingTries;
   }
  /*
  Helper Method
    Checks for the Progress of the Application
    to further proceed or to Abort the Application
  */
   public boolean isSolved( )
   {
      return currentProgress().indexOf('-') == -1;
   }
}
    
