package ImplementingClass;

import threads.DeadLockConditionThreadClass;

public class DeadLockConditionImplementation {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new DeadLockConditionThreadClass(),"Thread1");
		thread1.start();
		Thread thread2=new Thread(new DeadLockConditionThreadClass(),"Thread2");
		thread2.start();
	}
}
