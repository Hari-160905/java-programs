public class Solution {
    public IList<string> TopKFrequent(string[] words, int k) {
        List<string> s=new List<string>();
        Array.Sort(words);
        Dictionary<string, int>num=new Dictionary<string, int>();
        for(int i=0;i<words.Length;i++) {
            if(num.ContainsKey(words[i])) {
            num[words[i]]++;
            } else {
                num[words[i]]=1;
            }
        }
        String res="";
        while(k!=0) {
            int max=0;
            foreach(string j in num.Keys) {
                if(num[j]>max) {
                max=num[j];
                res=j;   
                }
            }
            s.Add(res);
             num.Remove(res);
           k--;
        }
        return s;
    }
}
