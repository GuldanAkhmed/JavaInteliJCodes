package com.syntax.review7;

public class Practice4 {
    void verifyBatch12isGoodEnough(boolean isGood) {
        if (isGood) {
            System.out.println("yessss");
        } else {
            System.out.println("No!!!");
        }
    }

    public static void main(String[] args) {
        Practice4 p = new Practice4();
        p.verifyBatch12isGoodEnough(true);

    }
}