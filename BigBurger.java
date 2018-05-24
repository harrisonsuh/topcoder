public class BigBurger {
  public int maxWait(int[] arrival, int[] service) {
    int longestWait = 0;
    int currMin = 0;
    for (int i = 0; i < arrival.length; i++) {
      int wait = currMin - arrival[i];
      if (wait > longestWait) {
        longestWait = wait;
      }
      if (arrival[i] > currMin) {
        currMin = arrival[i];
      }
      currMin += service[i];
    }
    return longestWait;
  }
}
