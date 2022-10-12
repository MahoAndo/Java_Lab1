package Animal;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal(int height,int weight, String animalType, String bloodType) {
    	this.height = height;
    	this.weight = weight;
    	this.animalType = animalType;
    	this.bloodType = bloodType;
    	
    }
    
    //getter
    public int getHeight() {
        return this.height;
    }

    /* setter
     * @param int height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    //getter
    public int getWeight() {
        return this.weight;
    }

    /* setter
     * @param int weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //getter
    public String getAnimalType() {
        return this.animalType;
    }

    /* setter
     * @param String animalType
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    //getter
    public String getBloodType() {
        return this.bloodType;
    }

    /* setter
     * @param String bloodType
     */
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    public Animal() {
	}
	
    
}
