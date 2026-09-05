public class KeywordAndExpression {
    public static void main(String [] args){
        System.out.println( shouldWakeUp (true, 1));
        System.out.println(        shouldWakeUp (false, 2));
                        System.out.println("====isLeapYear=================================================");

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2024));

                System.out.println("===isLeapYear2==================================================");

                System.out.println(isLeapYear2(-1600));
        System.out.println(isLeapYear2(1600));
        System.out.println(isLeapYear2(2017));
        System.out.println(isLeapYear2(2000));
        System.out.println(isLeapYear2(2024));

        System.out.println("==areEqualByThreeDecimalPlaces===================================================");

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println("==hasEqualSum===================================================");

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

       System.out.println("==hasTeen===================================================");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
       System.out.println("==isTeen===================================================");

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
        System.out.println(isTeen(19));

    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (isBarking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;
    } 

    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }

        if(year%4!=0){
            return false;
        }

        if(year%100!=0){
            return true;
        }

        if(year%400 ==0){
            return true;
        }

        return false;

    }


    public static boolean isLeapYear2(int year){
        if(year<1 || year>9999){
            return false;
        }

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }

            }else{
                return true;
            }
        }else {
            return false;
        }

    }

    public static boolean areEqualByThreeDecimalPlaces(double n1,double n2){
        int n1Int = (int) (n1*1000);
        int n2Int = (int) (n2*1000);
        return n1Int == n2Int;
    }

    public static boolean hasEqualSum(int num1,int num2, int sumN1N2){
        if((num1+num2)==sumN1N2){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1,int num2, int num3){
        if(isTeen(num1) || isTeen(num2) || isTeen(num3) ){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num){
        if(num >=13 && num<20){
            return true;
        }
        return false;
    }



}
