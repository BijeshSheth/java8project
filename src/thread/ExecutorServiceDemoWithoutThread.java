package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;
class DataProcessingTask1 implements Callable<Integer> {
    private final List<Integer> chunk;

    public DataProcessingTask1(List<Integer> chunk) {
        this.chunk = chunk;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int value : chunk) {
            sum += value;
        }
        return sum;
    }
}

public class ExecutorServiceDemoWithoutThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //List<Integer> data = Arrays.asList(1, 2, 3,
        long startTime = System.currentTimeMillis();
        Integer[] arr = IntStream.range(1, 1010).boxed().toArray(Integer[] :: new);
        Collections.shuffle(Arrays.asList(arr));
        List<Integer> data = Arrays.asList(arr);
        //data.forEach(i -> System.out.println(" "+i));

        int finalResult = 0;
        for (int i : data){
            finalResult+=i;
        }

        System.out.println(finalResult);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution Time: " + duration + " ns");
    }
}
