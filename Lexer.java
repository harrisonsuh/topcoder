import java.util.*;

public class Lexer {
  public String[] tokenize(String[] tokens, String input) {
    int consumedSize = 0;
    int largestToken = 0;
    HashSet<String> tokenSet = new HashSet<String>();
    ArrayList<String> consumedList = new ArrayList<String>();
    for (String st: tokens) {
      if (st.length() > largestToken) {
        largestToken = st.length();
      }
      tokenSet.add(st);
    }
    while (input.length() > 0) {
      boolean foundOne = false;
      String stringToAdd = "";
      int longest = 0;
      for (String s: tokenSet) {
        int length = s.length();
        String checkString = input.substring(0, length);
        if (checkString.equals(s)) {
          if (length == largestToken) {
            consumedList.add(checkString);
            input = input.substring(length);
            break;
          }
          if (length > longest) {
            longest = length;
            stringToAdd = checkString;
          }
        }
      }
      if (longest != 0) { //found a match
        consumedList.add(stringToAdd);
        input = input.substring(longest);
      } else { //no match
        input = input.substring(1);
      }
    }
    return consumedList.toArray(new String[consumedList.size()]);
  }
}
