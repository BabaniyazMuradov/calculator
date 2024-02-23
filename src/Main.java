import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите выражение:");
            String line = getLine();
            String[] numbersStr = getNumbersString(line);
            if (line.contains("I") || line.contains("II") || line.contains("III") || line.contains("IV") || line.contains("V") ||
                    line.contains("VI") || line.contains("VII") || line.contains("VIII") || line.contains("IX") || line.contains("X")) {
                int[] numbersRoman = romanToInt(numbersStr);
                operation(numbersRoman, line);
            } else {
                int[] numbers = getNumbers(numbersStr);
                operation(numbers, line);
            }
        }


    }
    public static String getLine(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

    public static String[] getNumbersString(String line){
        String[] numbers = line.split("[+*-/]");
        return numbers;
    }

    public static int[] getNumbers(String [] numbers){
        int[] numbersInt = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
                numbersInt[i] = Integer.parseInt(numbers[i]);
            }
        return numbersInt;
    }

    public static int[] romanToInt(String [] numbers){
        int[] numbersInt = new int[numbers.length];
        for (int i = 0; i<numbers.length; i++){
               switch (numbers[i]){
                   case "I":
                       numbersInt[i] = 1;
                       break;
                   case "II":
                       numbersInt[i] = 2;
                       break;
                   case "III":
                       numbersInt[i] = 3;
                       break;
                   case "IV":
                       numbersInt[i] = 4;
                       break;
                   case "V":
                       numbersInt[i] = 5;
                       break;
                   case "VI":
                       numbersInt[i] = 6;
                       break;
                   case "VII":
                       numbersInt[i] = 7;
                       break;
                   case "VIII":
                       numbersInt[i] = 8;
                       break;
                   case "IX":
                       numbersInt[i] = 9;
                       break;
                   case "X":
                       numbersInt[i] = 10;
                       break;
               }
            }
        return numbersInt;
        }



    public static void operation(int[] numbers,String line){
        if(line.contains("+")){
            System.out.println("="+(numbers[0]+numbers[1]));
        }else if(line.contains("-")){
            System.out.println("="+(numbers[0]-numbers[1]));
        }else if(line.contains("*")){
            System.out.println("="+(numbers[0]*numbers[1]));
        }else if(line.contains("/")){
            System.out.println("="+(numbers[0]/numbers[1]));
        }
    }
}
