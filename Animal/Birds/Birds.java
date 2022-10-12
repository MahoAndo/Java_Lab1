package Animal.Birds;

import Animal.Animal;

public class Birds extends Animal{
	
	private String[] featureArray = {"Animals with feathers", "Can fly"};

	public Birds(int height,int weight, String animalType, String bloodType) {
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
    public Birds() {
	}
}
