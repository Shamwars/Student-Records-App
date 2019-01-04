/**
 * @student 2014359
 * @author Yassin Ting
 *
 * Java program to manage student records.
 */

//import the ArrayList class
import java.util.ArrayList;

// Import all the classes needed to read and write a File
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

// Import the classes needed to check for error (Exceptions)
import java.io.FileNotFoundException;
import java.io.IOException;

//import Scanner
import java.util.Scanner;

//class StudentApp
public class StudentApp{
	//main method
	public static void main(String[] args){
		//load students from file
		String stuFile = "Student.txt";

		// Declare and create any objects needed in program
		ArrayList<Student>stuList = new ArrayList<Student>();

        //Declare Scanner to getinput from user
		Scanner sc = new Scanner(System.in);

		//Declare varibale for choice by user
		String userChoice = "";

		//starting loop
		while(!userChoice.equals("6")){
			iMenu();   //choices of menu on display for user to choose
			userChoice = sc.nextLine();

			if(userChoice.equals("1")){
				addStudent(sc);
			} else if(userChoice.equals("2")){
				searchStudent(sc);
			} else if(userChoice.equals("3")){
				modifyStudent(sc);
			} else if(userChoice.equals("4")){



		System.out.println("Please Choose From the Following Menu");
		System.out.println();
		System.out.println("1: Add Student");
		System.out.println("2: Search Student");
		System.out.println("3: Modify Student Info");
		System.out.println("4: Delete a Student");
		System.out.println("5: Exit");
		System.out.println();
		System.out.println("You Choose : ");

		int choice = sc.nextInt();
		switch (choice){
			case 1:
			System.out.println("1: Add Student");
			break;
			case 2:
			System.out.println("2: Search Student");
			break;
			case 3:
			System.out.println("3: Modify Student Info");
			break;
			case 4:
			System.out.println("4: Delete a Student");
			break;
			case 5:
			System.out.println("5: Exit");
			break;
			default:
			System.out.println("Invalid input");
			break;
		}
		String keepAdding;
		do {
			System.out.println("Enter Student Id: ");
			String firstname = sc.nextLine();

			System.out.println("Enter Student First Name: ");
			String lastname = sc.nextLine();

			System.out.println("Enter Student Last Name: ");
			String id = sc.nextLine();

			System.out.println("Enter Email Address: ");
			String email = sc.nextLine();

			System.out.println("Do you want to add another Student (Y/N)?");
			keepAdding = sc.nextLine();

			stu.setId(id);
			stu.setFirstName(firstname);
			stu.setLastName(lastname);
			stu.setEmail(email);

			stuList.add(stu);
		} while (keepAdding.equals("Y"));
		for (int i=0; i<stuList.size(); i++){
			stu = stuList.get(i);
			System.out.println("Student Info: ");
			System.out.println(stu.getId());
			System.out.println(stu.getFirstName());
			System.out.println(stu.getLastName());
			System.out.println(stu.getEmail());
		}

		public static void iMenu(){
			//choice of Menu on display
			System.out.println("Please Choose From the Following Menu");
			System.out.println();
			System.out.println("1: Add Student");
			System.out.println("2: Search Student");
			System.out.println("3: Display Student Info");
			System.out.println("4: Modify Student Info");
			System.out.println("5: Delete a Student");
			System.out.println("6: Exit");
			System.out.println();
			System.out.println("You Choose : ");
		}

		public void AddStudent{
			//Declarations
			String stuFile = "Student.txt";
			File f = new File (stuFile);

			// Declare a FileWriter
			FileWriter fw = null;
			try{
				fw = new FileWriter(f);
			}catch (IOException ioe){
				System.out.println("Error creating file");
			}
			BufferedWriter bw = new BufferedWriter(fw);
		}

		String firstname, lastname, id, mobile, email;

		System.out.println("Enter Sudent First Name: ");
		String firstname = fw.readLine();
		System.out.println("Enter Student Last Name: ");
		String lastname = fw.readLine();
		System.out.println("Enter Student Id: ");
		String id = fw.readLine();
		System.out.println("Enter Student Mobile Number: ");
		String mobile = in.readLine();
		System.out.println("Enter Student Email Address: ");
		String email = fw.readLine();
	}

	private static ArrayList<Student>loadFile(String fileloc){
		ArrayList<Student> sss = new ArrayList<Student>();

		Scanner userInput = new Scanner(new File(fileloc));
		try{
			sss.addFile(loadFile("Student.txt"));
			} catch (FileNotFoundException e){
				System.out.println("Failed to load file");
			}
			//loop through file
			while(userInput.hasNextLine());
			sss.add(student);
		}
		return sss;
	}

	private static void saveFile(String fileloc, ArrayList<Student> sss){
		//save file
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileloc));

		// create loop inside the list
		for(int i=0; i<sss.length(), i++){
			//get Student
			Student stuList = sss.get(i);
			//write to file
			bw.write(stuList = getFirstName());
			bw.write(";");
			bw,write(stuList = getLastName());
			bw.write(";");
			bw.write(stuList = getId());
			bw.write(";");
			bw.write(stuList = getMobile());
			bw.write(";");
			bw.write(stuList = getEmail());
			bw.write(";");
		}

			if(i<sss.length()){
				bw.newLine();
			}
			bw.close();
		}

		private static void searchStudents(Scanner sc){

		}

	}
}






