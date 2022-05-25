package com.syntax.class28;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add("Name");
        arrayList.add(12.5);
        arrayList.add(true);


        for (int i=1; i<arrayList.size(); i++){
            if(arrayList.get(i)instanceof String){
      //  System.out.println(String)arrayList.get(i)).length());
          //  }else if{
                System.out.println("Conversion not possible");
            }
            System.out.println(arrayList);
        }
}
}
