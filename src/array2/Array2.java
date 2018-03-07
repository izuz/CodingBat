package array2;
/**
 * @author Gonzalo Izuzquiza
 */
public class Array2 {
    //COUNTEVENS
//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
////countEvens([1, 3, 5]) → 0

public int countEvens(int[] nums) {
int even = 0;
  for (int count=0; count < nums.length; count++) {
  if (nums[count] % 2 == 0){
  even++;
  }
  }
  return even;
  }

//Given an array length 1 or more of ints, return the difference between the largest
//and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or 
//larger of two values.
//bigDiff([10, 3, 5, 6]) → 7
//bigDiff([7, 2, 10, 9]) → 8
//bigDiff([2, 10, 7, 2]) → 8

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



//Return the "centered" 
//average of an array of ints, which we'll say is the mean average of the values, 
//except ignoring the largest and smallest values in the array.
//If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. 
//Use int division to produce the final average. You may assume that the array is length 3 or more.
//
//centeredAverage([1, 2, 3, 4, 100]) → 3
//centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

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

//Return the sum of the numbers in the array, returning 0 for an empty array. 
//Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//sum13([1, 2, 2, 1]) → 6
//sum13([1, 1]) → 2
//sum13([1, 2, 2, 1, 13]) → 6

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

//Return the sum of the numbers in the array, except ignore sections of numbers 
//starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
//Return 0 for no numbers.
//
//sum67([1, 2, 2]) → 5
//sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//sum67([1, 1, 6, 7, 2]) → 4

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


//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//
//
//has22([1, 2, 2]) → true
//has22([1, 2, 1, 2]) → false
//has22([2, 1, 2]) → false

public boolean has22 (int [] nums){
    for (int i=0; i<nums.length -2; i++){
        if(nums[i] == 2 && nums [i+1] == 2){
            return true;
        }
    }
    return false;
}

//Given an array of ints, return true if the array contains no 1's and no 3's.
//
//
//lucky13([0, 2, 4]) → true
//lucky13([1, 2, 3]) → false
//lucky13([1, 2, 4]) → false

public boolean lucky13 (int [] nums){
    for (int i=0; i< nums.length; i++){
        if(nums[i] == 1 || nums [i] ==3){
            return false;
        }
    }
    return true;
}


//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//
//
//sum28([2, 3, 2, 2, 4, 2]) → true
//sum28([2, 3, 2, 2, 4, 2, 2]) → false
//sum28([1, 2, 3, 4]) → false

public boolean sum28 (int [] nums){
    int sum =0;
    for (int i=0; i< nums.length; i++){
        if (nums [i]== 2){
            sum +=2;
        }
    }
    return sum == 8;
}


//Given an array of ints, return true if the number of 1's is greater than the number of 4's
//
//
//more14([1, 4, 1]) → true
//more14([1, 4, 1, 4]) → false
//more14([1, 1]) → true

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


//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
//The given n may be 0, in which case just return a length 0 array. 
//You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. 
//The syntax to make a new int array is: new int[desired_length]  
//
//fizzArray(4) → [0, 1, 2, 3]
//fizzArray(1) → [0]
//fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

public int[] fizzArray (int n){
    int[] result = new int[n];
    for (int i = 0; i < n; i++){
        result[i] = i;
}
    return result;
}


//Given an array of ints, return true if every element is a 1 or a 4.
//
//
//only14([1, 4, 1, 4]) → true
//only14([1, 4, 2, 4]) → false
//only14([1, 1]) → true

public boolean only14(int[] nums) {
  for (int i = 0; i < nums.length; i++){
        if (nums[i] != 1 && nums[i] != 4){
        return false;
        }
  }
    return true;
}

//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. 
//N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
//The syntax to make a new string array is: new String[desired_length]
//
//fizzArray2(4) → ["0", "1", "2", "3"]
//fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//fizzArray2(2) → ["0", "1"]

public String[] fizzArray2(int n) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++){
        result[i] = String.valueOf(i);
    }
    return result;
    }


//Given an array of ints, return true if it contains no 1's or it contains no 4's.
//
//no14([1, 2, 3]) → true
//no14([1, 2, 3, 4]) → false
//no14([2, 3, 4]) → true

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

//We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
//at least one of the pair is that value. Return true if the given value is everywhere in the array.
//
//isEverywhere([1, 2, 1, 3], 1) → true
//isEverywhere([1, 2, 1, 3], 2) → false
//isEverywhere([1, 2, 1, 3, 4], 1) → false

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


//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
//
//either24([1, 2, 2]) → true
//either24([4, 4, 1]) → true
//either24([4, 4, 1, 2, 2]) → false

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

//Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). 
//Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
//
//matchUp([1, 2, 3], [2, 3, 10]) → 2
//matchUp([1, 2, 3], [2, 3, 5]) → 3
//matchUp([1, 2, 3], [2, 3, 3]) → 2

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

//Given an array of ints, return true if the array contains two 7's next to each other, 
//or there are two 7's separated by one element, such as with {7, 1, 7}.
//
//has77([1, 7, 7]) → true
//has77([1, 7, 1, 7]) → true
//has77([1, 7, 1, 1, 7]) → false

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


//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
//
//has12([1, 3, 2]) → true
//has12([3, 1, 2]) → true
//has12([3, 1, 4, 5, 2]) → true

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
