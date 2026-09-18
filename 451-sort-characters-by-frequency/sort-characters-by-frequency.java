class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        List<Character> ch=new ArrayList<>();
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                ch.add((char)i);
            }
        }
        ch.sort((a,b)->freq[b]-freq[a]);
        StringBuilder ans=new StringBuilder();
        for(char chr:ch){
            for(int i=0;i<freq[chr];i++){
                ans.append(chr);
            }
        }
        return ans.toString();
    }
}