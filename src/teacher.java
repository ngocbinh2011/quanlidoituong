import java.util.Scanner;

public class teacher extends people{
	private int sttTeacher;
	private String IdTeacher;
	private String chuyenMon;
	private int experience;
	private int Salary;
	private String position;

	public static int idTeacher = 1;
	public String getChuyenMon(){
		return chuyenMon;
	}

	private int getSttTeacher(){
		sttTeacher = idTeacher;
		idTeacher++;
		return sttTeacher;

	}

	public int getExperience(){
		return experience;
	}

	public int getSalary(){
		return Salary;
	}

	public String getPosition(){
		return position;
	}

	public teacher(){

	}

	public String getIdTeacher(){
		return IdTeacher;
	}

	public teacher(String IDcard, String fullName, String address, 
		String email, String phoneNumber){
		super(IDcard, fullName, address, email, phoneNumber);
	}

	public teacher(String IDcard, String fullName, String address, String email,
	 String phoneNumber, String IdTeacher, String chuyenMon, int experience, String position){
		this(IDcard, fullName, address, email, phoneNumber);
		this.IdTeacher = IdTeacher;
		this.chuyenMon = chuyenMon;
		this.Salary = Salary;
		this.position = position;
	}
/*private String IdTeacher;
	private String chuyenMon;
	private int experience;
	private int Salary;
	private String position;
*/
	@Override
	protected void nhapTT(){
		super.nhapTT();
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap ID Teacher: ");
		this.IdTeacher = scanner.nextLine();
		System.out.print("nhap chuyen mon: ");
		this.chuyenMon = scanner.nextLine();
		System.out.print("nhap kinh nghiem: ");
		this.experience = scanner.nextInt();
		System.out.print("nhap luong: ");
		this.Salary = scanner.nextInt();
		scanner.nextLine();
		System.out.print("nhap vi tri cong tac: ");
		this.position = scanner.nextLine();
	}

	@Override
	public void showInfo(){
		System.out.println();
		System.out.println("-----------------");
		System.out.println("STT: " + getSttTeacher());
		super.showInfo();
		System.out.println("chuyen mon: " + chuyenMon);
		System.out.println("kinh nghiem: " + experience);
		System.out.println("luong: " + Salary);
		System.out.println("vi tri: " + position);

	}
}