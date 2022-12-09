package Java_Homeworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HomeTask3_2 {
    public static void main(String[] args) {
        // * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        // * sum / count
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 12, 15, 19, -5);
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Minimum = " + Collections.min(numbers));
        System.out.println("Average = " + sum/(float)numbers.size());
        System.out.println("Maximum = " + Collections.max(numbers));



    }

}




//int[] numbers = {5, 8, 12, -25, 25, 84};
//double sum = 0;
//for (int x: numbers) {
//    sum += x;
//}
//System.out.println("Average = " + sum/numbers.length);

//    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 11, -4);
  //  double avg = getAverage(list);
 //       System.out.println(avg);
//
 //               }
//private static double getAverage(List<Integer> list) {
 //       return list.stream()
   //     .mapToInt(a -> a)
     //   .average().orElse(0);
       // }