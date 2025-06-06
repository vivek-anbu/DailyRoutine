class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five=0;
        int ten=0;
        int twenty=0;
        for(int bill:bills)
        {
            int amount=bill-5;
            
            int twentyneed=Math.min(amount/20,twenty);
            amount=amount-twentyneed*20;
            twenty=twenty-twentyneed;

            int tenneed=Math.min(amount/10,ten);
            amount=amount-tenneed*10;
            ten=ten-tenneed;

            int fiveneed=Math.min(amount/5,five);
            amount=amount-fiveneed*5;
            five=five-fiveneed;

            if(amount>0)
            {
                return false;
            }
            else if(bill==5)
            {
                five++;
            }
            else if(bill==10)
            {
                ten++;
            }
            else if(bill==20)
            {
                twenty++;
            }
            
        }
        return true;
    }
}
