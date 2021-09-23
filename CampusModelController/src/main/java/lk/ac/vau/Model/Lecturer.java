 package lk.ac.vau.Model;

public class Lecturer extends PrimaryId<Long> {

		 
		public String Name;
		public String Department;
		public Lecturer( long id,String name, String department) {
			super(id);
			 
			Name = name;
			Department = department;
		}
		 
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		
		
}
 