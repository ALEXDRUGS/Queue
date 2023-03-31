package queue;

import example.Example;

import java.util.LinkedList;
import java.util.Random;

public class Queue {
    private static final LinkedList<Client> clientQueue1 = new LinkedList<>();
    private static final LinkedList<Client> clientQueue2 = new LinkedList<>();
    private static final LinkedList<Client> clientQueue3 = new LinkedList<>();
    private static final Random random = new Random();
    private static Integer cassNum;

    public static Integer getCassNum() {
        return cassNum;
    }

    public static void numCass() {
        for (int i = 0; i < 100; i++) {
            int randomCass = random.nextInt(3);
            cassNum = randomCass;
            switch (randomCass) {
                case 0:
                    if (clientQueue1.size() < 5
                            && clientQueue1.size() <= clientQueue2.size()
                            && clientQueue1.size() <= clientQueue3.size()) {
                        clientQueue1.add(new Client(Integer.toString(i)));
                        System.out.println(clientQueue1);
                        if (clientQueue1.size() == 5) {
                            System.out.println("Stop 1 Cass ");
                        }
                    }
                    break;
                case 1:
                    if (clientQueue2.size() < 5
                            && clientQueue2.size() <= clientQueue1.size()
                            && clientQueue2.size() <= clientQueue3.size()) {
                        clientQueue2.add(new Client(Integer.toString(i)));
                        System.out.println(clientQueue2);
                        if (clientQueue2.size() == 5) {
                            System.out.println("Stop 2 Cass ");
                        }
                    }
                    break;
                case 2:
                    if (clientQueue3.size() < 5
                            && clientQueue3.size() <= clientQueue1.size()
                            && clientQueue3.size() <= clientQueue2.size()) {
                        clientQueue3.add(new Client(Integer.toString(i)));
                        System.out.println(clientQueue3);
                        if (clientQueue3.size() == 5) {
                            System.out.println("Stop 3 Cass ");
                        }
                    }
                    break;
            }
        }
        if (clientQueue1.size() == 5 && clientQueue2.size() == 5 && clientQueue3.size() == 5)
            System.out.println(" Hay Galya, open next cass ");
    }

    public static void main(String[] args) {
        numCass();
        Example example = new Example();
        example.example();
    }
}