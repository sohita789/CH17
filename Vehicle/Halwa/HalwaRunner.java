package Halwa;

public class HalwaRunner {

	public static void main(String[] args) {
		
		HalwaVariety halwav=new HalwaVariety();
		Halwa halwa=new Halwa("carrot Halwa",2,90);
		
		System.out.println(halwav.name);
		System.out.println(halwav.quantity);
		System.out.println(halwav.price);
		halwa.name="carrot";
		halwav.order();
		
		

	}

}
