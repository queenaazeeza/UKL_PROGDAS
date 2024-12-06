import java.util.HashMap;
import java.util.Map;

public class uklsulitno3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        
        Map<Integer, Integer> frekuensiMap = new HashMap<>();
        
        for (int num : array) {
            frekuensiMap.put(num, frekuensiMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
    }
