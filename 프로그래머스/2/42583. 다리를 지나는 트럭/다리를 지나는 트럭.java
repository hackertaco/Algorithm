import java.util.*;
import static java.util.stream.Collectors.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int currWeight = 0;
        Queue<Truck> queue = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();
        for(int t: truck_weights){
            queue.add(new Truck(t));
        }
        while (!queue.isEmpty() || !bridge.isEmpty()) {

            time++;
            bridge.forEach(Truck::elapsedTime);

            if (!bridge.isEmpty()) {
                Truck truck = bridge.peek();
                if (truck.getElapsedTimeInBridge() >= bridge_length) {
                    bridge.poll();
                }
            }

            if (!queue.isEmpty()) {
                Truck truck = queue.peek();
                if (isBridgeAvailable(bridge_length, weight, bridge, truck)) {
                    bridge.add(queue.poll());
                }
            }
        }
        return time;
    }
     private boolean isBridgeAvailable(int bridgeLength, int weight, Queue<Truck> bridge, Truck truck) {
        return bridge.size() < bridgeLength && truck.getWeight() + bridge.stream().mapToInt(Truck::getWeight).sum() <= weight;
    }
}

class Truck {
    int weight;
    int elapsedTimeInBridge = 0;

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getElapsedTimeInBridge() {
        return elapsedTimeInBridge;
    }

    public void elapsedTime() {
        this.elapsedTimeInBridge++;
    }
}