package by.htp.arraytasks.model;



public class StudentGroup {
	//add unlimited number of students
	//print all students 
	private Student[] students;
	private int studentCount;
	int num = 1;
	
	public void printAllStudents(StudentGroup sg) {
		
		System.out.println("============Goup# "+ sg.num + "============");
		for(int i = 0; i < studentCount; i++) {
			System.out.print(students[i].getName() + " ");
			System.out.print(students[i].getSurname() + " ");
			System.out.print(students[i].getAge() + " ");
			System.out.print(students[i].getYear() + " ");
			System.out.println();
		}
	}
	
	public int getStudentCount() {
		return this.studentCount;
	}
	
	public int getMidAge(StudentGroup sg) {
		int avgAge = 0;
		for(int i = 0; i < sg.studentCount; i++){
			avgAge = avgAge + students[i].age;
		}
		avgAge = (int) avgAge/studentCount;
		return avgAge;
	}
	
	public void addStudent(Student student) {
		if (studentCount == 0) {
			this.students = new Student[15];
			this.students[0] = student;
			
			System.out.println();
			this.studentCount ++;
		} else {
			if(studentCount < 15) {
				students[studentCount] = student;
				this.studentCount ++;
			} else {
				System.out.println("Student is not added, group is full");
			}
			
		}
	}
	
	public void bestYear () {
		int by = 0;
		int byCount = 0;
		for(int i=0; i < this.studentCount; i++) {
			if(studentsInYear(students[i].getYear()) > byCount) {
				by = students[i].getYear();
				byCount = studentsInYear(students[i].getYear());
			}
		}
		
		System.out.println(by);
		System.out.println(byCount);
		
	}

	public int studentsInYear (int year) {
		int count = 0;
		for(int i = 0; i < studentCount; i++){
			if(year == students[i].getYear()) {
				count ++;
			};
		}
		
		return count;
	}
	
	public void swapStudents(int a, int b) {
		Student tmp = new Student();
		tmp = this.students[a];
		this.students[a] = this.students[b];
		this.students[b] = tmp;
	}
	
	public void sortBubbleAsc() {
				
		for(int i= 0; i < this.studentCount; i++) {
				for(int j = 1; j < this.studentCount - i; j++) {
					if (students[j-1].getAge() > students[j].getAge()) {
						swapStudents(j-1, j);							
				}
								
			}
		}
			
		
	}
	
	public void sortBubbleDesc() {
		
		for(int i= 0; i < this.studentCount; i++) {
				for(int j = 1; j < this.studentCount - i; j++) {
					if (students[j-1].getAge() < students[j].getAge()) {
						swapStudents(j-1, j);							
				}
								
			}
		}
			
		
	}
	
	
	public void sortInsertionAsc() {	
		int n = this.studentCount;
		for(int i = 1; i < n; ++ i) {
			Student key = students[i];
			int j = i - 1;
			while( j >=0 &&students[j].getAge() > key.getAge()) {
				students[j+1] = students[j];
				j = j -1 ;
			}
			students[j+1] = key;
		}
	}
	public void sortInsertionDesc() {	
		int n = this.studentCount;
		for(int i = 1; i < n; ++ i) {
			Student key = students[i];
			int j = i - 1;
			while( j >=0 &&students[j].getAge() < key.getAge()) {
				students[j+1] = students[j];
				j = j -1 ;
			}
			students[j+1] = key;
		}
	}
	
	public void sortSelectionAsc() {	
		for (int min = 0; min < studentCount - 1; min++) {
				int least = min;
				for (int j= min + 1; j < studentCount; j++) {
					if (students[j].getAge() < students[least].getAge()) {
						least = j;
					}
				}
				swapStudents(least, min);			
			}
		}
	
	public void sortSelectionDesc() {	
		for (int min = 0; min < studentCount - 1; min++) {
				int least = min;
				for (int j= min + 1; j < studentCount; j++) {
					if (students[j].getAge() > students[least].getAge()) {
						least = j;
					}
				}
				swapStudents(least, min);			
			}
		}
	
	public void qsortAsc(int low, int high) { 

		if( low < high ) {
			int pi = partitionAsc(low, high);
			qsortAsc(low, pi - 1);
			qsortAsc(pi+1 , high);
		}
		
	}
	
	public int partitionAsc(int low, int high) {

		int pivot = students[high].getAge();
		int i = low - 1;
		for(int j = low; j < high; j ++) {
			if(students[j].getAge() <= pivot) {
				i ++;
				swapStudents(i,j);
				
			}
		}
		swapStudents(i+1, high);
		return i + 1;
	}
	
	public void qsortDesc(int low, int high) { 

		if( low < high ) {
			int pi = partitionDesc(low, high);
			qsortDesc(low, pi - 1);
			qsortDesc(pi+1 , high);
		}
		
	}
	
	public int partitionDesc(int low, int high) {

		int pivot = students[high].getAge();
		int i = low - 1;
		for(int j = low; j < high; j ++) {
			if(students[j].getAge() >= pivot) {
				i ++;
				swapStudents(i,j);
				
			}
		}
		swapStudents(i+1, high);
		return i + 1;
	}
	
	
}
