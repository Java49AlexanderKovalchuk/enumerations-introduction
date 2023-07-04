package telran.measure;

public class Length implements Comparable<Length> {
	private float amount;
	private LengthUnit lenghtUnit;
 	public Length(float amount, LengthUnit lengthUnit){
 		this.amount = amount;
 		this.lenghtUnit = lengthUnit;
 	}
	
  	public String  toString() {
 		return Float.toString(amount) + lenghtUnit.toString();
 	} 
 	
 	public Length convert(LengthUnit length) {
 		return new Length(amount * lenghtUnit.value /
 				length.getValue(), length);
 	}
 	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Length objLength = convertTo((Length)obj);
		return Float.compare(amount, objLength.amount) == 0;
	}
	
 	@Override
	public int compareTo(Length obj) {
		Length objLength = convertTo(obj);
		return Float.compare(amount, objLength.amount);
	}
	
	private  Length convertTo(Length obj) {
		return ((Length) obj).convert(lenghtUnit);
	}
	public LengthUnit getUnit() {
		return this.lenghtUnit;
	}
	
	public float getAmount() {
		return this.amount;
	}

}
