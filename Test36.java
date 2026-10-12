import java.util.Arrays;
import java.util.Comparator;

class Item {

    int weight;
    int value;

    Item(int weight, int value) {

        this.weight = weight;
        this.value = value;

    }

}

    public class Test36 {

        public static double fractionalknapsack(Item[] item, int capacity) {

            Arrays.sort(item, new Comparator<Item>() {
                @Override
                public int compare(Item s1, Item s2) {

                    double ratio1 = (double) s1.value / s1.weight;

                    double ratio2 = (double) s2.value / s2.weight;

                    return Double.compare(ratio2, ratio1);

                }
            });

            double totalvalue = 0;

            for (Item items : item) {

                if (capacity >= items.weight) {

                    capacity -= items.weight;

                    totalvalue += items.value;

                } else {

                    double fraction = (double) capacity / items.weight;

                    totalvalue += items.value * fraction;

                    capacity = 0;

                    break;

                }

            }

            return totalvalue;

        }



        public static void main(String[] args) {

            Item[] item = {new Item(10, 60),
                    new Item(20, 100),
                    new Item(30, 120)};

            int capacity = 50;

            double result = fractionalknapsack(item, capacity);

            System.out.println("Maximum value: " + result);

    }
}
