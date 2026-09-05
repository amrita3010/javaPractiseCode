public class Demo {
    public static void main(String [] args) {
        System.out.println("Hello, Amrita");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if(topScore<100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 85;
        if((topScore>secondTopScore) && (topScore<99)){
            System.out.println("Greater than second top and less than 99 ");
        }

        if((topScore>secondTopScore) || (topScore<99)){
            System.out.println("Either or both of the condition are true ");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Rivian";
        boolean isDomestic = (makeOfCar == "Rivian") ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic)? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        int ageOfClient = 20;
        String ageText = (ageOfClient>=18)?"Over eighteen":"Still a kid";
        System.out.println("our client is "+ageText);

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myTotal = (myFirstDouble + mySecondDouble)*100.00d;
        System.out.println("myTotal: "+myTotal);
        double myRemainder = myTotal % 40.00d;
        System.out.println("myRemainder: "+myRemainder);
        boolean myValue = (myRemainder==0.00)?true:false;
        System.out.println("myValue = "+myValue);
        if(!myValue){
            System.out.println("Got some remainder");
        }
    }
}