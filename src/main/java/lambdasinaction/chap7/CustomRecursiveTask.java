package lambdasinaction.chap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/*For tasks that return a value, the logic here is similar, except that resulting for each subtask is united in a single result:
 * https://www.baeldung.com/java-fork-join
 * */
public class CustomRecursiveTask extends RecursiveTask<Integer> {
    private int[] arr;
    private static final int THRESHOLD = 20;

    public CustomRecursiveTask(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected Integer compute() {
        if (arr.length > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
//            return processing1(arr);
            return processing2(arr);
        }
    }

    private Collection<CustomRecursiveTask> createSubtasks() {
        List<CustomRecursiveTask> dividedTasks = new ArrayList<>();

        dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, 0, arr.length / 2)));
        dividedTasks.add(new CustomRecursiveTask(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));

        return dividedTasks;
    }

    private Integer processing1(int[] arr) {
        return Arrays.stream(arr)
                .filter(a -> a > 10 && a < 27)
                .map(a -> a * 10)
                .sum();
    }

    private Integer processing2(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
