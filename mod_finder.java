import java.util.Scanner;

public class mod_finder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        System.out.println("Using rules a is congruent to b (% m) if m|(a-b)");
        // System.out.println("Do you want to find a, b, or m?");
        // String x = scan.nextLine();

        // if (x.equals("a")) {
        //new code
        System.out.println("Currently only can find a");
        //normal code
        System.out.println("Input b.");
        String b = scan.nextLine();
        System.out.println("Input m.");
        String m = scan.nextLine();
        System.out.println("Finding a for equation a is congruent to " + b + " (% " + m + ").");
        ans = findA(b, m);
        System.out.println("a is equal to " + ans);
        System.out.println(ans + " is congruent to " + b + " (% " + m + ").");
        // }
        return;

    }

    private static int findA(String b, String m) {
        int found = 0;
        int int_m = Integer.parseInt(m);
        int int_b = Integer.parseInt(b);
        int i = 0;
        int j = 0;
        while(found == 0) {
            if ((i - int_b)%int_m == 0) {
                found = 1;
                return i;
            }
            j = i*-1;
            if ((j - int_b)%int_m == 0) {
                found = 1;
                return j;
            }
            i++;
        }
        return -1;
    }
}