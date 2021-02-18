package labPolymorphism;


/**
 * CSIS 1410
 * 
 * @author Tyler
 *
 */
public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.printf("Dog: %s%n", myDog.getBreed());
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.printf("SledDog: %s%n", mySledDog.getBreed());
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.printf("CircusDog: %s%n", myCircusDog.getBreed());
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array\n");
        
        Dog[] myDoggos = {myDog, mySledDog, myCircusDog};
        

        /**
         * 
         * Creating for each loop checking to see
         * if the dog in the loop is a SledDog
         * 
         */
        for(Dog d : myDoggos) {
        	System.out.println(d);
        	
        	if(d instanceof SledDog) {
        		mySledDog.pullSled();
        	}
        	
        	actAsDog(d);
        }
    }

    /**
     * Creating a parameter to keep everything cleaner in main
     * Passing Dog d 
     * 
     * @param d
     */
    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
