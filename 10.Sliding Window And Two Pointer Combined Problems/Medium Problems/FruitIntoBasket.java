import java.util.*;

class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
        int maxlen = 0;
        int lastFruit = -1, secondLastFruit = -1;
        int currCount = 0, lastFruitStreak = 0;

        for (int fruit : fruits) {
            if (fruit == lastFruit || fruit == secondLastFruit) {
                currCount++;
            } else {
                currCount = lastFruitStreak + 1;
            }

            if (fruit == lastFruit) {
                lastFruitStreak++;
            } else {
                lastFruitStreak = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            maxlen = Math.max(maxlen, currCount);
        }

        return maxlen;
    }
}

class Main {
    public static void main(String[] args) {
        FruitIntoBasket sol = new FruitIntoBasket();
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(sol.totalFruit(fruits));
    }
}