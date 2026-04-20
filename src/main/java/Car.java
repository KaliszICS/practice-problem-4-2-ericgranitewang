/*
*   A class about a car
*   @author Eric Wang
*   @version idk
*/
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /*
    * construct car by putting in its maker, model, year, and price
    * @param make String the brand of the car
    * @param model String the model of the car
    * @param year int the year the car was created
    * @param price double the cost of the car
    */

    public Car (String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    /*
    * gets the maker of the car
    * @return the maker of the car
     */
    public String getMake() {
        return make;
    }
    /*
    * gets the model of the car
    * @return the model of the car
     */
    public String getModel() {
        return model;
    }
    /*
    * gets the year of the car
    * @return the year of the car
     */
    public int getYear() {
        return year;
    }
    /*
    * gets the price of the car
    * @return the price of the car
     */
    public double getPrice() {
        return price;
    }
    /*
    *sets a new value for the maker of the car
    * @param val String the new value for the maker
     */
    public void setMake(String val) {
        make = val;
    }
    /*
    *sets a new value for the model of the car
    * @param val String the new value for the model
     */
    public void setModel(String val) {
        model = val;
    }
    /*
    *sets a new value for the year of the car
    * @param val int the new value for the year
     */
    public void setYear(int val) {
        year = val;
    }
    /*
    *sets a new value for the price of the car
    * @param val double the new value for the price
     */
    public void setPrice(double val) {
        price = val;
    }

}
