package sec01.exam07;

import java.util.*;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
		
	}
	
	public boolean equals(Object obj) {								// 학번과 이름이 같아면 true 리턴
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return(sno==student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	public int hashCode() {
		return sno + name.hashCode();
	}
}
