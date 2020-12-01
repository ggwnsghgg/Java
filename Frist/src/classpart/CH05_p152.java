package classpart;

public class CH05_p152 {
		int age;
		String name;
		boolean married;
		int childs;
		
		
public Integer getAge() {
		return age;
}
public String getName() {
	return name;
}
public Boolean getMarried() {
	return married;
}
public Integer getChilds() {
	return childs;
}
		public static void main(String[] args) {
			CH05_p152 test = new CH05_p152();
			test.age = 40;
			test.name = "James";
			test.married = true;
			test.childs = 3;
			
			System.out.println(test.age);
			System.out.println(test.name);
			System.out.println(test.married);
			System.out.println(test.childs);
	}

}
