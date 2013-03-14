package com.pubmatic.adserving.rtb;

public class VideoBidRequest extends BaseBidRequest {

	@Override
	public String getQueryString() {
		return super.getQueryString() + "&" + this.createVideoQueryString();
	}

	private String createVideoQueryString() {

		String str = "";
// add video parameters here
		return str;
	}
}
