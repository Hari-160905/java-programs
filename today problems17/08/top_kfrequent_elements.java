public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        Dictionary<int, int>num=new Dictionary<int, int>();
        for(int i=0;i<nums.Length;i++) {
            if(num.ContainsKey(nums[i])) {
            num[nums[i]]++;
            } else {
                num[nums[i]]=1;
            }
        }
       int[] arr=new int[k];
       int n=0;
        int res=0;
        while(k!=0) {
             int max=0;
           foreach(int j in num.Keys) {
            if(num[j]>max) {
            max=num[j];
            res=j;
            }
           }
           arr[n]=res;
           n++;
          num.Remove(res);
           k--;
        }
        return arr;
    }
}
