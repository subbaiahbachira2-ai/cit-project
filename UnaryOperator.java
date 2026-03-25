public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        System.out.println("original:"+x);
        //x++(pre increment)
        System.out.println("Post increment:"+(x++));
        System.out.println("After increment:"+x);//6
        System.out.println("pre increment:"+(++x));
        System.out.println("pre decrement:"+(--x));
    }
}
