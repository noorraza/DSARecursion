import java.io.*;
import java.util.*;

public class GetKpc {

    public static void main(String[] args) throws Exception {
        System.out.println(getKPC("0123456789"));
    }
    
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bRec = new ArrayList<>();
            bRec.add("");
            return bRec;
        }
        char char0 = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String strAdd = codes[char0-'0'];
        for(int i =0;i<strAdd.length();i++){
            char chAdd = strAdd.charAt(i);
            for(String s:rres){
                mres.add(chAdd+s);
            }
        }

        return mres;
    }

}