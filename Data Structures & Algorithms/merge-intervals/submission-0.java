class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b) ->a[0]-b[0]);
       List<int[]> ans=new ArrayList<>();
       ans.add(intervals[0]);
       for(int i=1;i<intervals.length;i++){
        int[] prev=ans.get(ans.size()-1);
        int[] curr=intervals[i];
        if(curr[0]<=prev[1]){
prev[0]=Math.min(curr[0],prev[0]);
prev[1]=Math.max(curr[1],prev[1]);
        }
else{
ans.add(intervals[i]);
}}
int[][] res=new int[ans.size()][2];
for(int i=0;i<ans.size();i++){
    res[i]=ans.get(i);
}
  return res;}}




