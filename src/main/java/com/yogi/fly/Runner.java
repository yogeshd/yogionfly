package com.yogi.fly;

import com.yogi.fly.logger.Logger;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by IntelliJ IDEA.
 * User: xaoc
 * Date: 30.11.11
 * Time: 17:23
 */
public class Runner implements IRunner {


    private IBean1 bean1;
    private IBean1 bean2;
    
    @Logger private Log log;

    @Override
    public void run() {
    	if("bean2".equalsIgnoreCase(this.var1))
    				log.info(bean2.hello(" bean 2 world"));
    	else
    			log.info(bean1.hello(" bean 1 world"));
    }

    @Autowired
    @Override
    public void setBean1(IBean1 bean1) {
        this.bean1 = bean1;
        System.out.println("\n\n\n\n bean has been set ");
    }
    

    @Value("${var1}")
	public void setVar1(String var1) {
		this.var1 = var1;
		System.out.println("\n\n\n\n var1 has been set "+var1);
	}

	private String var1;

	@Autowired
	@Override
	public void setBean2(IBean1 bean2) {
		// TODO Auto-generated method stub
		this.bean2 = bean2;
	}

	@Override
	public void setFromJmx(String var1) {
		this.var1=var1;
		
	}
    
    
    
}
