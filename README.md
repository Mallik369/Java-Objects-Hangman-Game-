# Java-Objects-Skills-Project-Hangman

## Hangman Game
                                                    
Hangman Game is Console based Application developed to play a Hangman Game between User and Computer. 
This Project is done as a process to develop Java Console Based Application and Learn, Apply and Acquire Java Object Skill Sets. 

Hangman Computer Application is Developed based on Idea of Traditional [Hangman Game ](https://en.wikipedia.org/wiki/Hangman_(game))


The Following User Stories are considered to Develop Hangman Game

**1.  As a guesser, I should be able to submit a guess, so that I can play the game."**

Hangman need to Receive Input from User

                                Method  : public boolean guessForPrompter( )

**2.  As a guesser, I should be presented with my current progress, so that I can make an educated guess**.

Hangman Computes and Display Current Progress of Game on Console to UserThis is Intermediate Output generated to User and
Determine the Solved State of Game.

                              Method  :  public String currentProgress( )   // Compute Current Progress

                              Method  :	 public void displayProgress( )  // Display Current Progress

**3.  As a guesser, I should know how many remaining tries I have left, so I am encouraged to be cautious.**

Hangman Computes and Display Remaining Tries Left

                            Method  :	 public int remainingTries ( )    // Computes remaining Tries

                            Method  :	 public void displayProgress ( )  // Display Current Progress

**4.  As a guesser, I should be stopped from making a guess that has already been made, so that I do not waste turns.**

Hangman needs to Validate User Guess

                            Method   :	private char validateGuess(char letter)

**5.  As a guesser, I should be able to known when the game is solved or failed, so that I can acknowledge completion 
with celebration or tears.**

Hangman needs to display Final Condition of Game

                         Method:  
    
                             public void play ( )         //  Runs the Game and Display Success or Failed Message

                             public String getAnswer( )   // Gets the Answer

                             public int remainingTries( )  // Computes the Remaining Tries

                             public boolean isSolved( )    // Computes progress of Hangman Game 

6.Error Checking

  Bug: if the empty String is given

Hangman needs Check for Empty String Input from User
                      
                          Method

                          public boolean applyGuess(String letters)
































