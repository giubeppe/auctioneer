package com.pubmatic.adserving.rtb.examples;

import org.apache.http.HttpHost;

import com.pubmatic.adserving.rtb.*;


/**
 * handles a simple video request
 * @author giubeppe
 *
 */
public class SimpleVideoRequest {

	/**
	 * number of requests needed in current example
	 */
	private static final int REQUESTS_N = 1;

	public static void main(String[] args) throws Exception {

		SimpleVideoRequest requester = new SimpleVideoRequest();
		requester.doRequest();

	}

	private void doRequest() throws Exception {

		System.out.println("Making the request");

		BaseBidRequest[] bidRequests = setupBidders(REQUESTS_N);

		ExtendedAuctioneer auctioneer = new ExtendedAuctioneer();
		auctioneer.makeRequest(bidRequests);

		// wait some time for response before shutting down
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		auctioneer.shutdown();
	}

	
	private BaseBidRequest[] setupBidders(int biddersN) {
		BaseBidRequest[] bidRequests;

    	// Execute HTTP GETs to the following hosts and
    	bidRequests = new BaseBidRequest[biddersN];
    	for (int i=0; i<bidRequests.length; i++) {
    		BaseBidRequest bidRequest = new VideoBidRequest();
    		bidRequest.init(new HttpHost("localhost", 8080, "http"), "dsp-simulator/bidder", new Integer(i).toString()); 
    		
    		bidRequests[i] = bidRequest;     		
    	}

		return bidRequests;
	}
}
