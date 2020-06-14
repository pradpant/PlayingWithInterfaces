abstract class Vehicle

{

    abstract void calcPremium(Number N);

}

interface Insurance

{

    abstract void calcPremium (Object O);

}

class Car extends Vehicle implements Insurance

{

    public void calcPremium (Object O)

    {
        System.out.println("Object");
    }

    void calcPremium (Number N) 

    {

        System.out.println("Number");

    }

 }

public class Main

{

    public static void main(String[] args)

    {

        Vehicle a = new Car();

         a. calcPremium (new Integer(121));

          Insurance b = new Car();

           b. calcPremium (new Integer(121));

           Car c = new Car();

            c. calcPremium (new Integer(121));

    }

}