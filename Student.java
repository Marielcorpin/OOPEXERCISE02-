public class Student
{
	public class Girl extends Student{
		private String hobby;

		public Girl(String name, double age, String hobby) {
			super(name,age);
			this.hobby=hobby;
		}

		@Override
		public String skincolor() {
			return "Brown";
		}

		public String hobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby=hobby;
		}
	}
}
