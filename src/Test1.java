import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Book book1=new Book(1001, "Python从入门到购买游标卡尺", 888.0, "Python出版社");
        Book book2=new Book(1002, "MySQL从删库到跑路", 257.0, "MySQL出版社");
        Book book3=new Book(1003, "C++从入门到入土", 155.0, "C++出版社");
        Book book4=new Book(1004, "Java从入门到放弃", 888.0, "java出版社");

        HashMap<Integer,Book> bookHashMap=new HashMap<>();
        bookHashMap.put(book1.getNum(),book1);
        bookHashMap.put(book2.getNum(),book2);
        bookHashMap.put(book3.getNum(),book3);
        bookHashMap.put(book4.getNum(),book4);

        List<HashMap<Integer,Book>> booklist=new ArrayList<>();
        booklist.add(bookHashMap);

        System.out.println("编号\t名称\t单价\t出版社");
        for (HashMap<Integer,Book> h:booklist
             ) {
            //获得key值
            Set<Integer> key=h.keySet();
            for (Integer i:key
                 ) {
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }


    }

}
class Book{
    /**
     * num 为编号
     * name 为书名
     * price 为价格
     * press  为出版社
     */
    private int num;
    private String name;
    private double price;
    private String press;
    public Book(){}
    public Book(int num,String name,double price,String press){
        super();
        this.num=num;
        this.name=name;
        this.press=press;
        this.price=price;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPress() {
        return press;
    }
}