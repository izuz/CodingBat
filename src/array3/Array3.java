package array3;
/**
 * @author Gonzalo Izuzuquiza
 */
public class Array3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    // maxSpan
    
    public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > maxSpan) maxSpan = count;
                    break;
                }
        return maxSpan;
    } else return 0;
}
    
    // fix34
    
    public int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 3) {
            int temp = nums[i + 1];
            nums[i + 1] = 4;
            for (int j = i + 2; j < nums.length; j++)
                if (nums[j] == 4) nums[j] = temp;
        }
    return nums;
}
    //fix45
    
    public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 5 && i == 0
            || nums[i] == 5 && nums[i - 1] != 4) {
            int pos5 = i;
            for (int j = 0; j < nums.length; j++)
                if (nums[j] == 4 && nums[j + 1] != 5) {
                    int temp = nums[j + 1];
                    nums[j + 1] = 5;
                    nums[pos5] = temp;
                    break;
                }
    }
    return nums;
}
    // canBalance
    
    public boolean canBalance(int[] nums) {
    for (int i = 0; i < nums.length; i++) { 
        int sum = 0;
        for (int j = 0; j < i; j++) sum += nums[j];
        for (int j = i; j < nums.length; j++) sum -= nums[j];
        if (sum == 0) return true;
    }
    return false;
}
    // linearIn
    
    public boolean linearIn(int[] outer, int[] inner) {
    int indexInner = 0;
    int indexOuter = 0;
    while (indexInner < inner.length && indexOuter < outer.length) {
        if (outer[indexOuter] == inner[indexInner]) {
            indexOuter++;
            indexInner++;
        } else indexOuter++;
    }
    return (indexInner == inner.length);
}
    // squareUp
    
    public int[] squareUp(int n) {
  int[] result = new int[n * n];
  int x = n-1, pass = 1, index = 0;
  if(n == 0) { return result; }
  for(int i = n-1; i < result.length; i+=n) {
     //I is the beginning of the current block
     index = i;
     for(int k = 1; k <= pass; k++) {
       if(k == 0) { break; }
       result[index] = k;
       index--;
     }
     pass++;
  }
  return result;
}
    // seriesUp
    
    public int[] seriesUp(int n) {
  int[] result = new int[(int)((((n*n) + n)) / 2)];
  int j = 0;
  for(int i = 0; i <= n; i++) {
     for(int k = 1; k < (i + 1); k++) {
        result[j] = k;
        j++;
     }
  }
  return result;
}
    // maxMirror
    
public int maxMirror(int[] nums) {
  int len = nums.length;
  int count= 0;
  int max = 0;
  for (int i = 0; i < len; i++){
    count=0;
    for (int j = len-1; i + count < len && j > -1; j--){
      if(nums[i+count] == nums[j]){
        count++;
      }
      else{
        if (count > 0){
          max = Math.max(count,max);
          count = 0;
        }
      }
    }
    max = Math.max(count,max);
  }
  return max;
}

// countClumps

public int countClumps(int[] nums) {
  int current = -1, clump = 0;
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == nums[i + 1] && nums[i] != current) {
       current = nums[i];
       clump++;
    } else {
       if(nums[i] != current) {
          current = -1;
       }
    }
  }
  return clump;
}
}
