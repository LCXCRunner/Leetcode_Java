public class App {
    public static void main(String[] args) throws Exception {
        String s = "";

        s = "LIV";
        System.out.println(romanToInt(s));

    }

public static int romanToInt(String s) {
    int output = 0;
    int length = s.length();
    char tempVar = 'a';

    for (int i = length; i > 0; i--){
        tempVar = s.charAt(i-1);
        if(tempVar == 'I'){
            output = output + 1;
        }
        if(tempVar == 'V'){
            output = output + 5;
        }
        if(tempVar == 'X'){
            output = output + 10;
        }
        if(tempVar == 'L'){
            output = output + 50;
        }
        if(tempVar == 'C'){
            output = output + 100;
        }
        if(tempVar == 'D'){
            output = output + 500;
        }
        if(tempVar == 'M'){
            output = output + 1000;
        }
        else{
            continue;
        }
        
    }

    return output;
}
}

