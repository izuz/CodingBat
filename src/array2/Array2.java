package array2;
/**
 * @author Gonzalo Izuzquiza
 */
public class Array2 {
    //COUNTEVENS
public int countEvens(int[] nums) {
int even = 0;
  for (int count=0; count < nums.length; count++) {
  if (nums[count] % 2 == 0){
  even++;
         }
    }
  return even;
  }

//bigDiff

public int bigDiff (int [] nums){
    int max = nums[0];
    int min = nums[0];
    
    for (int i=0; i < nums.length; i++){
        if (nums [i] > max){
            max = nums[i];
        }
        if (nums [i] <= min){
            min = nums[i];
        }
    }
    return max - min;
}



//centerAdverge

public int centerAdverage (int[] nums){
    int max = nums [0];
    int min = nums [0];
    int sum = 0;
    
    for (int i=0; i< nums.length; i++){
        sum+= nums[i];
        if (nums[i] >max){
            max = nums[i];
        }
        if (nums[i] < min){
            min = nums[i];
        }
    }
    return (sum - (max + min) / (nums.length -2));
}

//sum13

public int sum13 (int [] nums){
    
    int total =0;
    for (int i=0; i<nums.length; i++){
        if(nums [i] !=13){
            total += nums [i];
        }
        else if (i <= nums.length - 1){
            i++;
        }
    }
    return total;
}

//sum67
public int sum67 (int [] nums){
    int sum =0;
    for(int i=0; i<nums.length; i++){
        if (nums[i] !=6){
            sum +=nums[i];
        }
        else{
            while(nums[i] !=7) i++;
    }
    }
    return sum;
}


//has22

public boolean has22 (int [] nums){
    for (int i=0; i<nums.length -2; i++){
        if(nums[i] == 2 && nums [i+1] == 2){
            return true;
        }
    }
    return false;
}

//lucky13

public boolean lucky13 (int [] nums){
    for (int i=0; i< nums.length; i++){
        if(nums[i] == 1 || nums [i] ==3){
            return false;
        }
    }
    return true;
}


//sum28

public boolean sum28 (int [] nums){
    int sum =0;
    for (int i=0; i< nums.length; i++){
        if (nums [i]== 2){
            sum +=2;
        }
    }
    return sum == 8;
}


//more14

public boolean more14 (int[] nums){
    int ones =0;
    int fours =0;
    for (int i =0; i<nums.length; i++){
        if(nums[i] == 1){
            ones++;
        }
        if (nums[i] == 4){
            fours++;
        }
    }
    return ones > fours;
}


//fizzArray

public int[] fizzArray (int n){
    int[] result = new int[n];
    for (int i = 0; i < n; i++){
        result[i] = i;
}
    return result;
}


//only14

public boolean only14(int[] nums) {
  for (int i = 0; i < nums.length; i++){
        if (nums[i] != 1 && nums[i] != 4){
        return false;
        }
  }
    return true;
}

//fizzArray2

public String[] fizzArray2(int n) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++){
        result[i] = String.valueOf(i);
    }
    return result;
    }


//no14

public boolean no14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1){
        ones++;
        }
        if (nums[i] == 4) {
        fours++;
        }
    }
    return ones == 0 || fours == 0;
    }

//isEveryWhere

public boolean isEverywhere(int[] nums, int val) {
    boolean flag1 = true;
    boolean flag2 = true;
 
    for (int i = 0; i < nums.length; i += 2){
        if (nums[i] != val){
        flag1 = false;
        }
    }
    for (int i = 0; i < nums.length - 1; i += 2){
        if (nums[i + 1] != val){
        flag2 = false;
        }
    }
    return flag1 || flag2;
}


//either24

public boolean either24(int[] nums) {
  boolean twos = false;
  boolean fours = false;
 
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 2){
        twos = true;
        }
        if (nums[i] == 4 && nums[i + 1] == 4){
        fours = true;
        }
    }
    return twos ^ fours;
}

//matchUp

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
    for (int i = 0; i < nums1.length; i++){
        if (nums1[i] != nums2[i]
            && Math.abs(nums1[i] - nums2[i]) <= 2){
                count++;
            }
    }
    return count;
}

//has77

public boolean has77(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++){
        if (nums[i] == 7 && nums[i + 1] == 7){
        return true;
        }
  }
    for (int i = 0; i < nums.length - 2; i++){
        if (nums[i] == 7 && nums[i + 2] == 7){
        return true;
        }
    }
    return false;
}


//has12

public boolean has12(int[] nums) {
    boolean encuentra = false;
    for (int i=0; i<nums.length; i++){
    if(nums[i] == 1){
        encuentra = true;
  }
        if(encuentra && nums [i] == 2){
    return true;
  }
}
return false;
}

}
