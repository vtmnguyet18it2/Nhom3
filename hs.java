package nguyet;

public class hs {
	String So;
	String Ten;
	String Nam;
	double diem;
	public String getSo() {
		return So;
	}
	public void setSo(String so) {
		So = so;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getNam() {
		return Nam;
	}
	public void setNam(String nam) {
		Nam = nam;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public hs(String so, String ten, String nam, double diem) {
		super();
		So = so;
		Ten = ten;
		Nam = nam;
		this.diem = diem;
	}
}
