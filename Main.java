import Animal.Birds.Eagle;
import Animal.Fish.Eel;
import Animal.Reptile.Crocodile;

class Main {
  public static void main(String[] args){
    
	  Crocodile crocodile = new Crocodile();
	  Eel eel = new Eel();
	  Eagle eagle = new Eagle();
	  
	  System.out.println("========== Crocodile ==========");
	  crocodile.showInfo();
	  System.out.println();
	  System.out.println("========== Eel ==========");
	  eel.showInfo();
	  System.out.println();
	  System.out.println("========== Eagle ==========");
	  eagle.showInfo();
  }
}