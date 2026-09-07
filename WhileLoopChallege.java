public class WhileLoopChallege {
    public static void main(String [] args) {
        // int i = 5;
        // while(i<=20){
        //     i++;
        //     if(!isEvenNumber(i)){
        //         continue;
        //     }
        //     // System.out.println(i+" is "+(isEvenNumber(i)?"":"Not")+ " a even number");
        //     System.out.println("Even number "+i);
        // }
        int j = 4;
        int evenCount = 0;
        int oddCount = 0;
        while(j<=20){
            j++;
            if(!isEvenNumber(j)){
                oddCount++;
                continue;
            }
            System.out.println("Even number "+j);
            evenCount++;
            if(evenCount==5){
                break;
            }
        }
        System.out.println("Total odd numbers found "+oddCount);
        System.out.println("Total even numbers found "+evenCount);

    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}