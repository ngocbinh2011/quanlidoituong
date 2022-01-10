// this is test
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;

public class Main {
	public static int i = 0;
	public static Scanner scanf = new  Scanner(System.in);
	public static ArrayList<Object> list = new ArrayList<>();
	public static ArrayList<student> listStudent = new ArrayList<>();
	public static ArrayList<leader> listLeader = new ArrayList<>();
	public static ArrayList<teacher> listTeacher = new ArrayList<>();
	public static ArrayList<studentGraduated> listSTG = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);	
		boolean run = true;

		while (run != false){
			int n = 0;
			System.out.println("-------------------");
			System.out.println("0.hien thi doi tuong");
			System.out.println("1.them doi tuong");
			System.out.println("2.sua thong tin doi tuong");
			System.out.println("3.xoa thong tin doi tuong");
			System.out.println("4.tim kiem doi tuong theo ten");
			System.out.println("5.tim kiem doi tuong theo ma");
			System.out.println("6.sap xep danh sach tang dan a-z theo ten");
			System.out.println("7.ghi thong tin vao file");
			System.out.println("8.thoat");
			System.out.println("-------------------");
			System.out.print("lua chon: ");

			int choice = scanner.nextInt();
			switch(choice){
				case 0:
					showObject();
					showInfomationObject();
					break;
				case 1:
					showObject();
					themDoiTuong();
					break;
				case 2:
					showObject();
					// System.out.println("NHAP THONG TIN OBJECT CAN SUA: ")
					repairInfoObject();					
					break;
				case 3:
					showObject();
					deleteObject();
					break;
				case 4:
					showObject();
					findObjectInName();
					break;
				case 5:
					showObject();
					findObjectInCode();
					break;
				case 6:
					showObject();
					nameStudentSort();
					break;
				case 7:
					showObject();
					fileWriteObject();
					System.out.println("Successfully");
					break;
				case 8:
					run = false;
					break;
			}
		}
	}

	public static void showObject(){
		System.out.println("1.giao vien");
		System.out.println("2.truong khoa");
		System.out.println("3.student");
		System.out.println("4.student graduated");
		System.out.print("lua chon: ");	
	}

	//add new Object
	public static void themDoiTuong(){
		int element = scanf.nextInt();
		System.out.println("-------------------");
		System.out.println("NHAP THONG TIN OBJECT CAN THEM: ");
		switch(element){
			case 1:
				teacher tea = new teacher();
				tea.nhapTT();	
				listTeacher.add(tea);
				break;
			case 2:
				leader lea = new leader();
				lea.nhapTT();
				listLeader.add(lea);
				break;
			case 3:
				student stu = new student();
				stu.nhapTT();
				listStudent.add(stu);
				break;
			case 4:
				studentGraduated  stG = new studentGraduated();
				stG.nhapTT();
				listSTG.add(stG);
				break;
		}
	}

	public static void showInfomationObject(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		System.out.println("INFORMATION OF OBJECT: ");
		switch(choose){
			case 1:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong");
				else
				for(teacher tea: listTeacher){
					tea.showInfo();
				}
				break;
			case 2:
				if(listLeader.size() == 0) System.out.println("ko co doi tuong");
				else
				for(leader lea: listLeader){
					lea.showInfo();
				}
				break;
			case 3:
				if(listStudent.size() == 0) System.out.println("ko co doi tuong");
				else
				for(student stu: listStudent){
					stu.showInfo();
				}
				break;
			case 4:
				if(listSTG.size() == 0) System.out.println("ko co doi tuong");
				else
				for(studentGraduated stG: listSTG){
					stG.showInfo();
				}
				break;
		}
	}

	//repair information of Object
	public static void repairInfoObject(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de sua");
				else{
					System.out.println("nhap ma giao vien:");
					String codeTeacher = scanf.nextLine();
					for(teacher x: listTeacher){
						if((x.getIDcard()).equals(codeTeacher) == true){
							System.out.println("NHAP THONG TIN CAN SUA");
							count++;
							x.nhapTT();
							System.out.println("suceessfully");
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 2:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de sua");
				else{
					System.out.println("nhap ma truong khoa:");
					String codeLeader = scanf.nextLine();
					for(leader x: listLeader){
						if((x.getIDcard()).equals(codeLeader) == true){
							System.out.println("NHAP THONG TIN CAN SUA");
							count++;
							x.nhapTT();
							System.out.println("suceessfully");
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 3:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de sua");
				else{
					System.out.println("nhap ma student:");
					String codeStudent = scanf.nextLine();
					for(student x: listStudent){
						if((x.getIDcard()).equals(codeStudent) == true){
							System.out.println("NHAP THONG TIN CAN SUA");
							count++;
							x.nhapTT();
							System.out.println("suceessfully");
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 4:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de sua");
				else{
					System.out.println("nhap ma student graduated:");
					String codeSTG = scanf.nextLine();
					for(studentGraduated x: listSTG){
						if((x.getIDcard()).equals(codeSTG) == true){
							System.out.println("NHAP THONG TIN CAN SUA");
							count++;
							x.nhapTT();
							System.out.println("suceessfully");
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
		}
	}

	public static void findObjectInName(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP TEN TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(teacher x: listTeacher){
						if(finder.equals(x.getFullName()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 2:
				if(listLeader.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP TEN TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(leader x: listLeader){
						if(finder.equals(x.getFullName()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 3:
				if(listStudent.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP TEN TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(student x: listStudent){
						if(finder.equals(x.getFullName()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 4:
				if(listSTG.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP TEN TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(studentGraduated x: listSTG){
						if(finder.equals(x.getFullName()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
		}
	}

	public static void findObjectInCode(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				if(listTeacher.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP MA ID TEACHER TIM KIEM :");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(teacher x: listTeacher){
						if(finder.equals(x.getIdTeacher()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 2:
				if(listLeader.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP MA ID TEACHER TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(leader x: listLeader){
						if(finder.equals(x.getIdTeacher()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 3:
				if(listStudent.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP ID STUDENT TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(student x: listStudent){
						if(finder.equals(x.getIdStudent()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
			case 4:
				if(listSTG.size() == 0) System.out.println("ko co doi tuong de tim kiem");
				else{
					System.out.println("NHAP TEN TIM KIEM:");
					String finder = scanf.nextLine();
					System.out.println("THONG TIN DOI TUONG CO TEN TRUNG KHOP:");
					for(studentGraduated x: listSTG){
						if(finder.equals(x.getIdStudent()) == true){
							x.showInfo();
							count++;
						}
					}
					if(count == 0) System.out.println("KO CO DOI TUONG TRUNG KHOP");
				}
				break;
		}
	}

	public static void deleteObject(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				if(listTeacher.size() == 0) System.out.println("KO CO OBJECT DE XOA");
				else{
					System.out.println("MOI NHAP MSV DE XOA");
					String code = scanf.nextLine();
					boolean change = false;
					for(int i=0; i<listTeacher.size(); i++){
						if(listTeacher.get(i).getIdTeacher().equals(code) == true){
							change = true;
							listTeacher.remove(listTeacher.get(i));
						}
					}
					if(change = true) System.out.println("SUCEESS");
					else System.out.println("KO CO DOI TUONG PHU HOP");
				}
				break;
			case 2:
				if(listLeader.size() == 0) System.out.println("KO CO OBJECT DE XOA");
				else{
					System.out.println("MOI NHAP MSV DE XOA");
					String code = scanf.nextLine();
					boolean change = false;
					for(int i=0; i<listLeader.size(); i++){
						if(listLeader.get(i).getIdTeacher().equals(code) == true){
							change = true;
							listLeader.remove(listLeader.get(i));
						}
					}
					if(change = true) System.out.println("SUCEESS");
					else System.out.println("KO CO DOI TUONG PHU HOP");
				}
				break;
			case 3:
				if(listStudent.size() == 0) System.out.println("KO CO OBJECT DE XOA");
				else{
					System.out.println("MOI NHAP MSV DE XOA");
					String code = scanf.nextLine();
					boolean change = false;
					for(int i=0; i<listStudent.size(); i++){
						if(listStudent.get(i).getIdStudent().equals(code) == true){
							change = true;
							listStudent.remove(listStudent.get(i));
						}
					}
					if(change = true) System.out.println("SUCEESS");
					else System.out.println("KO CO DOI TUONG PHU HOP");
				}
				break;

			case 4:
				if(listSTG.size() == 0) System.out.println("KO CO OBJECT DE XOA");
				else{
					System.out.println("MOI NHAP MSV DE XOA");
					String code = scanf.nextLine();
					boolean change = false;
					for(int i=0; i<listSTG.size(); i++){
						if(listSTG.get(i).getIdStudent().equals(code) == true){
							change = true;
							listSTG.remove(listSTG.get(i));
						}
					}
					if(change = true) System.out.println("SUCEESS");
					else System.out.println("KO CO DOI TUONG PHU HOP");
				}
				break;
		}
	}

	public static void fileWriteObject() throws IOException{
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				WriteOfObject("dataStudent.txt", "teacher");
				break;
			case 2:
				WriteOfObject("dataLeader.txt", "leader");
				break;
			case 3:
				WriteOfObject("dataStudent.txt", "student");
				break;
			case 4:
				WriteOfObject("dataStudentGraduated.txt", "studentGraduated");
				break;
		}
	}

	public static void nameStudentSort(){
		int choose = scanf.nextInt();
		System.out.println("-------------------");
		scanf.nextLine();
		int count = 0;
		switch(choose){
			case 1:
				Collections.sort(listTeacher, new comparatorStudent<teacher>());
				System.out.println("Successfull");
				break;
			case 2:
				Collections.sort(listLeader, new comparatorStudent<leader>());
				System.out.println("Successfull");
				break;
			case 3:
				Collections.sort(listStudent, new comparatorStudent<student>());
				System.out.println("Successfull");
				break;
			case 4:
				Collections.sort(listSTG, new comparatorStudent<studentGraduated>());
				System.out.println("Successfull");
				break;
		}
	}

	public static void WriteOfObject(String s, String obj) throws IOException{
		FileWriter writer = new FileWriter(s, true);
		if(obj.equals("teacher") == true){
			if(listTeacher.size() == 0) System.out.println("KO CO DOI TUONG DE LUU FILE");
			else{
				for(teacher x: listTeacher){
					writer.append("-----------------\n");
					writer.append("ID card: "+ x.getIDcard()+ "\n");
					writer.append("full name: " + x.getFullName()+ "\n");
					writer.append("address: " + x.getAddress()+ "\n");
					writer.append("email: " + x.getEmail()+ "\n");
					writer.append("phone Number: " + x.getPhoneNumber()+ "\n");
					writer.append("ID teacher: " + x.getIdTeacher()+ "\n");
					writer.append("chuyen mon: " + x.getChuyenMon()+ "\n");
					writer.append("kinh nghiem: " + x.getExperience()+ "\n");
					writer.append("luong: " + x.getSalary()+ "\n");
					writer.append("vi tri: " + x.getPosition()+ "\n");
					writer.append("-----------------\n");
				}
			}
		}

		if(obj.equals("leader") == true){
			if(listLeader.size() == 0) System.out.println("KO CO DOI TUONG DE LUU FILE");
			else{
				for(leader x: listLeader){
				writer.append("-----------------\n");
				writer.append("ID card: "+ x.getIDcard()+ "\n");
				writer.append("full name: " + x.getFullName()+ "\n");
				writer.append("address: " + x.getAddress()+ "\n");
				writer.append("email: " + x.getEmail()+ "\n");
				writer.append("phone Number: " + x.getPhoneNumber()+ "\n");
				writer.append("chuyen mon: " + x.getChuyenMon()+ "\n");
				writer.append("kinh nghiem: " + x.getExperience()+ "\n");
				writer.append("luong: " + x.getSalary()+ "\n");
				writer.append("vi tri: " + x.getPosition()+ "\n");
				writer.append("nhiem Ki: " + x.getNhiemKi()+ "\n");
				writer.append("thanh tich: " + x.getThanhTich()+ "\n");
				writer.append("-----------------\n");
				}
			}
		}

		if(obj.equals("student") == true){
			if(listStudent.size() == 0) System.out.println("KO CO DOI TUONG DE LUU FILE");
			else{
				for(student x: listStudent){
				writer.append("-----------------\n");
				writer.append("ID card: "+ x.getIDcard() + "\n" );
				writer.append("full name: " + x.getFullName()+ "\n");
				writer.append("address: " + x.getAddress()+ "\n");
				writer.append("email: " + x.getEmail()+ "\n");
				writer.append("phone Number: " + x.getPhoneNumber()+ "\n");
				writer.append("ID student: " + x.getIdStudent()+ "\n");
				writer.append("years: " + x.getYears()+ "\n");
				writer.append("chuyen Nganh: " + x.getBranch()+ "\n");
				writer.append("xep loai: " + x.getEvalatued()+ "\n");
				writer.append("-----------------\n");
				}
			}
		}

		if(obj.equals("studentGraduated") == true){
			if(listSTG.size() == 0) System.out.println("KO CO DOI TUONG DE LUU FILE");
			else{
				for(studentGraduated x: listSTG){
				writer.append("-----------------\n");
				writer.append("ID card: "+ x.getIDcard() + "\n");
				writer.append("full name: " + x.getFullName() + "\n");
				writer.append("address: " + x.getAddress()+ "\n");
				writer.append("email: " + x.getEmail()+ "\n");
				writer.append("phone Number: " + x.getPhoneNumber()+ "\n");
				writer.append("ID student: " + x.getIdStudent()+ "\n");
				writer.append("years: " + x.getYears()+ "\n");
				writer.append("chuyen Nganh: " + x.getBranch()+ "\n");
				writer.append("xep loai: " + x.getEvalatued()+"\n");
				writer.append("chuc vu sv: " + x.getChucVuSV()+"\n");
				writer.append("luong SV: " + x.getStudentSalary()+"\n");
				writer.append("-----------------\n");
				}
			}
		}
		writer.close();
	
}

}
