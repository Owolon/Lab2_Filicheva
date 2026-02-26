package org.example;

import static java.lang.Math.pow;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {

        double E = 0;
        double temp = 0.0;
        int N = 0;
        float X = 0;

        System.out.printf("Ряд равняется : %s", SHrows(N, X, E));
    }
    public double factorial(int N){
        int n = 1;
        while(n==N) {}
            if (n == 0 || n == 1)
                return 1;
            return n * factorial(n - 1);

    }
    public  double SHrows (int N, float X, double E){
        double Result = 0.0;
        double temp = 0.0;
        int n =0;

        do{
            temp = (pow(X,2*N-1)/factorial(2*N-1));
            Result += temp;
            n++;
        } while(temp > E);
        return Result;
    }
}
