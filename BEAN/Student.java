package BEAN;

public class Student implements serializable{
    private String Name;
    private String RollNo;
   private int age;
    Student(){
        // here Default a constructor...
    }
    public Student(String name, String rollno, int Age){
        this.Name= name;
        this.RollNo=rollno;
        this.age=Age;
    }
    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setRollNo(String Rollno){
        this.RollNo=Rollno;
    }
    public String getRollNo(){
        return RollNo;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void result(){
        System.out.println(" My Name is "+Name +"\n My Roll No is "+RollNo +"\n My Age is "+age);
    }
    public static void main(String args[]){
        Student Bean = new Student("Johan", "xxFF3298", 20);
        Bean.result();
    }
}
