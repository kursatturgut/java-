package javahaz�rl�kders;

public class ders1 {

	public static void main(String[] args) {
		
Produck produck1=new Produck();

	produck1.�d=1;
	produck1.name="bilgisayar";
	produck1.un�tprice=1000;
	produck1.detail="16 gb ram";
	
	Produck produck2=new Produck();	
	produck2.�d=2;
	produck2.name="ktap";
	produck2.un�tprice=1000;
	produck2.detail="15 gb ram";
	
	Produck produck3=new Produck();
	produck3.�d=3;
	produck3.name="kalem";
	produck3.un�tprice=10100;
	produck3.detail="15 gb ram";
	
		
		
		Produck [] producks= {produck1,produck2,produck3};
		for (Produck produck : producks) {
			
			System.out.println(produck.�d);
			System.out.println(produck.name);
			System.out.println(produck.un�tprice);
			System.out.println(produck.detail);
			
		}
		
		System.out.println(producks.length);
		
		
		
		
		
		
		
	}

}
