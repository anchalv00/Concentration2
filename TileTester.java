

/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    int count = 0;
    String[][] gameboard = new String[3][4];

    for(int i = 0; i < gameboard.length; i++){
      for(int x = 0; x < gameboard[0].length; x++){
        gameboard[i][x] = tileValues[count];
        count++;
      }
    }

    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
    /* your code here */
  
    
  }
}