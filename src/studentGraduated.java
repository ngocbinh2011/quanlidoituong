import java.util.Scanner;

public class studentGraduated extends student{
	private String chucVuSV;
	private String studentSalary;

	public studentGraduated(){

	}

	public String getChucVuSV(){
		return chucVuSV;
	}

	public String getStudentSalary(){
		return studentSalary;
	}

	public studentGraduated(String IDcard, String fullName, String address, String email,
		 String phoneNumber, String IdStudent, String years, String branch, String evalatued,
		 String chucVuSV, String studentSalary){
		super(IDcard,fullName, address, email,
		  phoneNumber, IdStudent, years, branch, evalatued);
		this.chucVuSV = chucVuSV;
		this.studentSalary = studentSalary;
	}

	@Override
	public void nhapTT(){
		super.nhapTT();
		Scanner scanner = new Scanner(System.in);

		System.out.print("nhap chuc vu SV:");
		this.chucVuSV = scanner.nextLine();
		System.out.print("nhap luong SV:");
		this.studentSalary = scanner.nextLine();
	}

	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("chuc vu SV: " + chucVuSV);
		System.out.println("luong hien tai SV: " + studentSalary);
	}
}