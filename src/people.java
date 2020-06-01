import java.util.Scanner;

public class people{
	private String IDcard;
	private String fullName;
	private String address;
	private String email;
	private String phoneNumber;

	public static int id = 1;

	public people(){

	}

	protected String[] tachtu(){
		return this.fullName.split(" ");
	}

	public people(String fullName){
		this.fullName = fullName;
	}

	public String getRealName(){
		String[] str = tachtu();
		return str[str.length-1];
	}

	public people(String IDcard, String fullName){
		this.IDcard = IDcard;
		this.fullName = fullName;
	}

	public people(String IDcard, String fullName, String address, String email){
		this(IDcard, fullName);
		this.address = address;
		this.email = email;
	}

	public people(String IDcard, String fullName, String address, String email, String phoneNumber){
		this(IDcard, fullName, address, email);
		this.phoneNumber = phoneNumber;
	}

	public int getSTT(){
		return this.id;
	}

	public String getAddress(){
		return address;
	}

	public String getEmail(){
		return email;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getIDcard(){
		return this.IDcard;
	}

	public void setFullName(String s){
		fullName = s;
	}

	public String getFullName(){
		return fullName;
	}

	protected void nhapTT(){
		this.id = id++;
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap CCCD: ");
		this.IDcard = scanner.nextLine();
		System.out.print("nhap ho ten: ");
		this.fullName = scanner.nextLine();
		System.out.print("nhap dia chi: ");
		this.address = scanner.nextLine();
		System.out.print("nhap email:");
		this.email = scanner.nextLine();
		System.out.print("nhap sdt:");
		this.phoneNumber = scanner.nextLine();
	}

	public void showInfo(){
		System.out.println("ID card: "+ IDcard);
		System.out.println("full name: "+ fullName);
		System.out.println("address: "+ address);
		System.out.println("email: "+ email);
		System.out.println("phone Number: "+ phoneNumber);
	}
}