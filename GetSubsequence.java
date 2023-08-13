import java.util.ArrayList;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        System.out.println(gss("abcd"));
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char c = str.charAt(0);
        ArrayList<String> rres = gss(str.substring(1));
        ArrayList<String> mres = new ArrayList<>();

        for (String r : rres) {
            mres.add("" + r);
        }
        for (String r : rres) {
            mres.add(c + r);
        }


        return mres;
    }

}