package com.syntax.review12;

import org.apache.poi.util.StringUtil;

import static com.sun.deploy.util.VersionString.contains;
import static com.syntax.review12.StringUtil;
import static org.apache.poi.util.StringUtil.*;

public class FacebookTester {


    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        facebook.setName("Gulden");
        System.out.println(contains("ab123","[0-9]"));

    }
}
