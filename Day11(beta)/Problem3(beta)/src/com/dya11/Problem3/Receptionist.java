package com.dya11.Problem3;

public class Receptionist{
    private Filter filter;
    public Receptionist(){};
    public Receptionist(Filter filter){
        this.filter=filter;
    }
    public Filter getFilter() {
        return filter;
    }
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void doFilter(User u,int min,int max,String str){
        for(int i=min-1;i<=max-1;i++)
            u.setType(str);
            //users[i].setType(str);
    }
}
