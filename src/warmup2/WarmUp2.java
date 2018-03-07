package warmup2;
/**
 * @author Gonzalo Izuzquiza
 */
public class WarmUp2 {
    
    // stringTimes
    
    public String stringTimes(String str, int n) {
            String result = "";
            for (int i = 0; i < n; i++){
                result += str;
            }
            return result;
        }
    
    // frontTimes
    
    public String frontTimes(String str, int n) {
            String result = "";
            if (str.length() <= 3){
                for (int i = 0; i < n; i++){
                    result += str;
                }
            }
            else{
                for (int i = 0; i < n; i++){
                    result += str.substring(0, 3);
                }
            }
            return result;
    }

    // countXX
    
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i, i + 2).equals("xx")){
                count++;
            }
        }
        return count;
    }
    
    // doubleX
    
    boolean doubleX(String str) {
        int firstX = str.indexOf('x');
        if (firstX < str.length() - 1){
            return str.charAt(firstX + 1) == 'x';
        }
        return false;
    }
    
    // stringBits
    
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0){
                result += str.charAt(i);
            }
        }
        return result;
    }
    
    // stringSplosion
    
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }
    
    // last2
    
    public int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))){
                    count++;
            }
        }
        return count;
    }
    
    // arrayCount9
    
    public int arrayCount9(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9){
                result++;
            }
        }
        return result;
    }
    
    // arrayFront9
    
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4){
           end = 4;
        }
        for (int i=0; i<end; i++) {
          if (nums[i] == 9) return true;
        }
        return false;
      }
    
    // array123
    
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
          if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
              return true;
          }
        }
        return false;
      }
    
    // stringMatch
    
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
          String aSub = a.substring(i, i+2);
          String bSub = b.substring(i, i+2);
          if (aSub.equals(bSub)) {  
            count++;
          }
        }
        return count;
      }
    
    // stringX
    
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
          if(!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))){
            result = result + str.substring(i, i+1);
          }
        }
        return result;
      }
    
    // altPairs

    public String altPairs(String str) {
        String result = "";
        for (int i=0; i<str.length(); i += 4) {
          int end = i + 2;
          if (end > str.length()) {
            end = str.length();
          }
          result = result + str.substring(i, end);
        }
        return result;
      }
    
    // stringYak
    
    public String stringYak(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
          if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
            i =  i + 2;
          } 
          else {
            result = result + str.charAt(i);
          }
        }
        return result;
      }
    
    // array667
    
    public int array667(int[] nums) {
        int count = 0;
        for (int i=0; i < (nums.length-1); i++) {
          if (nums[i] == 6) {
            if (nums[i+1] == 6 || nums[i+1] == 7) {
              count++;
            }
          }
        }
        return count;
      }
    
    // noTriples
    
    public boolean noTriples(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
          int first = nums[i];
          if (nums[i+1]==first && nums[i+2]==first){
            return false;
          } 
        }
        return true;
      }
    
    // has271
    
    public boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
          int val = nums[i];
          if (nums[i+1] == (val+5) && Math.abs(nums[i+2] - (val-1)) <= 2){
              return true;
          }
        }
        return false;
      }
    
}
