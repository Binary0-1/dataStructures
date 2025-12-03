import java.util.*;

public class Lc853 {

    static double getTime(int distance, int speed) {
        System.out.println(distance + "  " + speed);
        return (double) distance / speed;
    }

    static int carFleet(int target, int[] position, int[] speed) {
        List<int[]> sortedCars = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            sortedCars.add(new int[] { position[i], speed[i] });
        }

        
        sortedCars.sort(Comparator.comparingInt(a -> a[0]));

        System.out.println(Arrays.toString(sortedCars.get(sortedCars.size() - 1)));
        
      
        Stack<Double> stack = new Stack<>();
        stack.push(getTime(target - sortedCars.get(sortedCars.size() - 1)[0],
                sortedCars.get(sortedCars.size() - 1)[1]));

        for (int i = sortedCars.size() - 2; i >= 0; i--) {
            int currPosition = sortedCars.get(i)[0];
            int currSpeed = sortedCars.get(i)[1];
            double currTime = getTime(target - currPosition, currSpeed);
            double prevTime = stack.peek();

            System.out.println(currTime);
            System.out.println(prevTime);

            if (currTime <= prevTime) {
                continue;
            } else {
                stack.push(currTime);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        int[] postions = { 6, 8 };
        int[] speed = { 3, 2 };

        System.out.println(carFleet(10, postions, speed));

    }

}
