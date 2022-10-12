package Animal.Reptile;

public class Crocodile extends Reptile{
	
	private String features = "Hard-shelled eggs";
	
    public Crocodile(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
	}
    
    Reptile reptile = new Reptile(4, 450, "Reptile", "B");
    
    public void showInfo(){
    	System.out.println("Height : " + reptile.getHeight() + " m");
        System.out.println("Weight : " + reptile.getWeight() + " kg");
        System.out.println("AnimalType : " + reptile.getAnimalType());
        System.out.println("BloodType : " + reptile.getBloodType());
        
        for(var info : reptile.getFeaturesArray()) {
        	System.out.println(info);
        }
        System.out.println(this.features);
    }
    
    // default constructor
    public Crocodile() {
	}
}
