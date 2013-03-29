package com.pubmatic.adserving.rtb;

import org.apache.http.HttpHost;

public abstract class BaseBidRequest {
	
	private HttpHost target;
	private String path;
	
	private String id;
	private BaseBidRequestParams params;
	
	public void init(HttpHost target, String path, String id) {
		this.target = target;
		this.path = path;
		this.id = id;
	}

	public String getQueryString() {
				
		String str = "";
		
		str = "requestId=ID_of_the_request"
				+ "&ip=user_IP_Address"
				+ "&uid=PubMatic_s_anonymized_user_ID"
				+ "&timezone=timezone_offset"
				+ "&adHeight=height_of_the_ad_unit"
				+ "&adWidth=width_of_the_ad_unit"
				+ "&pubId=ID_of_the_Publisher_on_PubMatic"
				+ "&siteId=ID_of_the_Site_on_PubMatic"
				+ "&adId=ID_of_the_ad_slot_on_PubMatic"
				+ "&adPosition=position_of_the_ad_unit"
				+ "&uFoldPos=Publisher_defined_fold_position"
				+ "&sFoldPos=PubMatic_system_determined_fold_position"
				+ "&inIframe=flag_denoting_impression_is_coming_from_inside_iframe"
				+ "&screenResolution=resolution_of_the_user_s_display" 
				+ "&language=language_setting_of_the_user_agent"
				+ "&browser=user_agent"
				+ "&cookie=Demand_Partner_s_user_sync_assigned_user_ID"
				+ "&refurl=URL_of_the_referring_page"
				+ "&pageurl=URL_of_the_page" 
				+ "&siteurl=base_URL_of_the_site";

		return str + "&id="+getId();
	}
	
	public HttpHost getTarget() {
		return target;
	}

	public String getPath() {
		return path;
	}
	
	public String getId() {
		return id;
	}
}