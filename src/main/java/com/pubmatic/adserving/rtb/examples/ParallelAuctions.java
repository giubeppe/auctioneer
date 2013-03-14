package com.pubmatic.adserving.rtb.examples;

import java.util.concurrent.CountDownLatch;

public class ParallelAuctions {
	
	private static final int REPETITIONS = 10;
	private static final int THREADS_NUMBER = 30;

	public static void main(String[] args) throws Exception {
		

		long startTime = System.currentTimeMillis();
		
		CountDownLatch latch = new CountDownLatch(THREADS_NUMBER);
		RunnableAuctionLoop[] auctionLoops = new RunnableAuctionLoop[THREADS_NUMBER]; 
		
		for (int i=0;i<THREADS_NUMBER;i++) {
			auctionLoops[i] = new RunnableAuctionLoop();
			auctionLoops[i].setRepetitions(REPETITIONS);
			auctionLoops[i].setLatch(latch);
			new Thread(auctionLoops[i]).start();
		}
		
		latch.await();
					
		for (RunnableAuctionLoop auctionLoop: auctionLoops) {
			auctionLoop.shutdown();
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Elapsed time: " + (endTime - startTime) / 1000.0 + " ms; " +
				(REPETITIONS * THREADS_NUMBER) / ((endTime - startTime) / 1000.0) + " reqs/sec");
	
	}

}
