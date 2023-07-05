package telran.measure;

public enum LengthUnit { 
	MM(1), CM(10), INCH(25.4f), DCM(100), FT(304.8f), M(1_000), KM(1_000_000);
	float value;
	private LengthUnit(float value) {
		this.value = value;
	}
	public float getValue() {
		return value;
	}
	
	public Length between(Length l1, Length l2) {
		Length length1 = l1.convert(this); 
		Length length2 = l2.convert(this);
		return new Length(length2.getAmount() - length1.getAmount(), this);
	}
}
 