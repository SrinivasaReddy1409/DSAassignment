import java.util.*;
    public class dsa10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            System.out.println("Enter total number of integers: ");
            int n = in.nextInt();
            System.out.println("Enter size of sub array: ");
            int m = in.nextInt();
            int max = Integer.MIN_VALUE;
            System.out.println("Enter "+n+" integers:");
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > max)
                    max = set.size();

                int first = (int) deque.remove();
                if (!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(max);
            }
        }
