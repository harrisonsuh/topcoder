import java.util.*;

public class StreetParking {
    public int freeParks(String street) {
    	int[] spots = new int[street.length()]; //filled with 0
      Arrays.fill(spots, 1);
      char[] charArray = street.toCharArray();
      for (int i = 0; i < street.length(); i++) {
        char ch = charArray[i];
        if (ch == 'B' || ch == 'S' || ch == 'D') {
          spots[i] = 0;
          if (ch == 'B' || ch == 'S') {
            if (i >= 1) {
              spots[i-1] = 0;
            }
            if (i >= 2 && ch == 'B') {
              spots[i-2] = 0;
            }
            if (ch == 'S' && i < street.length()-1) {
              spots[i+1] =0;
            }
          }
        }
      }
      int count = 0;
      for (int j : spots) {
        if (j == 1) {
          count++;
        }
      }
      return count;
    }
}
