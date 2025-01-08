public class IceCream {
    int numberOfScoops;
    String flavor;
    boolean hasSprinkles;

    public IceCream(int paramnumberOfScoops, String paramflavor, boolean paramhasSprinkles) {
        this.numberOfScoops = paramnumberOfScoops;
        this.flavor = paramflavor;
        this.hasSprinkles = paramhasSprinkles;

    }

    public void printInfo(){
        System.out.println("It is " + hasSprinkles + " that this " + flavor + " ice cream that has " + numberOfScoops + " scoops also has sprinkles.");
    }


}
