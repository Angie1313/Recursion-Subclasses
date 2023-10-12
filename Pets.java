public class Pets {
	int legs = 100;
	String color = "multicolor";
	String breed ="Sphynx";
	
	Pets(){
		System.out.println("This is the Pets class");
	}
	
	Pets(int legs, String color, String breed){
		System.out.println("This animal has "+legs+" legs");
		System.out.println("This animal is "+color);
		System.out.println("The breed is "+breed);
	}

}
