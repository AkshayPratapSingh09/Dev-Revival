public class Reverse_Number {
    public static void main(String[] args) {
        int num = 1234;
        // System.out.println(num%7);
        System.out.println(reveNum(num, 0));

    }

    static int reveNum(int num, int ans) {
        if (num == 0) {
            return ans;
        }
        return reveNum(num / 10, ans * 10 + num % 10);
    }
}
