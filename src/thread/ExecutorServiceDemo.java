package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;
class DataProcessingTask implements Callable<Integer> {
    private final List<Integer> chunk;

    public DataProcessingTask(List<Integer> chunk) {
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

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //List<Integer> data = Arrays.asList(1, 2, 3,
        long startTime = System.currentTimeMillis();
        Integer[] arr = IntStream.range(1, 101).boxed().toArray(Integer[] :: new);
        Collections.shuffle(Arrays.asList(arr));
        List<Integer> data = Arrays.asList(arr);
        //data.forEach(i -> System.out.println(" "+i));

        int threadSize = 10;
        ExecutorService execute = Executors.newFixedThreadPool(threadSize);
        List<Future<Integer>> futures = new ArrayList<>();

        int chunkSize = data.size()/threadSize;

        for (int i = 0; i < threadSize; i++) {
            int start = i * chunkSize;
            int end = (i == threadSize - 1) ? data.size() : (i+1)*chunkSize;
            List<Integer> chunk = data.subList(start, end);
            Callable<Integer> task = new DataProcessingTask(chunk);
            Future<Integer> future = execute.submit(task);
            futures.add(future);
        }

        long finalResult = 0;
        for (Future<Integer> ft : futures){
            finalResult+=ft.get();
        }

        execute.shutdown();
        System.out.println(finalResult);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution Time: " + duration + " ns");
    }
}
