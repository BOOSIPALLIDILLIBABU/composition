package oops.composition;

public class Battery {

	private String BrandName;
	private int hourseToCharge;
	private int hourseToLive;
	public Battery(String brandName, int hourseToCharge, int hourseToLive) {
		super();
		BrandName = brandName;
		this.hourseToCharge = hourseToCharge;
		this.hourseToLive = hourseToLive;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public int getHourseToCharge() {
		return hourseToCharge;
	}
	public void setHourseToCharge(int hourseToCharge) {
		this.hourseToCharge = hourseToCharge;
	}
	public int getHourseToLive() {
		return hourseToLive;
	}
	public void setHourseToLive(int hourseToLive) {
		this.hourseToLive = hourseToLive;
	}
	
	}
	

