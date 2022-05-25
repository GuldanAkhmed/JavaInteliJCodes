package com.syntax.class29;

import java.math.BigDecimal;

public class FloatDemo {
    public static void main(String[] args) {
        float fl=3.5f;
        if(fl==3.5) {
            System.out.println("Equal");
        }else {
            System.out.println("not");
        }

        BigDecimal bigDecimal=new BigDecimal(3.25);
        System.out.println(bigDecimal);
        float f=3.25f;
        double f2=3.25;
        System.out.println(f);
        System.out.println(f2);

    }
}
