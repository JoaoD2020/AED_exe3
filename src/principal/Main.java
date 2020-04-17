/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author JD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object a[]=new Object[10];
        int i;
        
        for(i=0;i<5;i++){
            a[i]=(i+1)*(i+1);
        }
        
        for(i=5;i<10;i++){
            a[i]=(i-3)+"ª-feira";
        }
    }
    
}
