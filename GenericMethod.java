/**
 * Created by USER on 24/02/2021.
 */
public class GenericMethod {
    public static <E>void print(E arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        String b[]={"basma","manal"};
        print(a);
        print(b);
    }
}
