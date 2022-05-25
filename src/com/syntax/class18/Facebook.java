package com.syntax.class18;



    public class Facebook {
        private String userName;
        private String password;
        private int age;

        void setAge(int personAge) {
            if (age > 5 && age < 800) {
                age = personAge;
            } else {
                System.out.println("Not " + "allowed its not a horse");
            }
        }

        public static void main(String[] args) {
            Facebook facebook = new Facebook();
            //facebook.age=-15;
            facebook.setAge(25);

        }
    }


