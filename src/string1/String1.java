package string1;

/**
 * @author Gonzalo Izuzquiza
 */

public class String1 {
    
    // helloName
    public String helloName(String name) {
  return "Hello " + name + "!";
}

    // makeAbba
    
public String makeAbba(String a, String b) {
 return a + b + b + a;
}

// makeTags

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

// makeOutWord

public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2);
}

// extraEnd

public String extraEnd(String str) {
  int longitud = str.length();
  return str.substring(longitud - 2) + str.substring(longitud - 2) + str.substring(longitud - 2); 
}

// firstTwo

public String firstTwo(String str) {
 if (str.length() < 2) return str;
  return str.substring(0,2);
}

// firstHalf

public String firstHalf(String str) {
return str.substring(0, str.length() / 2);
}

// theEnd

public String theEnd(String str, boolean front) {
 if (front)
    return str.substring(0,1);
  else
    return str.substring(str.length()-1);

}

// withouEnd2

public String withouEnd2(String str) {
 if(str.length() < 2) return "";
  return str.substring(1,str.length() -1);
}

// middleTwo

public String middleTwo(String str) {
  int aux = str.length()/2;
  return str.substring(aux-1,aux+1);
    }


}
