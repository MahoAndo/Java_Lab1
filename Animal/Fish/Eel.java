package Animal.Fish;

public class Eel extends Fish {
	
	private String features = "Release electric charge";
	
	public Eel(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
	}

	Fish fish = new Fish(45, 130, "Fish", "A");
    
    public void showInfo() {
        System.out.println("Height : " + fish.getHeight() + " cm");
        System.out.println("Weight : " + fish.getWeight() + " g");
        System.out.println("AnimalType : " + fish.getAnimalType());
        System.out.println("BloodType : " + fish.getBloodType());
        
        for(var info : fish.getFeaturesArray()) {
        	System.out.println(info);
        }
        System.out.println(this.features);
    }
    
    // default constructor
    public Eel() {
    }
}
