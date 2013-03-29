package com.pubmatic.adserving.rtb;

import org.apache.http.HttpHost;
import org.junit.Test;

public class SingleAuction {

	@Test
	public void singleAuction() throws Exception {
	
		long ts2;
		long ts = System.currentTimeMillis();

    	ExtendedAuctioneer auctioneer = new ExtendedAuctioneer();
  	    	
    	StandardBidRequest stdReq = new StandardBidRequest();
    	stdReq.init(new HttpHost("localhost", 8080, "http"), "dsp-simulator/bidder", "123");
    	
		auctioneer.makeRequest(new BaseBidRequest[] {stdReq});
    	
    	ts2 = System.currentTimeMillis();
    	System.out.println("Auction total time: "+(ts2-ts)+"ms");

    	// don't do this!
		Thread.sleep(1000);
    	auctioneer.shutdown();
    }
}