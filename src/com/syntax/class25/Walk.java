package com.syntax.class25;

interface HealthAble{
    void healthy();
        }

public interface Walk{
    void healthy();
        void burnCalories();

    }
    interface Milk{
    void healthy();
    void giveEnergy();

}
  interface Banana{
      void healthy();

      void giveEnergy();
  }
class Demo implements Banana{


    @Override
    public void healthy() {
        System.out.println("Banana is good for health");


        }


    @Override
    public void giveEnergy() {
        System.out.println("it gives us energy");
    }
}
