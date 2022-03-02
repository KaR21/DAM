/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
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
