package Animal.Fish;

import Animal.Animal;

public class Fish extends Animal{
	
	private String[] featureArray = {"Live in water", "Has gills"};
	
	public Fish(int height,int weight, String animalType, String bloodType) {
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
    public Fish() {
	}
}
