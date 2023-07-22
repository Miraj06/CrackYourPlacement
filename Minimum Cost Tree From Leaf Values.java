class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack <Integer> stack=new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int r=0;
        for(int a : arr){
            while(stack.peek()<=a){
                int mid=stack.pop();
                r +=mid*Math.min(stack.peek(), a);
            }
            stack.push(a);

        }
        while(stack.size()>2){
            r+=stack.pop() * stack.peek();
        }
        return r;
    }
}
