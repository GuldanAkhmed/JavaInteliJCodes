package com.syntax.class21;

public class userClass {
    String name;
    String mobileNumber;
    userClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class userInfo extends userClass{
    String userAddress;

    userInfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+userAddress);
    }
}

 class userClassTester {
    public static void main(String[] args) {
        userInfo info=new userInfo("Gulden","520-481-0000","Pittsburgh, PA");
        info.userDetails();
    }
}