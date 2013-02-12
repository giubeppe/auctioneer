package com.pubmatic.adserving.rtb.examples;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import com.pubmatic.adserving.rtb.BasicAuctioneer;

public class RunnableAuctionLoop implements Runnable {

	private final BasicAuctioneer auctioneer;
	private int repetitions;
	private CountDownLatch latch = null;
	
	public RunnableAuctionLoop() throws Exception {
		
		repetitions = 1;
		auctioneer = new BasicAuctioneer();
		auctioneer.prepareRequest();
	}
	
	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}
	
	public void run() {

		try {
			for (int i=0; i<repetitions; i++) {
				auctioneer.makeRequest();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (latch != null)
				latch.countDown();
		}
	}
	
	public void shutdown() {
		auctioneer.shutdown();
	}

	public void setLatch(CountDownLatch latch) {
		this.latch = latch;  		
	}

}
