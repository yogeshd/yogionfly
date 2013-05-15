package com.yogi.fly;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBusinessBO {
	  private IBean1 bean1;
	    @Autowired
	    public void setBean1(IBean1 bean1) {
	        this.bean1 = bean1;
	    }  

	    
	    public void doSomething()
	    {
	    	System.out.println(bean1.hello(" whatever "));
	    }
}
