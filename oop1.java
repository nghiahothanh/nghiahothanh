import mypack.person;
public class oop1 {
    public static void main(String[] args){
        person a=new person("Ho Thanh Nghia",18,1.65f);
        a.eat("rice");
        int age=a.getAge();
        System.out.println("His age:"+age);

    }
    
}
