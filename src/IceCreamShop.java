public class IceCreamShop {
    String name;
    boolean isOpen;
    int numberOfFlavors;

    public static void main(String[] args) {
        IceCreamShop creamery = new IceCreamShop();
        System.out.println("Hello World! Good luck on your exams!");

        creamery.name = "Scoops and Loops: The Code Creamery";
        creamery.isOpen = true;
        creamery.numberOfFlavors = 32;

        System.out.println("Welcome to " + creamery.name + "! It is " + creamery.isOpen + " that we are open. We serve " + creamery.numberOfFlavors + " flavors.");

        creamery.numberOfFlavors = 12;
        System.out.println("Welcome to " + creamery.name + "! It is " + creamery.isOpen + " that we are open. We serve " + creamery.numberOfFlavors + " flavors.");

        creamery.randomDiscount();
        creamery.specialOfTheDay();

        creamery.countScoops();

        creamery.chefsChoice();

        IceCream halesOrder;
        halesOrder = new IceCream(2, "Cookies and Cream", false);
        halesOrder.printInfo();

        IceCream myOrder;
        myOrder = new IceCream(123, "Chocolate", true);
        myOrder.printInfo();



    }

    public void randomDiscount(){
        int randomInt = (int)(Math.random() * 31);
        System.out.println("We spun the discount wheel and you get " + randomInt + " percent off your order!");
    }

    public void specialOfTheDay(){
        String flavor;
        flavor = "vanilla";
        System.out.println("Today's special is " + flavor + ".");
    }

    public void countScoops() {
        for (int x = 1; x <6; x = x + 1) {
            System.out.println(x);
        }

        for (int x = 2; x < 12; x = x + 3){
            System.out.println(x);
        }

        for (int x = 8; x > -1; x = x-1){
            System.out.println(x);
        }

    }

    public void chefsChoice(){
        double randomNum = Math.random();

        if (0.0 < randomNum && randomNum < 0.25){
            System.out.println("The chef recommends Banana Split.");
        }

        if (0.25 < randomNum && randomNum < 0.5){
            System.out.println("The chef recommends a Turtle Sundae.");
        }

        if (0.5 < randomNum && randomNum < 0.75){
            System.out.println("The chef recommends a Hot Fudge Sundae.");
        }

        if (0.75 < randomNum && randomNum < 1){
            System.out.println("The chef recommends The Vermonster.");
        }
    }



}
