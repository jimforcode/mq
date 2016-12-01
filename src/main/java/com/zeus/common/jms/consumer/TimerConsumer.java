package com.zeus.common.jms.consumer;

public class TimerConsumer {
	static int count = 0;

	static void run() {

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println("这是一个耗时间的任务 start" + TimerConsumer.count++);
					Thread.sleep(10000);
					System.out.println("这是一个耗时间的任务 end ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();
		;
	}

	public static void main(String[] args) {
		TimerConsumer.run();
	}
}
