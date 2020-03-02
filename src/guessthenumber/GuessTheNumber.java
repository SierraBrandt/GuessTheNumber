package guessthenumber;
import java.io.IOException;

public class GuessTheNumber {
 //Game that guesses a number
    public static void main(String[] args) {
        game();
        System.out.println("Play again? y for yes, n for no");
        String str = read();
        if (str.charAt(0) == 'y')
                {
                    game();
                }   
    }
    public static void game() {
        System.out.println("Choose a number 1-100");
        int randomNum = (int)(Math.random ()*101);
        int playerNum = readInt();
        int playerCount = 0;
        while(playerNum != randomNum)
        {
            if(playerNum > randomNum) {
                System.out.println("Sorry, that is incorrect. Input a different number that is lower.");
                playerNum = readInt();
                playerCount++;
            } else if (playerNum < randomNum) {
                System.out.println("Sorry, that is incorrect. Input a different number that is larger.");
                playerNum = readInt();
                playerCount++;
            }
        }
        playerCount++;
        System.out.println("Congrats! that is the correct number, you got it in " + playerCount + " tries");
    }
    
    
    
    
   ///////////////////////////////////////////////////
	public static int readInt()
	{
		String str = read();
		int num = Integer.parseInt(str.trim());
		return (num);
	}

	public static String read()
	{
		byte [] buffer = new byte[10];
            try
            {
			int numBytes = System.in.read(buffer);
            }
      	catch(IOException e)
      	{
            	System.out.print("Error: " + e);
         		System.exit(1);
      	}
		String str = new String(buffer);
            return (str);
	}
}
