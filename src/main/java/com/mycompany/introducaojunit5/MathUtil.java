package com.mycompany.introducaojunit5;
/**
 *
 * @author camila
 */
/*public class MathUtil {
    public static int mdc(int a, int b){
        if(b > 0 && a % b == 0){
            return b;
        }
        return -1;
    }
}*/
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class MathUtil {

    private MathUtil() {
    }

    /*public static int mdc(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        final int min = Math.min(a, b);
        a = Math.max(a, b);
        b = min;

        if (b > 0 && a % b == 0) {
            return b;
        }

        if (b == 0 || a == 0) {
            return Math.max(Math.abs(a), Math.abs(b));
        }

        return mdc(a - b, b);
    }*/
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        
        //propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //prorpiedade 1
        if(b > 0 && a % b == 0){
            return b;
        }
       
        //propriedade 3
        if (b == 0){
            return Math.abs(a);
        }
        return mdc(a - b,b);
    }

    public static int mdc(int... valores) {
        Objects.requireNonNull(valores, "O parametro não pode ser nulo!");
        if (valores.length == 0){
            throw new IllegalArgumentException("Indique ao menos um valor para calcular o mdc!");
        }
        int a = valores[0];
        for(int b : valores){
            a = mdc(a,b);
        }
        return a;
    }

    public static boolean isPrimo(final long numero) {
        if (numero <= 1) {
            return false;
        }

        for (long i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
