package warmup1;

/**
 * @author Gonzalo Izuzquiza
 */
public class WarmUp1 {
    
    // sleepIn
    
    public boolean sleepIn(boolean weekday, boolean vacation) {
       if (!weekday || vacation) {
                return true;
            }
        return false;
    }
    
    // monkeyTrouble
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }
    
    // sumDouble
    
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum *2;
        }
            return sum;
      }
    
    // dif21
    
    public int diff21(int n) {
     int difference = 21 - n;
     if (n > 21) {
        difference = Math.abs(difference) * 2;
        }
    return difference;
    }
    
    // parrotTrouble
    
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
    
    // makes10
    
    public boolean makes10(int a, int b) {
        int sum = a + b;
        return (sum == 10 || a == 10 || b == 10); 
    }
    
    // nearHundred
    
    public boolean nearHundred(int n) {
        int value1 = 100-n;
        int value2 = 200-n;
        return (Math.abs(value1) <= 10 || Math.abs(value2) <=10);
    }
    
    // posNeg
    
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) {
          return true;
        }
        else if (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) {
          return true;
        }
        return false;
      }
    
    // notString
    
    public String notString(String str) {
        if (str.startsWith("not")) {
          return str;
        }
        return "not " + str;
      }
    
    // missingChar
    
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(n).toString();
      }
    
    // frontBack
    
    public String frontBack(String str) {
        String front;
        String middle;
        String back;

        if (str.length() == 0) {
          return str;
        }
        else if (str.length() == 1) {
          return str;
        }
        else if (str.length() == 2) {
          front = str.substring(0,1);
          back = str.substring(1);

          return back+front;
        }
        front = str.substring(0,1);
        middle = str.substring(1, str.length()-1);
        back = str.substring(str.length()-1);
        return back+middle+front;
      }
    
    // front3
    
    public String front3(String str) {
        String front;

        if (str.length() <=3)
          front = str;
        else {
          front = str.substring(0,3);
        }
        return front+front+front;
      }
    
    // backAround
    
    public String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
      }
    
    // or35
    
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0)
        return true;
        return false;
      }
    
    // front22
    
    public String front22(String str) {
        if (str.length() < 2) {
          return str+str+str;
        }

        String front = str.substring(0,2);
        return front+str+front;
      }
    
    // startHi
    
    public boolean startHi(String str) {
        if (str.length() < 2)
          return false;

        String start = str.substring(0,2);
        return start.equals("hi");
      }
    
    // icyHot
    
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
      }
    
    // in1020
    
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >=10 && b <=20));
      }
    
    // hasTeen
    
    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || 
                (b >= 13 && b <= 19) || 
                (c >= 13 && c <= 19));
      }
    
    // loneTeen
    
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <=19)) {
          return false;
        }
        return ((a >= 13 && a <= 19) || (b >= 13 && b <=19));
      }
    
    // delDel
    
    public String delDel(String str) {
        if (str.length() <= 3)
          return str;

        if(str.substring(1,4).equals("del")) {
          StringBuilder sb = new StringBuilder(str);
          sb.replace(1,4,"");

          return sb.toString();
        }
        return str;
      }
    
    // mixStart
    
    public boolean mixStart(String str) {
        if (str.length() < 3) 
          return false;
        return str.substring(1,3).equals("ix");
      }
    
    // startOz
    
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
          result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
          result = result + str.charAt(1);
        }
        return result;
      }
    
    // intMax
    
    public int intMax(int a, int b, int c) {
        int max = 0;

        if (a > b){
          max = a;
        }
          else{
          max = b;
                  }
        if (c > max){
          max = c;
                  }
        return max;
      }
    
    // close10
    
    public int close10(int a, int b) {
        int value1 = Math.abs(10-a);
        int value2 = Math.abs(10-b);
        if (value1 < value2){
          return a;
        }
        else {
            if(value2 < value1){
          return b;
            }
        }
        return 0;
      }
    
    // in3050
    
    public boolean in3050(int a, int b) {
        return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
                ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
      }
    
    // max1020
    
    public int max1020(int a, int b) {
        if (b > a) {
          int temp = a;
          a = b;
          b = temp;
        }
        if (a >= 10 && a <= 20){ 
            return a;
        }
        if (b >= 10 && b <= 20){
            return b;
        }
        return 0;
      }
    
    // stringE
    
    public boolean stringE(String str) {
        int j = 0;
        for (int i=0; i < str.length(); i++) {
          if (str.substring(i,i+1).equals("e")) 
            j++;
        }
        return (j >= 1 && j <= 3);
      }
    
    // lastDigit
    
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
      }
    
    // endUp
    
    public String endUp(String str) {
        int beginUpper = str.length()-3;
        int length = str.length();

        if (str.length() < 3){
          return str.toUpperCase();
        }
        String upper = str.substring(beginUpper, length).toUpperCase();
        return str.substring(0, beginUpper) + upper;
      }
    
    // everyNth
    
    public String everyNth(String str, int n) {
        int length = str.length();
        String nth = "";
        int i = 0;
        while (i < length) {
          nth = nth + str.substring(i, i+1);
          i=i+n;
        }
        return nth;
      }
    
}
