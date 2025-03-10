int tendollar=0;
        int twentydollar=0;
        int fivedollar=0;
        int amount=bills-5;
        int twentydollarneeded=Math.min(amount/20,twentydollar);
        amount=amount-twentydollarneed*20;
        twentydollar=twentydollar-twentydollarneeded;

        int tendollarneeded=Math.min(amount/10,tendollar);
        amount=amount-tendollarneeded*10;
        tendollar=tendollar-tendollarneeded;

        int fivedollarneed=Math.min(amount/5,fivedollar);
        amount=amount-fivedollarneed*5;
        fivedollar=fivedollar-fivedollarneeded;
        if(amount>0)
        {
            return false;
        }
        if(bill==20)
        {
            tentydollar++;
        }
        else if(bills==10)
        {
            tendollar++;
        }
        else if(bills==5)
        {
            fivedollar++;
        }
        return true;
