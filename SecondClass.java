public class SecondClass {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Rani",highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
       displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
       displayHighScorePosition("Quahk",highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
       displayHighScorePosition("Anana",highScorePosition);

      highScorePosition = calculateHighScorePosition(-1000);
       displayHighScorePosition("Snana",highScorePosition);


        
    }

        public static void displayHighScorePosition(String playName,int playerPosition){
        System.out.println(playName + " managed to get into position "+playerPosition+" on the high score list.");
    }
    //  public static int calculateHighScorePosition(int playerScore){
    //     if(playerScore>=1000){
    //         return 1;
    //     } else if(playerScore>=500 ){
    //         return 2;
    //     }else if(playerScore>=100 ){
    //         return 3;
    //     }
    //     return 4;
    //  }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore<0){
            position=-1;
        }
        if(playerScore>=1000){
            position= 1;
        } else if(playerScore>=500 ){
            position= 2;
        }else if(playerScore>=100 ){
            position= 3;
        }
        return position;
    }
}
