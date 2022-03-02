
/**
 *
 * @author elorza.karmele
 */
//Write a program called ThreeFiveSevenSum to sum all the running integers from 1 and 1000, that are divisible by 3, 5 or 7, but NOT by 15, 21, 35 or 105.
public class ThreeFiveSevenSum {

    public static void main(String[] args) {
        int i = 1, sum = 0;

        /*for(i = 1; i <= 1000; i++){
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){
                if((i % 15 != 0) || (i % 21 != 0) || (i % 35 != 0) || (i % 105 != 0)){
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);*/
        while (i <= 1000) {
            if ((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
                if ((i % 15 != 0) || (i % 21 != 0) || (i % 35 != 0) || (i % 105 != 0)) {
                    sum = sum + i;
                    //System.out.println(i);
                }
            }

            i++;
        }
        System.out.println(sum);
    }
}
