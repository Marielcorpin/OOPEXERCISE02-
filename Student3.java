public class Student3
{
	public class MainProgram {
		public static void main(String[] args){
			Student student;
			Girl girl = new Girl("Anna", 18,"Badminton");
			Boy boy = new Boy("Joel", 21, "3rd Year College");

			student = Girl;
			System.out.println(Student.skincolor()  +  " "  + "My name is"  + Student.getName());

			student = Boy;
			System.out.println(Student.skincolor()  +  " "  + "My name is"  + Student.getName());
		}
	}
}
