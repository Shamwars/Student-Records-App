/**
 * @student 2014359
 * @author Yassin Ting
 *
 * Blueprint to store Student Information
 * Java Class that allows us to store information about a Student.
 */

 public class Student{

	 private String firstname;
	 private String lastname;
	 private String id;
	 private String mobile;
	 private String email;

	 public void setFirstName(String firstname){
		 this.firstname = firstname;
	 }

	 public void setLastName(String lastname){
		 this.lastname = lastname;
	 }

	 public void setId(String id){
		 this.id = id;
	 }

	 public void setMobile(String mobile){
		 this.mobile = mobile;
	 }

	 public void setEmail(String email){
		 this.email = email;
	 }

	 public String getFirstName(){
		 return this.firstname;
	 }

	 public String getLastName(){
		 return this.lastname;
	 }

	 public String getId(){
		 return this.id;
	 }

	 public String getMobile(){
		 return this.mobile;
	 }

	 public String getEmail(){
		 return this.email;
	 }
 }

