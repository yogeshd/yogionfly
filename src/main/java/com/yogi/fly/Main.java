package com.yogi.fly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: xaoc
 * Date: 30.11.11
 * Time: 17:20
 */
public class Main {
    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/application-context-root.xml");
      /*  IRunner runner = ctx.getBean("runner", IRunner.class);
      //  runner.setBean1((IBean1)ctx.getBean("bean2"));
        runner.run();
        runner.setFromJmx("bean2");
        runner.run();
        */
        
        MyBusinessBO bo=(MyBusinessBO)ctx.getBean("bo");
        bo.doSomething();
    }
}
