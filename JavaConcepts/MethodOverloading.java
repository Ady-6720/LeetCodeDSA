//Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

import java.util.Scanner;

public class demo {
    static class Caluclator{
        int a;
        public int add(int n1, int n2){
            return n1+n2;
        }
        public int add(int n1,int n2,int n3){
            return n1+n2+n3;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers:\n");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int n3= scan.nextInt();
        Caluclator calc= new Caluclator();
        int addn= calc.add(n1,n2);
        System.out.println(addn);
        addn= calc.add(n1,n2+n3);
        System.out.println(addn);
    }
}
