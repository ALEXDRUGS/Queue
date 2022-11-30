import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private static final Set<TaskEnum> TASK_LIST = new HashSet<>();
    private enum TaskEnum{
        TASK_ENUM1{public String i(){return "2 * 2 \n";}},
        TASK_ENUM2{public String i(){return "2 * 3 \n";}},
        TASK_ENUM3{public String i(){return "2 * 4 \n";}},
        TASK_ENUM4{public String i(){return "2 * 5 \n";}},
        TASK_ENUM5{public String i(){return "2 * 6 \n";}},
        TASK_ENUM6{public String i(){return "2 * 7 \n";}},
        TASK_ENUM7{public String i(){return "2 * 8 \n";}},
        TASK_ENUM8{public String i(){return "2 * 9 \n";}},
        TASK_ENUM9{public String i(){return "3 * 3 \n";}},
        TASK_ENUM10{public String i(){return "3 * 4 \n";}},
        TASK_ENUM11{public String i(){return "3 * 5 \n";}},
        TASK_ENUM12{public String i(){return "3 * 6 \n";}},
        TASK_ENUM13{public String i(){return "3 * 7 \n";}},
        TASK_ENUM14{public String i(){return "3 * 8 \n";}},
        TASK_ENUM15{public String i(){return "3 * 9 \n";}};

        public String i() {
            return TaskEnum.TASK_ENUM1.i();
        }
    }

    public static void add() {
        TASK_LIST.add(TaskEnum.TASK_ENUM1);
        TASK_LIST.add(TaskEnum.TASK_ENUM2);
        TASK_LIST.add(TaskEnum.TASK_ENUM3);
        TASK_LIST.add(TaskEnum.TASK_ENUM4);
        TASK_LIST.add(TaskEnum.TASK_ENUM5);
        TASK_LIST.add(TaskEnum.TASK_ENUM6);
        TASK_LIST.add(TaskEnum.TASK_ENUM7);
        TASK_LIST.add(TaskEnum.TASK_ENUM8);
        TASK_LIST.add(TaskEnum.TASK_ENUM9);
        TASK_LIST.add(TaskEnum.TASK_ENUM10);
        TASK_LIST.add(TaskEnum.TASK_ENUM11);
        TASK_LIST.add(TaskEnum.TASK_ENUM12);
        TASK_LIST.add(TaskEnum.TASK_ENUM13);
        TASK_LIST.add(TaskEnum.TASK_ENUM14);
        TASK_LIST.add(TaskEnum.TASK_ENUM15);
    }

    public String[] taskString() {
        String[] taskArr = new String[TASK_LIST.size()];
        int i = 0;
        for (TaskEnum taskEnum : TASK_LIST) {
            taskArr[i] = taskEnum.i();
            i++;
        }
        return taskArr;
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        add();
        System.out.println(Arrays.toString(taskList.taskString()));
    }
}
