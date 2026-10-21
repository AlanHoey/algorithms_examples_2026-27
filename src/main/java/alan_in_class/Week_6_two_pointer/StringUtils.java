package alan_in_class.Week_6_two_pointer;

public class StringUtils {

    public static String longestSection(String text){
        if(text == null){
            return
        }

        int start = 0;
        int end = 1;

        int longestString = 0;
        int longestStartPos = 0;
        int longestEndPos = 0;

        while(end < text.length()){
            for (int i = start; i < end; i++) {
                if(text.charAt(end) == text.charAt(start)){
                    int (currentLength) = end - start;
                    if(currentLength > longestSubstring){
                        longestStartPos = start;
                        longestEndPos = end;
                        longestEndPosSubstring = currentLength;
                    }
                    start = i + 1;

                    break;
            }
        }
        end++;
    }
}
