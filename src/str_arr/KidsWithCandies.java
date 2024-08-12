package str_arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> res = new ArrayList<>();

        for (int candy : candies) {
           res.add(candy + extraCandies >= maxCandies);
        }

        return res;
    }


    public static void main(String[] args) {
        KidsWithCandies kwc = new KidsWithCandies();
        System.out.println(kwc.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kwc.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(kwc.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
