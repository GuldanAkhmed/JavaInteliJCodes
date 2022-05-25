package com.syntax.review7;

public class ObjectAndClass {


        String empName;
        int empID;
        String group;


        void employeeDetails() {
            System.out.println(empName + empID);
        }
        void employeeGroup(){
            System.out.println(group);
        }



    public static void main(String[] args) {
     ObjectAndClass obj=new ObjectAndClass();
     obj.employeeGroup();
     obj.employeeDetails();

    }
}
