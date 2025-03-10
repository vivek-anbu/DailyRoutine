class Solution {
    public boolean lemonadeChange(int[] bills) {

       int fivedollar=0;
       int tendollar=0;
       int twentydollar=0;
       for(int bill:bills)
       {
            int amount=bill-5;
            int twentyneeded=Math.min(amount/20,twentydollar);
            amount=amount-twentyneeded*20;
            twentydollar=twentydollar-twentyneeded;
            
            int tenneeded=Math.min(amount/10,tendollar);
            amount=amount-tenneeded*10;
            tendollar=tendollar-tenneeded;

            int fiveneeded=Math.min(amount/5,fivedollar);
            amount=amount-fiveneeded*5;
            fivedollar=fivedollar-fiveneeded;
            if(amount>0)
            {
                return false;
            }
            if(bill==20)
            {
                twentydollar++;
            }
            else if(bill==10)
            {
                tendollar++;
            }
            else if(bill==5) 
            {   
                fivedollar++;
            }
       }
       return true; 
    }
}
