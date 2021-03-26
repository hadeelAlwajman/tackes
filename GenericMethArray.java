/**
 * Created by USER on 24/02/2021.
 */
public class GenericMethArray {
    public static <E>void reverse(E a[])
    {
        for (int i = 0; i <a.length ; i++) {
            if(i==a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
        System.out.println("         ");
        for (int i = a.length-1; i >=0 ; i--) {
            if(i==a.length)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        reverse(a);
    }
}
