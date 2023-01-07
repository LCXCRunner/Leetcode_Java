public class App {
    public static void main(String[] args) throws Exception {
        String s = "";

        s = "LIV";
        System.out.println(romanToInt(s));

    }

public static int romanToInt(String s) {
    int output = 0;
    int length = s.length();
    char currVar = 'a';
    char nextVar = 'a';
    char prevVar = 'a';
    int I = 1;
    int V = 5;
    int X = 10;
    int L = 50;
    int C = 100;
    int D = 500;
    int M = 1000;


    for (int i = 0; i < length; i++){
        currVar = s.charAt(i);
        if(i < length-1){
        nextVar = s.charAt(i+1);
        }
        if(currVar == 'I'){
            output = output + 1;
        }
        }
        return output;

    }    
}


