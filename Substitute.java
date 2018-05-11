public class Substitute {
  public int getValue(String key, String code) {
    String answer = "";
    char[] keyArray = key.toCharArray();
    for (char ch: code.toCharArray()) {
      for (int i = 0; i < keyArray.length; i++) {
        if (ch == keyArray[i]) {
          if (i==9) {
            answer+="0";
          } else {
            answer += i+1;
          }
        }
      }
    }
    return Integer.parseInt(answer);
  }
}
