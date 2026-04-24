class Person{
    private String name;
    private int age;
    private String email;
    Person(String name, int age, String email){
        this.name=name;
        setAge(age); 
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>=0){
            this.age=age;
        }
        else{
            System.out.println("Invalid Age!");
        }
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(email.contains("@")){
            this.email=email;
        }
        else{
            System.out.println("Invalid Email!");
        }
    }
    void displayInfo(){
        System.out.println("Name: "+name+" , Age: "+age+" , Email: "+email);
    }
}



class Student  extends Person{
    private String studentId;
    private double gpa;
    Student(String name, int age,String email, String studentId, double gpa){
        super(name,age,email);
        this.studentId=studentId;
        this.gpa=gpa;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        if(gpa>=0.0 && gpa<=4.0){
            this.gpa=gpa;
        }
        else{
            System.out.println("Invalid GPA!");
        }
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID: "+studentId+" , GPA: "+gpa);
    }
}



class ScholarshipStudent extends Student{
    private int scholarshipAmount ;
    ScholarshipStudent(String name, int age,String email, String studentId, double gpa, int scholarshipAmount){
        super(name,age,email,studentId,gpa);
        this.scholarshipAmount=scholarshipAmount;
    }
    public int getScholarshipAmount(){
        return scholarshipAmount;
    }
    public void setScholarshipAmount(int scholarshipAmount){
        if(scholarshipAmount>=1000){
            this.scholarshipAmount=scholarshipAmount;
        }
        else{
            System.out.println("Invalid Scholarship Amount!");
        }
    }
   
    @Override
    void displayInfo(){
        super.displayInfo();
            System.out.println("Scholarship Amount: "+scholarshipAmount);
    }
}




public class Main
{
	public static void main(String[] args) {
		ScholarshipStudent s1=new ScholarshipStudent("Sufyan",-5,"moon@gmail.com","numl-06905",2.9,1300);
        s1.setEmail("Sufyangmail.com");
        s1.setScholarshipAmount(700);
        s1.setGpa(4.5);
		s1.displayInfo();
	}
}















