import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Chall3 {

    public static int totalASC2(String input){
        int result =0;
        for(int i=0; i<input.length();i++){
            result += (int) input.charAt(i);
        }
        return result;
    }

    public static void main(String[] arg) throws IOException{
        System.out.println("This code help finding anagram of a word");
        System.out.println("Please input a word:");
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        int[] inputASC2 = new int[input.length()];
        for(int i=0; i< input.length();i++){
            inputASC2[i] = (int) input.charAt(i);
        }
        Arrays.sort(inputASC2);
        File file = new File("D:\\VCodeStudio\\CSC233_Chall\\Chall3\\Chall3_WordList.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
            if((st.length()==input.length())){
                int[] stASC2 = new int[st.length()];
                for(int i=0; i< st.length();i++){
                    stASC2[i] = (int) st.charAt(i);
                }
                Arrays.sort(stASC2);
                int count =0;
                for(int i=0;i<input.length();i++){
                    if(inputASC2[i]!=stASC2[i]){
                        count ++;
                    }
                }
                if(count ==0){
                    System.out.println(st);
                }  
            }
        }
    }
}
