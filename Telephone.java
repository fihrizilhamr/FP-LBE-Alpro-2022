package Telephone;

abstract class Telephone{
	private float weight;
    private String type;
	    abstract void turnOn();
	    abstract void turnOff();
	    abstract void delete();
		float getWeight() {
			return weight;
		}
		void setWeight(float weight) {
			this.weight = weight;
		}
		String getVer() {
			return type;
		}
		void setVer(String type) {
			this.type = type;
		}
}
