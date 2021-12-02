import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//https://www.hackerrank.com/challenges/dynamic-array/problem
    public class DynamicArray {
        /*
         * Complete the 'dynamicArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */

        static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
            List<List<Integer>> arr = new ArrayList<>(n);
            for(int i =0; i < n; i++){
                arr.add(i, new ArrayList<>());
            }

            int idx, x, y;
            int lastAnswer = 0;
            List<Integer> answers = new ArrayList<>();
            for(List<Integer> line: queries){
                x = line.get(1);
                y = line.get(2);
                idx = (x^lastAnswer) % n;
                if (line.get(0) == 1) {
                        arr.get(idx).add(y);
                } else {
                    lastAnswer = arr.get(idx).get( y % arr.get(idx).size());
                    answers.add(lastAnswer);
                }
            }
            return answers;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\viktor.chmel\\workspace\\CodingInterview\\AlgorithmTasks\\DynamicArray.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\viktor.chmel\\workspace\\CodingInterview\\AlgorithmTasks\\DynamicArray_out.txt"));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int q = Integer.parseInt(firstMultipleInput[1]);

            List<List<Integer>> queries = new ArrayList<>();

            IntStream.range(0, q).forEach(i -> {
                try {
                    queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            List<Integer> result = dynamicArray(n, queries);

            bufferedWriter.write(
                result.stream()
                    .map(Object::toString)
                    .collect(joining("\n"))
                    + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
