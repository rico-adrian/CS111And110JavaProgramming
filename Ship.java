/**
Author: Rico H Adrian
*/

public abstract class Ship {

    private String name;       // Ship name
    private int yearBuilt;     // Year it was built
    private int numPropellars; // Number of propellars 

    /**
    Constructor
     */
    public Ship(String name, int year) {
        this.name = name;
        yearBuilt = year;
        numPropellars = 3;
    }

    /**
    setName method      
     */
    public void setName(String n) {
        name = n;
    }

    /**
    setYearBuilt method 
     */
    public void setYearBuilt(int year) {
        yearBuilt = year;
    }

    /**
    getName method 
     */
    public String getName() {
        return name;
    }

    /**
    getNumPrepellers method 
     */
    public int getNumPropellars() {
        return numPropellars;
    }

    /**
    getYearBuilt method
     */
    public int getYearBuilt() {
        return yearBuilt;
    }

    /**
    toString method
     */
    public abstract String toString();
}

