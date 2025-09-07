class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(n%2!=0){
            arr.add(0);
            for(int i=1;i<n;i++){
                arr.add(i);
                arr.add(-i);
                if(arr.size()==n){
                    break;
                } 
            }
        }
        else{
            for(int i=1;i<n;i++){
                arr.add(i);
                arr.add(-i);
                if(arr.size()==n){
                    break;
                } 
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}