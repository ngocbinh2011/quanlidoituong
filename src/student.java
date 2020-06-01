import java.util.Scanner;

public class student extends people{
	private int sttStudent;
	private String IdStudent;
	private String years;
	private String branch;
	private String evalatued;

	public static int idStudent = 1;
	public student(){
		getSttStudent();
	}

	public student(String IDcard, String fullName, String address, 
			String email, String phoneNumber){
		super(IDcard, fullName, address, email, phoneNumber);
	}

	public student(String IDcard, String fullName, String address, String email,
		 String phoneNumber, String IdStudent, String years, String branch, String evalatued){
		this(IDcard, fullName, address, email, phoneNumber);
		this.IdStudent = IdStudent;
		this.years = years;
		this.branch = branch;
		this.evalatued = evalatued;
	}

	private void getSttStudent(){
		sttStudent = idStudent;
		idStudent++;
	}

	public String getIdStudent(){
		return IdStudent;
	}

	public String getYears(){
		return years;
	}

	public String getBranch(){
		return branch;
	}

	public String getEvalatued(){
		return evalatued;
	}

/*
	private String IdStudent;
	private String years;
	private String branch;
	private String evalatued;
*/
	@Override
	public void nhapTT(){
		super.nhapTT();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap id student: ");
		this.IdStudent = scanner.nextLine();
		System.out.print("nam: ");
		this.years = scanner.nextLine();
		System.out.print("nhap chuyen nganh: ");
		this.branch = scanner.nextLine();
		System.out.print("xep loai: ");
		this.evalatued = scanner.nextLine();
	}

	@Override
	public void showInfo(){
		System.out.println();
		System.out.println("-----------------");
		System.out.println("STT: " + sttStudent);
		super.showInfo();
		System.out.println("id student:" + IdStudent);
		System.out.println("nam:" + years);
		System.out.println("chuyen nganh:" + branch);
		System.out.println("xep loai:" + evalatued);

	}
}