/**
 * Created by USER on 28/02/2021.
 */
public class Marge {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={6,7,8,9,10};
        int marge[]=new int[a1.length+a2.length];
        int s=0;
        for (int i = 0; i < a1.length; i++) {
            marge[i]=a1[i];
            s++;
        }
        for (int i = 0; i < a2.length; i++) {
            marge[s++]=a1[i];
        }
        for (int i = 0; i < marge.length; i++) {
            System.out.print(marge[i]+" ");
        }

        }
    }

