class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int set[]:reservedSeats){
            int row=set[0];
            int seats=set[1];
            map.putIfAbsent(row,new HashSet<>());
            map.get(row).add(seats);
        }
        int ans=(n-map.size())*2;
        for(int key:map.keySet()){
               Set<Integer> reserved= map.get(key);
               boolean leftavail=!reserved.contains(2)&&!reserved.contains(3)&&!reserved.contains(4)&&!reserved.contains(5);
               boolean rightavail=!reserved.contains(6)&&!reserved.contains(7)&&!reserved.contains(8)&&!reserved.contains(9);
               boolean middleavail=!reserved.contains(4)&&!reserved.contains(5)&&!reserved.contains(6)&&!reserved.contains(7);
               if(leftavail==true&&rightavail==true){
                ans+=2;
               }
                else if(rightavail==true||leftavail==true||middleavail==true){
                ans+=1;
               }

        }
        return ans;
    }
}