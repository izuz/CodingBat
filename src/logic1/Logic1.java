package logic1;
/**
 * @author Gonzalo Izuzquiza
 */
public class Logic1 {
        
    // cigarParty H
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <=60 ){
            return true;
        }
        if (isWeekend == true && cigars >= 40){
            return true;
        }
        else{
         return false;
        }
    }

    // dateFashion H
    
    public int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2){
            return 0;
        }
        if(you >= 9 || date >= 8){
            return 2;
        }
        else{
            return 1;
        }
      }
    
    //   squierrelPlay
    
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90){
         return true;
        }
        if (temp >= 60 && temp <= 100 && isSummer == true){
         return true;
        }
        else{
         return false;
      }
    }

    //  caughtSpeeding
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed > 65 && speed <= 85 && isBirthday == true){
         return 1;
        }
        if (speed >= 86 && isBirthday == true){
         return 2;
         }
        if (speed <= 65 && isBirthday == true){
         return 0;
        }
        if (speed > 60 && speed <= 80){
         return 1;
         }
        if (speed >= 81){
         return 2;
        }
        else{
         return 0;
        }
      }
    
    // sortaSum
    
    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19){
         return 20;
         }
        else{ 
        return (a + b);
        }
      }

    // alarmClock
    
    public String alarmClock(int day, boolean vacation) {
        if (vacation == true && (day == 0 || day == 6)){
         return "off";
            }
        if (vacation == true && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)){
         return "10:00";
            }
        if (vacation == false && (day == 0 || day == 6)){
         return "10:00";
            }
        else {
        return "7:00";
            }
      }
    
    // love6
    
    public boolean love6(int a, int b) {
      if (a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(a + b) == 6){
        return true;
        }
      else{
        return false;
        } 
      }
    
    // in1To10
    
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == false && n >= 1 && n <= 10){
         return true;
            }
        if (outsideMode == true && (n <= 1 || n >= 10)){
         return true;
            }
        else{
        return false;
            }
      }
    
    // specialEleven
    
    public boolean specialEleven(int n) {
         return (n % 11) == 0 || (n % 11) == 1;
      }

    // more20
    
    public boolean more20(int n) {
        return (n % 20) == 1 || (n % 20) == 2;
    }

    // old35
    
    public boolean old35(int n) {
        return (n % 3) == 0 ^ (n % 5) == 0;
    }

    // less20
    
    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    // nearTen
    
    public boolean nearTen(int num) {
        if (num % 10 <= 2){
         return true;
          }
        if (num % 10 >= 8 && num % 10 <= 10){
         return true;
          }
        else{
        return false;
        }
      }
    
    // teensum
    
    public int teenSum(int a, int b) {
        if (a == 13 || a == 14 || a == 15 || a == 16 || a == 17 || a == 18 || a == 19 || b ==13 || b == 14 || b == 15 || b == 16 || b == 17 || b == 18 || b == 19){
         return 19;
        }
        else {
        return (a + b);
        }
      }
    
    // answerCell
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep){
          return false;
        }
        if ((isMorning && isMom) || !isMorning){
          return true;
        }
        else{
          return false;
        } 
      }

    // teaParty
    
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
         return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2){
         return 2;
        }
        if (tea >= 5 && candy >= 5){
         return 1;
        }
          else {
          return 0;
          }
      }
    
    // fizzString H
    
    public String fizzString(String str) {
        boolean fizz = str.charAt(0) == 'f';
        boolean buzz = str.charAt(str.length() - 1) == 'b';

        if (fizz && buzz){
        return "FizzBuzz";
         }
        if (fizz){
        return "Fizz";
        }
        if (buzz){
        return "Buzz";
        }
        return str;
        }
    
    // fizzString2
    
    public String fizzString2(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz){ 
        return "FizzBuzz!";
        }
        if (fizz) {
        return "Fizz!";
        }
        if (buzz) {
        return "Buzz!";
        }
        return n + "!";
      }
    
    // twoAsOne
    
    public boolean twoAsOne(int a, int b, int c) {
    if (a + b == c || a + c == b || b + c == a){
     return true;
    }
    else {
    return false;
    }
  }
    
    // inOrder
    
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk == true && c > b){
         return true;
        }
        if (b > a && c > b) {
         return true;
        }
        else {
        return false;
        }
      }
    
    // inOrderEquals
    
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk == true && a <= b && b <= c){
         return true;
      }
        if (b > a && c > b){
         return true;
      }
        else{
         return false;
        }
      }
    
    // lastDigit
    
    public boolean lastDigit(int a, int b, int c) {
     if (a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10){
         return true;
        }
        else{
        return false;
        }
      }
    
    // lessBy10
    
    public boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10 || (Math.abs(c - b) >= 10) || (Math.abs(a - c) >= 10)){
         return true;
      }
        else{ 
        return false;
        }
      }
    
    // withoutDoubles
    
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 != die2){
         return (die1 + die2);
        }
        if (noDoubles == true && die1 != 6 && die2 != 6){
         return (die1 + die2 + 1 );
        }
        if (noDoubles == false){
         return (die1 + die2);
        }
        else{
         return (die1 + 1);
        }
      }
    
    // maxMod5
    
    public int maxMod5(int a, int b) {
        if (a == b){
         return 0;
      }
        if (a % 5 == b % 5 && a > b){
         return b;
      }
        if (a % 5 == b % 5 && a < b){
         return a;
      }
        if (a > b){
         return a;
        }
        else{
         return b;
        }
      }
    
    // redTicket
    
    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2 && a == c){
         return 10;
      }
        if (a == b && b == c && a == c){
         return 5;
      }
        if (a!=b && a!=c){
         return 1;
      }
        else{
         return 0;
        }
      }
    
    // greenTicket
    
    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c && b == c){
         return 20;
      }
        if (a == b || a ==c || b == c){
         return 10;
      }
        else{
         return 0;
        }
      }
    
    // blueTicket
    
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10){
         return 10;
        }
        if (a + b - 10 == a + c || a + b - 10 == c + b){
         return 5;
        }
        else{
         return 0;
        }
      }
    
    // shareDigit
    
    public boolean shareDigit(int a, int b) {
        if (a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || b / 10 == a % 10){
         return true;
        }
        else{
         return false;
        }
      }
    
    // sumLimit
    
    public int sumLimit(int a, int b) {
        String first = String.valueOf(a);
        int plus = (a + b);
        String second = String.valueOf(plus);
        if (first.length() == second.length()){
         return plus;
      }
        else{ 
        return a;
        }
      }
   
}
