package com.goit.algorithms;



import java.math.BigInteger;
import java.util.HashMap;

public class Karazubi {

    public static HashMap<String, Integer> map = new HashMap<>();
    public static final BigInteger TEN = new BigInteger("10");

    public static BigInteger calculate(String x, String y){
        int n = Math.max(x.length(), y.length());
        if(n <=2 ){
            BigInteger x1 = new BigInteger(x);
            BigInteger y1 = new BigInteger(y);
            return x1.multiply(y1);
        }
        if(n == 3){
            x = String.format("%04d", Integer.parseInt(x));
            y = String.format("%04d", Integer.parseInt(y));
            System.out.println("new x =" + x);
            System.out.println("new y =" + y);
        }
        n = (n>>1) + (n%2);
        String a = x.substring(0, n);
        String b = x.substring(n);
        String c = y.substring(0, n);
        String d = y.substring(n);
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
        BigInteger ac = calculate(a, c);
        BigInteger bd = calculate(b, d);
        String a_b = String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
        String c_d = String.valueOf(Integer.parseInt(c)+Integer.parseInt(d));
        BigInteger ad_bc = calculate(a_b, c_d).subtract(ac).subtract(bd);

        String key = String.valueOf(ad_bc);
        if(map.keySet().contains(key)){
           int value = map.get(key);
            map.put(key, ++value);
        } else {
            map.put(key, 1);
        }

        return TEN.pow(n).multiply(ac).add(TEN.pow(n/2).multiply(ad_bc)).add(bd);
    }

    public static void main(String[] args) {

        String number1 = "1234";
        String number2 = "5678";

        BigInteger result = calculate(number1, number2);

        System.out.println(result);
        System.out.println(result.toString());
        System.out.println("======================================");
        map.forEach((k,v) -> System.out.println("key = " + k + " value=" + v));



    }
}
