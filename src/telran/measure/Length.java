package telran.measure;

public class Length implements Comparable<Length> {
	private final float amount;
	private final LengthUnit lenghtUnit;
 	public Length(float amount, LengthUnit lengthUnit){
 		this.amount = amount;
 		this.lenghtUnit = lengthUnit;
 	}
	
  	public String  toString() {
 		return Float.toString(amount) + lenghtUnit.toString();
 	} 
 	
 	public Length convert(LengthUnit unit) {
 		 return new Length(amount * this.lenghtUnit.getValue() /
 				unit.getValue(), unit);
 	}
 	@Override
	public boolean equals(Object obj) {
		return compareTo((Length) obj) == 0;
	}
	
 	@Override
	public int compareTo(Length obj) {
		return Float.compare(amount, obj.convert(lenghtUnit).amount);
	}
	
	public LengthUnit getUnit() {
		return lenghtUnit;
	}
	
	public float getAmount() {
		return amount;
	}

}
