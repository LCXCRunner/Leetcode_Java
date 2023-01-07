public class App {
    public static void main(String[] args) throws Exception {
        String s = "";

        s = "CM";
        System.out.println(romanToInt(s));

    }

public static int romanToInt(String s) {
    int output = 0;
    int length = s.length();
    char currVar = 'a';
    int value = 0;
    
    for (int i = length - 1; i >= 0; i--){
        currVar = s.charAt(i);
        switch(currVar){
            case ('I'): value = 1;
                break;
            case ('V'): value = 5;
                break;
            case ('X'): value = 10;
                break;
            case ('L'): value = 50;
                break;
            case ('C'): value = 100;
                break;
            case ('D'): value = 500;
                break;
            case ('M'): value = 1000;
                break;
        }
        if(value * 4 < output){
            output = output - value;
        }
        else{
            output += value;
        }
        }
        return output;

    }    
}


