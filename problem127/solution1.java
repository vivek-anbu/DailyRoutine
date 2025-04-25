 Set<Integer> union=new TreeSet<>();
       for(int i=0;i<a.length;i++)
       {
           if(!union.contains(a[i]))
           {
               union.add(a[i]);
           }
       }
       for(int i=0;i<b.length;i++)
       {
           if(!union.contains(b[i]))
           {
               union.add(b[i]);
           }
       }
       return union.size();
