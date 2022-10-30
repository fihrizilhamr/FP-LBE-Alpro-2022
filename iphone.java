class iphone extends Telephone {
	public iphone() {
		super.type = "iphoneee!";
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
