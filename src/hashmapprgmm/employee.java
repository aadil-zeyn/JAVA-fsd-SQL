package hashmapprgmm;

import java.util.Objects;

public class employee {
		private int id;
		private String department;
        private String name;
        private int age;
		@Override
		public int hashCode() {
			return Objects.hash(age, department, id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			employee other = (employee) obj;
			return age == other.age && Objects.equals(department, other.department) && id == other.id
					&& Objects.equals(name, other.name);
		}
		@Override
		public String toString() {
			return "employee [id=" + id + ", department=" + department + ", name=" + name + ", age=" + age + "]";
		}
		public employee(int id, String department, String name, int age) {
			
			this.id = id;
			this.department = department;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
        
}
