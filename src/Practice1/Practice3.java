package Practice1;

/**
 * Created by Tatsuki on 2015/09/25.
 */
public class Practice3 extends a3{
    void addimpl(){
        System.out.println("p3");
    }
    public static void main(String[] args) {
        new Practice3().add();
    }
}
class a3 {
    void add(){
        addimpl();
    }
    void addimpl(){
        System.out.println("a3");
    }
}