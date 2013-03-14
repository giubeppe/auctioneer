package com.pubmatic.adserving.rtb;

import org.junit.Test;

public class BasicAuction {

	private static final int MAX_REQUESTS = 1;

	@Test
	public void hundredAuctions() throws Exception {
	
		long ts2;
		long ts = System.currentTimeMillis();

    	BasicAuctioneer auctioneer = new BasicAuctioneer();
    	auctioneer.prepareRequest();
    	
    	for (int i=0; i<MAX_REQUESTS; i++)
    		auctioneer.makeRequest();
    	
    	auctioneer.shutdown();
    	
    	ts2 = System.currentTimeMillis();
    	System.out.println("Auction total time: "+(ts2-ts)+"ms");
    }
}