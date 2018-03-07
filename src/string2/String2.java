package string2;

/**
 * @author Gonzalo Izuzquiza
 */
public class String2 {

    //Ejercicio countH1
    public int countHi(String str) {
        int x = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                x++;
            }
        }
        return x;
    }

//Ejercicio repeatFront
    public String repeatFront(String str, int n) {
        String palabra = "";
        for (int i = n; i > 0; i--) {
            palabra = palabra + str.substring(0, i);
        }

        return palabra;
    }

    //Ejercicio repeatSeparator
    public String repeatSeparator(String word, String sep, int count) {
        String palabra = "";

        for (int i = count; i > 0; i--) {
            if (i != 1) {
                palabra = palabra + word + sep;
            } else {
                palabra = palabra + word;
            }

        }
        return palabra;

    }

    //Ejercicio doubleChar
    public String doubleChar(String str) {
        String palabra = "";
        for (int i = 0; i < str.length(); i++) {
            palabra += str.charAt(i);
            palabra += str.charAt(i);
        }
        return palabra;
    }

    //Ejercicio reatEnd
    public String repeatEnd(String str, int n) {
        String palabra = "";
        for (int i = 0; i < n; i++) {
            palabra += str.substring(str.length() - n, str.length());

        }
        return palabra;

    }

    //ejercicio endOther
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() < b.length()) {
            String resultado = b.substring(b.length() - a.length(), b.length());
            if (resultado.compareTo(a) == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            String resultado = a.substring(a.length() - b.length(), a.length());
            if (resultado.compareTo(b) == 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    //Ejercicio xyBalance
    public boolean xyBalance(String str) {
        Boolean x = false;
        Boolean y = false;
        

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'x' && y == true) {
                x = true;
                y = false;
            } else if (str.charAt(i) == 'x') {
                x = true;
            }
            if (str.charAt(i) == 'y' && x == true) {
                y = true;
            }
        }
        if (x == false) {
            y = true;
        }
        return y;
    }

    //Ejercicio xyzthere
    public boolean xyzThere(String str) {
        String xyz = "xyz"; 
        Boolean match = false;
        if ( str.length() < 3) {
            return false;
        }
        for (int i = 0; i <  str.length() - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.compareTo(xyz) == 0 && i == 0) {
                match = true;
            } else if (temp.compareTo(xyz) == 0 && str.charAt(i - 1) != 46) {
                match = true;
            }
        }
        return match;
    }

    //ejercicio CountCode
    public int countCode(String str) {
        int count = 0;
        String co = "co";
        String e = "e";
        if ( str.length() < 4) {
            return 0;
        }
        for (int i = 0; i <  str.length() - 3; i++) {
            if (co.compareTo(str.substring(i, i + 2)) == 0 && e.compareTo(str.substring(i + 3, i + 4)) == 0) {
                count++;
            }
        }
        return count;
    }

    //Ejercicios catDog
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i <  str.length() - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.compareTo("cat") == 0) {
                cat++;
            }
            if (temp.compareTo("dog") == 0) {
                dog++;
            }
        }
        if (cat == dog) {
            return true;
        } else {
            return false;
        }
    }

    //ejercicio bobthere
    public boolean bobThere(String str) {
        for (int i = 0; i <  str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    //ejercicio mixString
    public String mixString(String a, String b) {
        int max = Math.max(a.length(), b.length());
        String word = "";
        for (int i = 0; i < max; i++) {
            if (i <= a.length() - 1) {
                word += a.substring(i, i + 1);
            }
            if (i <= b.length() - 1) {
                word += b.substring(i, i + 1);
            }
        }
        return word;
    }
}

