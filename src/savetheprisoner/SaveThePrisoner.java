/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheprisoner;

/**
 *
 * @author enyason
 */
public class SaveThePrisoner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int n = 15;
        int m = 20;
        int s = 4;

        int lt, seat, lMinusN;
        int rem = m % n;

        if (s == 1) {
            if (rem == 0) {
                seat = n;
            } else {
                seat = rem;
            }

        } else {
            lt = s - 1;

            if (rem == 0) {

                seat = lt;
            }
            else {
                int temp = lt + rem;
                if (temp <= n) {
                    seat = temp;                 
                } else {

                    lMinusN = Math.abs(lt - n);
                    seat = rem - lMinusN;

                }
            }

        }

        System.out.println("warn seat " + seat);
    }
    
}
