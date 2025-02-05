

public class HackerRankProblemNo1 {
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String  maxVowelSubString(String s, int k){
        int maxCount = 0;
        int currentCount = 0;
        int maxStartIndex = -1;


        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }

        maxCount = currentCount;
        maxStartIndex = 0;


        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }

            if (isVowel(s.charAt(i))) {
                currentCount++;
            }


            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxStartIndex = i - k + 1;
            }
        }

        if (maxStartIndex == -1) {
            return "Not found!";
        }


        String result = "";
        for (int i = maxStartIndex; i < maxStartIndex + k; i++) {
            result += s.charAt(i);
        }

        return result;

    }

    public static void main(String[] args) {

        HackerRankProblemNo1 problemNo1=new HackerRankProblemNo1();
        String result=problemNo1.maxVowelSubString("caberqiitefg", 5);
        System.out.println("The result is : "+result);



    }
}
