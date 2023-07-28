package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android {
	
	int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCone(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
