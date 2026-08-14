class Solution {
    public int maximumLengthSubstring(String s) {
        int max=Integer.MIN_VALUE;
       int i=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int j=0;j<s.length();j++) {
           char ch=s.charAt(j);
           map.put(ch,map.getOrDefault(ch,0)+1);
           while(map.get(ch)>2) {
            char ch1=s.charAt(i);
            map.put(ch1,map.get(ch1)-1);
            i++;
           }
           if(max<j-i+1) max=j-i+1;
        }
        return max;
    }
}
