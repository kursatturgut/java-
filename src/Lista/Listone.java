package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		List<String>isimler=new ArrayList<>();
		
		isimler.add("kutlu");
		isimler.add("emrah");
		isimler.add("ferhat");
		System.out.println(isimler);
		Collections.sort(isimler);
		System.out.println(isimler);
		*/
		List<String>yaz�=new ArrayList<>();
	yaz�.add("ali");
	yaz�.add("veli");
	yaz�.add("hal�");
	System.out.println(yaz�);
	
	System.out.println(yaz�.contains("ali"));
	System.out.println(yaz�.get(0));
	System.out.println(yaz�.indexOf("hal�"));
	System.out.println(yaz�.remove(0));
	System.out.println(yaz�);
	System.out.println(yaz�.set(0, "hay"));
	System.out.println(yaz�);
	
	}

}
