package str_arr;

public class CanPlaceFlowers {


    /*
    *   important points: checking arr[0] is true for left and arr[arr.length - 1] is true for right
    *   check left and right in one shot and continue is important.
    *   method for checking three elements in a row.
    *
    * */

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0 || flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if (left && right && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }

            }

        }
       return false;
    }

    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();


      /*  System.out.println(cpf.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0}, 1)); // Expected: true*/
        System.out.println(cpf.canPlaceFlowers(new int[]{0}, 1)); /// Expected: true*/
        System.out.println(cpf.canPlaceFlowers(new int[]{1}, 1)); // Expected: false
      /*  System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 3)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 4)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{1, 1, 1, 1, 1}, 1)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{1, 0, 1, 0, 1}, 1)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 1, 0, 1, 0}, 1)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 1, 0, 1, 0}, 2)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0}, 4)); // Expected: false
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0}, 3)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0}, 2)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0}, 1)); // Expected: true
        System.out.println(cpf.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0}, 0));*/ // Expected: true
    }


}
