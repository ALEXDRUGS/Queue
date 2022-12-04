package example;

import java.util.*;

public class ListRefactor {
    public static Map<String, List<Integer>> stringListHashMap = new HashMap<>();

    public List<Integer> add() {
        List<Integer> integerList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            integerList.add(i, random.nextInt(1000));
            System.out.println(integerList);
        }
        return integerList;
    }

    public static List<Integer> getSum(List<Integer> integerList) {
        Integer sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        integerList.clear();
        integerList.add(sum);
        return integerList;
    }

    public static void main(String[] args) {
        ListRefactor listRefactor = new ListRefactor();
        List<Integer> test = listRefactor.add();
        stringListHashMap.put("nums", test);
        System.out.println(stringListHashMap);
        stringListHashMap.replace(stringListHashMap.entrySet().iterator().next().getKey(), getSum(test));
        System.out.println(stringListHashMap);
    }
}
