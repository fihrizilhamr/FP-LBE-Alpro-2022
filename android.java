package Telephone;

class android extends Telephone {
	public android() {
		super.type = "aaandroid!";
	}
	void turnOn(){
		System.out.println("Turning on the "+ type +"!");
	}
    void turnOff(){
    	System.out.println("Turning off the "+ type +"!");
    }
    void delete() {
    	System.out.println("Destroyig the "+ type +"!");
	}
}
