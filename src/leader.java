import java.util.Scanner;

public class leader extends teacher{
	private String nhiemKi;
	private String thanhTich;

	public leader(){

	}

	public String getNhiemKi(){
		return nhiemKi;
	}

	public String getThanhTich(){
		return thanhTich;
	}

	public leader(String IDcard, String fullName, String address, String email,
	 String phoneNumber, String IdTeacher, String chuyenMon, int experience,
	  String position, String nhiemKi, String thanhTich){
		super(IDcard, fullName,address,  email, phoneNumber, 
		 IdTeacher,  chuyenMon, experience, position);
		this.nhiemKi = nhiemKi;
		this.thanhTich = thanhTich;
	}

	@Override
	public void nhapTT(){
		Scanner scanner = new Scanner(System.in);
		super.nhapTT();
		System.out.print("nhap nhiem ki: ");
		this.nhiemKi = scanner.nextLine();
		System.out.print("nhap thanh tich: ");
		this.thanhTich = scanner.nextLine();
	}

	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("nhiem ki: " + nhiemKi);
		System.out.println("thanh tich: " + thanhTich);
	}
}