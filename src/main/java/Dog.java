/*
*   A class for a dog
*   @author Eric Wang
*   @version idk
*/
public class Dog {

    private String name;
    private String breed;
    private int weight;

    /*
    * construct dogs by taking in name breed and height
    * @param name String name of dog
    * @param breed String breed of dog
    * @param weight double weight of dog
    */

    public Dog (String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /*
    * method to get name of dog
    * @return returns name of dog as a String
     */
    public String getName() {
        return name;
    }

    /*
    * method to get breed of dog
    * @return returns breed of dog as a String
     */
    public String getBreed() {
        return breed;
    }

    /*
    * method to get weight of dog
    * @return returns weight of dog as a double
     */
    public int getWeight() {
        return weight;
    }

    /*
    * method to set weight of dog
    * @param val double value that the weight of the dog will be set to
    */
    public void setWeight(int val) {
        weight = val;
    }

    /*
    * method to set breed of dog
    * @param val String value that the breed of the dog will be set to
    */
    public void setBreed(String val) {
        breed = val;
    }

    /*
    * method to set name of dog
    * @param val String value that the name of the dog will be set to
    */
    public void setName(String val) {
        name = val;
    }
}