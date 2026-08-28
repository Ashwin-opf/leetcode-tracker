class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        int sum=0;
        for(String ch:tokens){
            switch (ch){
                case "+":
                    sum = st.pop();
                    st.push(st.pop()+sum);
                    break;
                case "-":
                    sum = st.pop();
                    st.push(st.pop()-sum);
                    break;
                case "*":
                    sum = st.pop();
                    st.push(st.pop()*sum);
                    break;
                case "/":
                    sum = st.pop();
                    st.push(st.pop()/sum);
                    break;
                default:
                    st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}