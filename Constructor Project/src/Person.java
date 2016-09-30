public class Person
	{
		private String gender;
		private String hair;
		private int age;
		private int height;
		private String name;
		public Person(String g, String ha, int a, int he, String n)
			{
				gender=g;
				hair=ha;
				age=a;
				height=he;
				name=n;
			}
		public String getGender()
			{
				return gender;
			}
		public void setGender(String gender)
			{
				this.gender = gender;
			}
		public String getHair()
			{
				return hair;
			}
		public void setHair(String hair)
			{
				this.hair = hair;
			}
		public int getAge()
			{
				return age;
			}
		public void setAge(int age)
			{
				this.age = age;
			}
		public int getHeight()
			{
				return height;
			}
		public void setHeight(int height)
			{
				this.height = height;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		
	}