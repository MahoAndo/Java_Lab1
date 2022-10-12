package Animal.Reptile;

import Animal.Animal;

public class Reptile extends Animal{
	
    private String[] featureArray = {"Dry Skin", "Backbone", "Soft-shelled egg"};
    
    public Reptile(int height,int weight, String animalType, String bloodType) {
    	super(height, weight, animalType, bloodType);
    }
    
    //getter
    public String[] getFeaturesArray() {
    	return this.featureArray;
    }

    /* setter
     * @param String[] arr 
     */
    public void setFeaturesArray(String[] arr) {
        this.featureArray = arr;
    }

    // default constructor
    public Reptile() {
	}
}
