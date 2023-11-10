import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> log = Arrays.asList("0:start:0", "1:start:3", "1:end:6", "0:end:10");
        int n=2;
        int logn = log.size();
        String last_entry = log.get(logn - 1);
        String[] parts = last_entry.split(":");
        int thirdPart = Integer.parseInt(parts[2]);

        int[] temp = new int[thirdPart + 1];

        for (int i = 0; i < logn-1; i++) {
            
            String[] each_entry = log.get(i).split(":");
            int task_id = Integer.parseInt(each_entry[0]);
            String status = each_entry[1];
            int minp=task_id;
            int timestamp = Integer.parseInt(each_entry[2]);
            int count_ex = timestamp;
               String[] next_entry = log.get(i+1).split(":");
                int next_taskid = Integer.parseInt(next_entry[0]);
                String status_next = next_entry[1];
                int timestamp_next = Integer.parseInt(next_entry[2]);
                int temp_prev = task_id;
                
            while (status.equals("start")&& task_id >= minp && timestamp_next>=count_ex) {
                    temp[count_ex] = task_id;
                    count_ex++;
            }
                
            }
                int[] res = new int[n];
                System.out.println(Arrays.toString(temp));

        for (int i = 0; i <= thirdPart; i++) {
            int digit = temp[i];
            res[digit]++;
        }
        System.out.println(Arrays.toString(res));

    }
}
