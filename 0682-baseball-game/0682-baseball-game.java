class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> temp=new Stack<>();
        for(int i=0;i<operations.length;i++){
        String s=operations[i];
if(s.equals("C")){temp.pop();}
else if(s.equals("D")){temp.push(2*(temp.peek()));}
else if(s.equals("+")){
    int top= temp.peek();
    temp.pop();
    int top2=temp.peek();
    int sum=top+top2;
    temp.push(top);
    temp.push(sum);

}else{
    temp.push(Integer.parseInt(s));
}
        }
        int sum=0;
        while(temp.size()>0){
            sum+=temp.pop();

        }
        return sum;
    }
}