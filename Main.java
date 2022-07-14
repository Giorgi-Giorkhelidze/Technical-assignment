import java.util.HashMap;
import java.util.Map;

public class Main {
    // პირველი დავალება
    static boolean isPalindrome(String text) {
        boolean answer = false;
        char[] Text = text.toCharArray();

        int quantity = text.length();

        for (int i = 0; i < quantity; i++) {
            if (Text[i] == Text[quantity - (i + 1)])
                answer = true;
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }

    //მეორე დავალება
    static int minSplit(int amount) {
        int c50 = amount / 50;
        int c20 = (amount % 50) / 20;
        int c10 = ((amount % 50) % 20) / 10;
        int c5 = (((amount % 50) % 20) % 10) / 5;
        int c1 = ((((amount % 50) % 20) % 10) % 5);

        return c50 + c20 + c10 + c5 + c1;
    }

    //მესამე დავალება
    static int notContains(int[] array) {
        int num = 1;

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                map.put(array[i], "");
        }
        while (map.containsKey(num)) {
            num++;
        }

        return num;
    }

    //მეოთხე დავალება
    static boolean isProperly(String sequence) {
        char[] Sequence = sequence.toCharArray();
        int brackets = 0;

        for (char c : Sequence) {
            if (c == '(')
                brackets += 1;
            if (c == ')')
                brackets -= 1;
            if (brackets < 0) {
                return false;
            }
        }

        return brackets == 0;
    }

    //მეხუთე დავალება
    static int countVariants(int stairCount) {
        if (stairCount<=0)
            return 0;
        return (int) ((Math.pow(1 + Math.sqrt(5), stairCount+1) - Math.pow(1 - Math.sqrt(5), stairCount+1))
                / (Math.pow(2, stairCount+1) * Math.sqrt(5)));
    }




    public static void main(String[] args) {

//        String x="ai ia";
//        boolean b= isPalindrome(x);
//        System.out.println(b);

//        int a=161;
//        int c=minSplit(a);
//        System.out.println(c);
//
//        int[] arr={   -1, 2, 1, 1, 2, 2, 3, 3, 6, 5, 4, 78, 4};
//        int min=notContains(arr);
//        System.out.println(min);
//
//        String sequence="(()())()";
//        boolean isGood=isProperly(sequence);
//        System.out.println(isGood);

//        int stearscount=countVariants(10);
//        System.out.println(stearscount);


        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
