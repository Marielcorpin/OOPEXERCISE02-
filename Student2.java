public class Student2
{
	public class Boy extends Student2{
		private String grade;

		public Boy(String name, double age, String grade) {
			super(name,age);
			this.grade=grade;
		}

		@Override
		public String skincolor() {
			return "white";
		}

		public String grade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade=grade;
		}
	}
}
