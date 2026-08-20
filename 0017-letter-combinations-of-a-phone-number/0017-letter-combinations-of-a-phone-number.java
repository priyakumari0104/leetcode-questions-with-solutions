class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Integer, Set<Character>> map = new HashMap<>();
        map.put(2, new HashSet<>(Arrays.asList('a', 'b', 'c')));
        map.put(3, new HashSet<>(Arrays.asList('d', 'e', 'f')));
        map.put(4, new HashSet<>(Arrays.asList('g', 'h', 'i')));
        map.put(5, new HashSet<>(Arrays.asList('j', 'k', 'l')));
        map.put(6, new HashSet<>(Arrays.asList('m', 'n', 'o')));
        map.put(7, new HashSet<>(Arrays.asList('p', 'q', 'r','s')));
        map.put(8, new HashSet<>(Arrays.asList('t', 'u', 'v')));
        map.put(9, new HashSet<>(Arrays.asList('y', 'w', 'x','z')));
        ans.add("");
        for(int i=0;i<digits.length();i++){
            int digit=digits.charAt(i)-'0';
            List<String>temp=new ArrayList<>();
            for(String str:ans){
                for(char ch :map.get(digit)){
                    
                    temp.add(str+ch);
                }
            }
            ans=temp;
        }
        return ans;
    }
}