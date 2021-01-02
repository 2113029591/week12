import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        int c=input.nextInt();

        Student s1 = new Student("1", "张三", 20);
        Student s2 = new Student("2", "李四", 23);
        Student s3 = new Student("3", "韩梅", 21);
        Student s4 = new Student("4", "赵亮", 24);
        Student s5 = new Student("5", "亚芳", 19);
        Map<Integer,Student> map=new HashMap<>();
        map.put(s1.getAge(),s1);
        map.put(s2.getAge(),s2);
        map.put(s3.getAge(),s3);
        map.put(s4.getAge(),s4);
        map.put(s5.getAge(),s5);


        Iterator iter=map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println(((Student)entry.getValue()).getNum()+" "+
                    ((Student)entry.getValue()).getName()+" "+
                    ((Student)entry.getValue()).getAge());
        }
    }
}
class Student{
    private String num;
    private String name;
    private int age;
    public Student(){}
    public Student(String num,String name,int age){
        super();
        this.age=age;
        this.num=num;
        this.name=name;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}