package by.htp.arraytasks.runner;

import by.htp.arraytasks.model.*;
public class Runner {

	public static void main(String[] args) {
		Student st = new Student("Joe0", "Smith0", 81, 2017);
		Student st1 = new Student("Joe1", "Smith1", 22, 2015);
		Student st2 = new Student("Joe2", "Smith2", 32, 2015);
		Student st3 = new Student("Joe3", "Smith3", 97, 2015);
		Student st4 = new Student("Joe4", "Smith4", 18, 2018);
		Student st5 = new Student("Joe5", "Smith5", 32, 2018);
		
		StudentGroup sg = new StudentGroup();
		
		sg.addStudent(st);
		sg.addStudent(st1);
		sg.addStudent(st2);
		sg.addStudent(st3);
		sg.addStudent(st4);
		sg.addStudent(st5);
//		sg.printAllStudents(sg);
//		System.out.println(sg.getMidAge(sg));
//		System.out.println(sg.studentsInYear(2018));
//		sg.bestYear();
//		sg.swapStudents(1, 5);
//		sg.printAllStudents(sg);
//		sg.sortBubbleAsc();
//		sg.printAllStudents(sg);
//		
//		sg.sortBubbleDesc();
//		sg.printAllStudents(sg);
//		
//		sg.sortInsertionAsc();
//		sg.printAllStudents(sg);
//		
//		sg.sortInsertionDesc();
//		sg.printAllStudents(sg);
//		
//		sg.sortSelectionAsc();
//		sg.printAllStudents(sg);
		
//		sg.sortSelectionDesc();
//		sg.printAllStudents(sg);
		
		sg.qsortAsc(0, sg.getStudentCount()-1);
		sg.printAllStudents(sg);
		
		sg.qsortDesc(0, sg.getStudentCount()-1);
		sg.printAllStudents(sg);
	}

}
