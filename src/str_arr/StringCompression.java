package str_arr;

public class StringCompression {


    // 1- first add to chars into the char arr, we can store in place.

    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        int len = chars.length;
        while (i < len) {
            int count = 0;
            char currentChar = chars[i];
            while (i < len && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[write++] = currentChar;

            // if count is greater than one add count to chars arr as well, if 12 add '1' and '2' respectively
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        // we can return write since it is same as chars length. Not write+1;
        return write;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        System.out.println(sc.compress(chars));

    }

}
