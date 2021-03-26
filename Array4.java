import java.util.ArrayList;
import java.util.Random;
import java.util.List;
/**
 * Created by USER on 26/03/2021.
 */
public class Array4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Array4 obj = new Array4();
        System.out.println(obj.getRandomElement(list));

    }

    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
