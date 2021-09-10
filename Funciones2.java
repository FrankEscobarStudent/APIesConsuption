import javax.naming.spi.DirStateFactory.Result;

import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

public class Funciones2 {
   
    public static int Summ(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }
    public static void main(String[] args) {
        int numb1 = 4;
        int numb2 = 7;
        int resulting = Summ(numb1,numb2);
        System.out.println("The sum result is: " + Summ(numb1,numb2));
        System.out.println("The sum result is: " + resulting);
    }
    
}
