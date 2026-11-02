public class Test103{

    public static int knapsack(int[] weight,int[] value,int capacity,int index){

        if(index == weight.length){

            return 0;

        }

        int skip = knapsack(weight,value,capacity,index + 1);

        int take = 0;

        if(weight[index] <= capacity){

            take = value[index] + knapsack(weight,value,capacity - weight[index],index);

        }

        return Math.max(skip,take);


    }

    public static void main(String[] args){

        int[] weight = {2, 3, 4};
        int[] value = {10, 20, 30};
        int capacity = 6;

        System.out.println(knapsack(weight,value,capacity,0));


    }
}