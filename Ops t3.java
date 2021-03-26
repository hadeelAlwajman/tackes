import java.util.Arrays;
import java.util.Random;

/**
 * Created by USER on 24/02/2021.
 */
public class Ops {
    int a[]={11,12,13,14,15};
    public void remove(int []arr,int index )
    {
        if(index>=0&&index<arr.length)
        {
            int i=index;
            while (i<arr.length-1)
            {
                arr[i]=arr[i+1];
                i++;
            }
            arr[i]=0;
        }
    }
    public int seqSearch(int []a,int element)
    {
        boolean flag=false;
        int i=0;
        int index=-1;
        while (i<a.length&&!flag){
            if(a[i]==element){
                flag=true;
                index=i;
            }
            i++;
        }return index;
    }
    public void insertionSort(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            int curr=arr[i];
            int j=i;
            while (j>0&&curr<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=curr;
        }
    }
    public void fillRandom(int arr[])
    {
        Random r=new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i <arr.length; i++) {
            a[i]=r.nextInt(101);
        }
    }

    public static void main(String[] args) {
        Ops o=new Ops();
        System.out.println(Arrays.toString(o.a));
        o.fillRandom(o.a);
       // o.insertionSort(o.a);
       // o.remove(o.a,2);
       System.out.println(Arrays.toString(o.a));
      //  System.out.println(o.seqSearch(o.a,191));
    }
}
