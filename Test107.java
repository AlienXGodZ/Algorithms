public class Test107 {

    public static int rodCut(
            int[] length, int[] price,
            int index, int rodLength) {

        // No more piece lengths
        if (index == length.length) {
            return 0;
        }

        // SKIP
        int skip = rodCut(
                length, price,
                index + 1, rodLength);

        // TAKE
        int take = 0;

        if (length[index] <= rodLength) {

            take = price[index] +
                    rodCut(
                            length, price,
                            index, rodLength - length[index]);
        }

        return Math.max(take, skip);
    }

    public static void main(String[] args) {

        int[] length = {1, 2, 3, 4};
        int[] price = {2, 5, 7, 8};

        int rodLength = 4;

        System.out.println(
                rodCut(length, price, 0, rodLength));
    }
}