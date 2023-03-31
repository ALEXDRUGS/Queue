package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

public class ArrayIntegerRandom {
    private final ArrayList<Integer> integerArrayList = new ArrayList<>(20);
    final Random random = new Random();

    public void addInt() {
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000);
            integerArrayList.add(r);
        }
    }

    public void removeOdd() {
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayIntegerRandom that = (ArrayIntegerRandom) o;
        return Objects.equals(integerArrayList, that.integerArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerArrayList);
    }

    @Override
    public String toString() {
        return " " + integerArrayList;
    }

    public static void main(String[] args) {
        ArrayIntegerRandom arrayIntegerRandom = new ArrayIntegerRandom();
        arrayIntegerRandom.addInt();
        System.out.println(arrayIntegerRandom);
        arrayIntegerRandom.removeOdd();
        System.out.println(arrayIntegerRandom);
    }
}
