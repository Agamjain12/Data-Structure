package DSA.Sort;

public class LinearSearch {
    public static void main(String[] args) {
        String name = "agam";
        char target = 'z';
       System.out.println(sss(name,target));

    }
   static boolean sss(String came, char target) {
       if (came.length() == 0) {
           return false;

       }

//       for (int i = 0; i < came.length(); i++) {
//           if (came.charAt(i) == target) {
//               return true;
//
//
//           }
//
//       }
       for(char c : came.toCharArray()){
           if(c==target){
               return true;
           }
       }
       return false;
   }
}
