package com.ustrip.common;


import com.ustrip.entity.Partner;

public class Partners {
	public static final ThreadLocal<Partner> holder = new ThreadLocal<Partner>();  
    public static void putPartner(Partner partner) {  
        holder.set(partner);  
    }  
      
    public static Partner getPartner() {  
        return holder.get();
    }      
}
