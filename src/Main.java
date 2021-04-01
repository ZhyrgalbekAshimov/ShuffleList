import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 4, 5, 1, 1, 1, 7));

        for (int i =1; ;i++){
            Collections.shuffle(list);

            for(int k = 1; k<list.size()-2; k++){

                if (list.get(k).equals(list.get(k - 1)) & list.get(k).equals(list.get(k + 1))){
                    System.out.println("Finished!");
                    System.out.println(list);
                    System.out.println("List shuffled " + i + " times");
                    return;
                }
            }
        }
    }
}
