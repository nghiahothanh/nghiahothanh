import mypack.person;
public class Student1 extends person {
public float diemtrungbinh;
public Student1(String name , int age , float height, float diemtrungbinh){
    super(name,age,height);
    this.diemtrungbinh=diemtrungbinh;
    System.out.println("diem trung binh : "+diemtrungbinh);
}
    
}
