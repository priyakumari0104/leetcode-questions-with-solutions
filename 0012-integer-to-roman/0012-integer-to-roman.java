class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(50, "L");
        map.put(10, "X");
        map.put(5, "V");
        map.put(1, "I");
        map.put(900, "CM");
        map.put(400, "CD");
        map.put(90, "XC");
        map.put(9, "IX");
        map.put(4, "IV");
        map.put(40, "XL");
        StringBuilder ans = new StringBuilder();
        List<Integer> l1= new ArrayList<>(map.keySet());
        l1.sort(Collections.reverseOrder());
        for(int key:l1){
            while(num>=key){
                ans.append(map.get(key));
                num-=key;
            }
        }
        return ans.toString();
    }
}