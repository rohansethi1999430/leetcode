class Solution {
    public int lengthOfLastWord(String s) {
         String[] arr = s.split(" ");

         String lw = arr[(arr.length)-1];
          String[] lastWord = lw.split("");

         return lastWord.length;
    }
}