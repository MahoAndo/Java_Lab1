package Animal.Birds;

public class Eagle extends Birds{

	public Eagle(int height,int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
	}

	Birds birds = new Birds(130, 15, "Birds", "B");
	
	public void showInfo() {
        System.out.println("Height : " + birds.getHeight() + " cm");
        System.out.println("Weight : " + birds.getWeight() + " kg");
        System.out.println("AnimalType : " + birds.getAnimalType());
        System.out.println("BloodType : " + birds.getBloodType());
        
        for(var info : birds.getFeaturesArray()) {
        	System.out.println(info);
        }
    }
	
	// default constructor
	public Eagle() {
    }
}
