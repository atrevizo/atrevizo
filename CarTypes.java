public class Sedan extends Vehicle {
   public Sedan(String make, String model, String color, String id, int year, double price){
   }
   public void setPrice(double price) {
	if (price >= 10000) {
		super.setPrice(10000);
	} else {
		super.setPrice(price);

	}
   }
}

public class SUV extends Vehicle {

	public SUV(String make, String model, String color, String id, int year,double price){
		super(make,model,color, id, year, price);

	}
	public void setId(String id){
		if (id.length() > 15) {
			super.setId(id.substring(0,15));
		} else {
			super.setId(id);
		}
	}
}

public class MiniVan extends Vehicle {

	public MiniVan(String make, String model, String color, String id,int year, double price ) {
		super(make, model, color, id, year, price);
	}
	public void setColor(String color) {
		if (color.equals("red")) {
			super.setColor("255-000-00")
		} else {
			super.setColor(color)
		}
	}
}