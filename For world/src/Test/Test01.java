package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public class Test01 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Student s1 = new Student("张三", "语文", 1000);
		Student s2 = new Student("张三", "数学", 90);
		Student s3 = new Student("张三", "英语", 70);
		Student s4 = new Student("李四", "数学", 90);
		Student s5 = new Student("李四", "语文", 80);
		Student s6 = new Student("王五", "语文", 80);
		Student s7 = new Student("王五", "英语", 70);
		Student s8 = new Student("王五", "物理", 90);
		List<Student> students = new ArrayList<>();
		//将学生成绩对象存放到list中去
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		/*for (Student student : students) {
			System.out.println(student);
		}*/	
		/**
		 * 将学生的成绩按学生列表输出
		 * 应该有一个科目的数组
		 */
		String[] subject = new String[]{"学科/姓名","语文","数学","英语","物理","平均分"};
		for (String string : subject) {
			System.out.print(string+"\t");
		}
		System.out.println();
		//将学生的成绩和姓名存放到HashMap中,键是姓名,value是一个成绩数组integer
		HashMap<String, Integer[]> studentmap = new HashMap<>();
		
		//将所有学生的姓名添加到studentmap中去了
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			//如果学生的姓名对应的HashMap中的键值不存在,则向其中添加
			if(!studentmap.containsKey(s.getName())){
				studentmap.put(s.getName(),null);
			}		
		}
		
		//将学生的成绩按照科目的排序存到studentmap的对应学生姓名的key 的value Integer数组中
		//遍历studentmap 通过namekey
		for (String key : studentmap.keySet()) {
			//输出姓名
			System.out.print("     "+key+"\t");
			//创建value值 Integer数组  长度是比学科数组少一 因为有平均分
			Integer[] grades = new Integer[subject.length-1];
			
			//遍历学生成绩List
			for (Student stu : students) {
				
				//如果名字相同,就把它的成绩放到数组的指定位置
				if(stu.getName().equals(key)){
					
					//遍历学科数组,如果stu对应的科目与学科相同就把分数放到对应位置
					for(int i=0;i<subject.length-2;i++){
						if(stu.getCourse().equals(subject[i+1]))
						{
							grades[i] = stu.getGrade();
						}
					}
				}
			}
			Integer sum = 0;
			int count = 0;
			for (int i = 0;i<grades.length-1;i++){
				System.out.print((grades[i]!=null)?grades[i]:"");
				System.out.print("\t");
				if(grades[i] != null){
					sum += grades[i];
					count ++;
				}
			}
			int avg = grades[grades.length-1] = (int) (sum*1.0/count);
			System.out.print(avg);
			System.out.println();
		}
		
	}
}
class Student{
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", grade=" + grade + "]";
	}
	private String name;
	private String course;
	private Integer grade;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name,String course,Integer grade){
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
}