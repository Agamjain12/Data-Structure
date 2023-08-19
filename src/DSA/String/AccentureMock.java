package DSA.String;

public class AccentureMock {
    public static void main(String[] args) {
        String s = "germansKillingTheEconomy";
        StringBuilder st = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>90){
                int ascii = s.charAt(i)-32;
                st.append((char)ascii);
            }
            else{
                int ascii = s.charAt(i)+32;
                st.append(" ");
                st.append((char)ascii);
            }

        }



        System.out.println(st);

    }
}
