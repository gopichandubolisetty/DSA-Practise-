import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;
            
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); 
                }
                exploded = true;
                break; 
            }
            
            if (!exploded) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {3, 5, -6, 2, -1, 4};
        System.out.println(Arrays.toString(asteroidCollision(asteroids))); 
    }
}