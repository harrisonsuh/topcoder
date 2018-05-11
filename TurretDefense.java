public class TurretDefense {
    public int firstMiss(int[] xs, int[] ys, int[] times) {
    	for (int i = 0; i < xs.length; i++) {
            if (i == 0) {
            	if (xs[i] + ys[i] > times[i]) {
                    return i;
                }
            } else if (Math.abs(xs[i]-xs[i-1]) + Math.abs(xs[i]-ys[i-1]) > Math.abs(times[i]-times[i-1])) {
                return i;
            }
   		}
        return -1;
    }
}
