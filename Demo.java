enum firstEnum
{
    Distinction, VeryGood, Good, Pass, Fail;
}


/*
 * 80 - 100 -> distinction
 * 65 - 79 -> veryGood
 * 50 - 64 -> Good
 * 40 - 49 -> Pass
 * 0 - 39 -> Fail
 */

public class Demo
{
    public static void main(String[] args) {

        firstEnum [] x = firstEnum.values();

        for(firstEnum a : x){
            System.out.println(a+ " : " +a.ordinal()+ "position");
        }
        
    }
}