import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static class Student implements Comparable<Student>{
		String name;
		int kor, eng, math;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		@Override
		public int compareTo(Student o) {
			if(this.kor == o.kor) {
				if(this.eng == o.eng) {
					if(this.math == o.math) {
						for(int i = 0; i<Math.min(this.name.length(),o.name.length() );i++) {
							if(this.name.charAt(i)!= o.name.charAt(i)) {
								return this.name.charAt(i) - o.name.charAt(i);
							}
						}
					}
					return o.math - this.math;
				}
				return this.eng - o.eng;
			}
			return o.kor- this.kor;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Student[] students = new Student[N];
		for(int i = 0; i<N; i++) {
			students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(students);
		for (int i = 0; i<N; i++) {
			System.out.println(students[i].name);
		}
	}
}
