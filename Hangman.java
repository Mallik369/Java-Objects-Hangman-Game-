public class Hangman 
{
    // @ args : Receives Input from User
    public static void main(String[] args) 
    {
        // Enter amazing code here
        if ( args.length == 0 )
        {
          System.out.println("Enter the word to play game");
          System.exit(0);
        }
        // Initialized the User Input args[0]  to game object
        Game game = new Game(args[0]);
        Prompter prompt = new Prompter(game);
        // call Runnable Method
        prompt.play();
    }

}
