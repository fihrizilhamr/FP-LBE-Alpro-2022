public class main {
	public static void main(String[] args) {
		Telephone daffa = new iphone();
		Telephone akbar = new android();
		daffa.turnOn();
		akbar.turnOn();
		daffa.setWeight(789);
		akbar.setWeight(123);
		System.out.println(daffa.getVer());
		System.out.println(akbar.getVer());
		System.out.println(daffa.getWeight());
		System.out.println(akbar.getWeight());
		daffa.turnOff();
		akbar.turnOff();
	}
}

