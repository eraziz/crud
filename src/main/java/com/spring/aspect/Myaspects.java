package com.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Myaspects {
@Before("execution(* com.spring.service.PaymentServiceimp.makePayment())")
public void printBefore() {
		System.out.println("Payment stsrted.......");
	}

@After("execution(* com.spring.service.PaymentServiceimp.makePayment())")
public void printafter() {
		System.out.println("Payment done.......");
	}
}
