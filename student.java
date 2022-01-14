public class student {
    public String name;
    public int age;
    public float height;
    public static String university="Hoc Vien Ky Thuat Mat Ma";
    public student(String name , int age , float height){
        this.name=name;
        this.age=age;
        this.height=height;
        System.out.println("xin chao :"+name+"\nwelcome to Hoc Vien Ky Thuat Mat Ma");
    }
    public void getinf(int age){
        System.out.println(university+"\nHo Va Ten : "+ name +"\nTuoi : "+age +"\nChieu Cao : "+height);
    }
    public static void getinfouniversity(){
        System.out.println("xin chao!");
    }
}
