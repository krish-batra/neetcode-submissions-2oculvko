class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] word = s.toCharArray();
        int left = 0;
        int right = word.length - 1;
        while(left < right){
            if(word[left] != word[right]){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}