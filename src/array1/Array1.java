package array1;
/**
 * @author Gonzalo Izuzquiza
 */

public class Array1 {
    
    //1 ///////////////////////////////////////////////
    public int[] makeMiddle(int[] nums) {
    int[] result = { nums[nums.length / 2 - 1], nums[nums.length / 2] };
    return result;

}   //2 //////////////////////////////////////////////
    public boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];

}   //3 ///////////////////////////////////////////////
    public int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];

}   //4 ///////////////////////////////////////////////
    public int[] rotateLeft3(int[] nums) {
    int[] rLeft = { nums[1], nums[2], nums[0] };
    return rLeft;
}
    //5 ///////////////////////////////////////////////
    public int[] reverse3(int[] nums) {
    int[] newOrder = { nums[2], nums[1], nums[0] };
    return newOrder;
}
    //6 ///////////////////////////////////////////////
    public int[] maxEnd3(int[] nums) {
    if (nums[2] > nums[0]) {
        nums[0] = nums[2];
        nums[1] = nums[2];
    } else {
        nums[1] = nums[0];
        nums[2] = nums[0];
    }
    return nums;
}
    //7 ///////////////////////////////////////////////
    public int sum2(int[] nums) {
  
    if (nums.length == 0)
        return 0;
    if (nums.length == 1)
        return nums[0];
    return nums[0] + nums[1];
}
    public int[] middleWay(int[] a, int[] b) {
    int[] c = { a[1], b[1] };
    return c;
}
    //8 ///////////////////////////////////////////////
    public int[] makeEnds(int[] nums) {
     int[] result = { nums[0], nums[nums.length - 1] };
        return result;

}
    //9 ///////////////////////////////////////////////
    public boolean has23(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2 || nums[i] == 3)
            return true;
    }
    return false;
}
    //10 ///////////////////////////////////////////////
    public boolean no23(int[] nums) {
   for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2 || nums[i] == 3)
            return false;
    }
    return true;
}
   //11 ///////////////////////////////////////////////
    public int[] makeLast(int[] nums) {
   int[] result = new int[2 * nums.length];
    result[result.length - 1] = nums[nums.length - 1];
    return result;
}
     //12 ///////////////////////////////////////////////
    public boolean double23(int[] nums) {
    int twoCount = 0;
    int threeCount = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 2)
            twoCount++;
        if (nums[i] == 3)
            threeCount++;
    }
    return twoCount == 2 || threeCount == 2;
}
     //13 ///////////////////////////////////////////////

    public int[] fix23(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 3)
            nums[i + 1] = 0;
    }
    return nums;
}
     //14 ///////////////////////////////////////////////
    public int start1(int[] a, int[] b) {
    int count = 0;
    if (a.length > 0 && a[0] == 1)
        count++;
    if (b.length > 0 && b[0] == 1)
        count++;
    return count;
}
    //15 ///////////////////////////////////////////////
    public int[] biggerTwo(int[] a, int[] b) {
   if (a[0] + a[1] < b[0] + b[1])
        return b;
    return a;

    }
    
}
