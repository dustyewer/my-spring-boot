package com.yewer.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.yewer.springbootaop.controller..*(..))")
    private void myPointcut() {
    }

    @Before("myPointcut()")
    public void myAspectLog(JoinPoint jp) {
        System.out.println("--------before----------");
    }

    @Around("myPointcut()")
    public Object myAuth(ProceedingJoinPoint jp) throws Throwable {
        Object ret;
        System.out.println("--------around before----------");
        ret = jp.proceed();
        System.out.println("---------------around after------------------");

        return ret;
    }

}
