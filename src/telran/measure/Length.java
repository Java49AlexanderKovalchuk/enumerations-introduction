package telran.measure;
import java.util.Comparator;

import telran.measure.LengthUnit;

public class Length implements Comparable<Length>{
	
	private float amount;
	private LengthUnit lenghtUnit;
 	public Length(float amount, LengthUnit lengthUnit){
 		this.amount = amount;
 		this.lenghtUnit = lengthUnit;
 	}
	
  	public String  toString() {
 		String unit = this.lenghtUnit.toString();
 		String amount = String.valueOf(this.amount);
 		return String.format("%s%s", amount, unit);
 	}
 	
 	public Length convert(LengthUnit lengthUnit) {
 		return new Length(this.amount * this.lenghtUnit.value /
 				lengthUnit.value, lengthUnit);
 	}

	@Override 
	public void compareTo() {
		// TODO Auto-generated method stub
		//Comparable<Length> comp = Comparator.
		
		
	}
	
	

	public LengthUnit getUnit() {
		return this.lenghtUnit;
	}
	
	public float getAmount() {
		return this.amount;
	}
}
