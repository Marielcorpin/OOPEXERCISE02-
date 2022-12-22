import java.util.*;

public class Main
{
	public abstract class Student {
		protected String name;
		protected double age;

		public Student(String name, double age) {
			this.name=name;
			this.age=age;
		}

		public abstract String skincolor();

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}

		public double getAge() {
			return age;
		}
		public void setAge(double age) {
			this.age=age;
		}
	}
}
