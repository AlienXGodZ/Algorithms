public class Test43 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas += gas[i];
            totalCost += cost[i];

            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        if (totalGas < totalCost) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        int[] gas = {3, 4, 3};
        int[] cost = {3, 4, 3};

        int answer = canCompleteCircuit(gas, cost);

        System.out.println("Starting index: " + answer);
    }
}