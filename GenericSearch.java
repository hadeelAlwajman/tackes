/**
 * Created by USER on 14/03/2021.
 */
public class GenericSearch {
    public static <E> int search(E a[], E element){
            boolean flag=false;
            int i=0;
            int index=-1;
            while (i<a.length&&!flag){
                if(a[i]==element){
                    flag=true;
                    index=i;
                }
                i++;
            }
            return index;
    }
    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        String b[]={"basma","manal"};
        System.out.println(search(a,13));
        //print(b);
    }

}
