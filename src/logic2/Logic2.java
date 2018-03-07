package logic2;
/**
 * @author Gonzalo Izuzquiza
 */
public class Logic2 {
    
    // makeBricks
    
    public boolean makeBricks(int small, int big, int goal) {
        return goal - big * 5 <= small
            && goal % 5 <= small;
        }
    
    // loneSum
    
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c){
        return 0;
        }
        if (a == b){
        return c;
        }
        if (a == c){
        return b;
        }
        if (b == c){
        return a;
        }
        return a + b + c;
    }
    
    // luckySum
    
    public int luckySum(int a, int b, int c) {
        if (a == 13){ 
          return 0;
        }
        if (b == 13){
          return a;
        }
        if (c == 13){
          return a + b;
        }
        return a + b + c;
    }
    
    // noTeenSum
    
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public int fixTeen(int n) {
        return (n >= 13 && n < 15 || n > 16 && n <= 19) ? 0 : n;
    }
    
    // roundSum
    
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int num) {
        return (num % 10 < 5) ? (num / 10 * 10) : (num / 10 * 10 + 10);
    }
    
    // closeFar
    
    public boolean closeFar(int a, int b, int c) {
    if (Math.abs(b - c) < 2){
        return false;
    }
    return Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 || Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2;
    }
    
    // blackJack
    
      public int blackjack(int a, int b) {
        if (a > 21 && b > 21){
            return 0;
        }
        if (a > 21 && b <= 21){
            return b;
        }
        if (a <= 21 && b > 21){
            return a;
        }
        return Math.max(a, b);
    }

      // evenlySpaced
      
      public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        return Math.abs(mid - min) == Math.abs(mid - max) || Math.abs(mid2 - min) == Math.abs(mid2 - max); 
    }
      
      // makeChocolate
      
      public int makeChocolate(int small, int big, int goal) {
            int maxBig = goal / 5;
                if (big > maxBig){
                return (goal <= 5 * maxBig + small) ? (goal - 5 * maxBig) : -1;
                }
            return (goal <= 5 * big + small) ? (goal - 5 * big) : -1;
        }
      
}
