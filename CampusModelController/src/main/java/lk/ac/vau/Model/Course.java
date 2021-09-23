 package lk.ac.vau.Model;

public class Course extends PrimaryId<String>{

		 
		private String Name;
		private int Duration;
		public Course(String id, String name, int duration) {
			super(id);
		 
			Name = name;
			Duration = duration;
		}
		 
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getDuration() {
			return Duration;
		}
		public void setDuration(int duration) {
			Duration = duration;
		}
		
		
}
