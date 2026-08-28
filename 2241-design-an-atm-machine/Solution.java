class ATM {
private int[]note=new int[5];
private int[]values={20,50,100,200,500};
public void deposit(int[]bankNote){
    for(int i=0;i<5;i++){
        note[i]=note[i]+bankNote[i];
    }
}
public int[]withdraw(int amount){
    int []result=new int[5];
    for(int i=4;i>=0;i--){
        int  use=(int)Math.min(note[i],amount/values[i]);
        result[i]=use;
        amount=amount-(use*values[i]);
    }
    if(amount!=0)return new int[]{-1};
    for(int i=0;i<5;i++)note[i]=note[i]-result[i];
    return result;
}
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */