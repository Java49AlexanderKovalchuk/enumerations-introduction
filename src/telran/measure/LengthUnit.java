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
	
	public Length between(Length length1, Length length2) {
		Length lengthConvert = length2.convert(length1.getUnit()); 
		float delta = lengthConvert.getAmount() - length1.getAmount();
		return new Length(delta, lengthConvert.getUnit());
	}
}
 