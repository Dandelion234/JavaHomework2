package hw;

public class text {
    public static void main(String[] args) {
        Cookie cookie1=new Cookie(6.5,15);
        Cookie cookie2=new Cookie(5,7);
        Cookie cookie3=new Cookie(3,5);
        System.out.println(cookie1.getPrice());
        cookie1.setPriceOfChocolate(8);
        System.out.println(cookie1.getPrice());
    }
}
