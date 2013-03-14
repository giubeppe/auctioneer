package com.pubmatic.adserving.rtb;

public abstract class BaseBidRequestParams {
	
	private String ip;
	private String uid;
	private String timezone;
	private String adHeigth;
	private String adWidth;
	private String pubId;
	private String siteId;
	private String adId;
	private String adPosition;
	private String uFoldPos;
	private String sFoldPos;
	private String inIFrame;
	private String screenResolution;
	private String language;
	private String browser;
	private String cookie;
	private String refurl;
	private String pageurl;
	private String siteurl;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getAdHeigth() {
		return adHeigth;
	}
	public void setAdHeigth(String adHeigth) {
		this.adHeigth = adHeigth;
	}
	public String getAdWidth() {
		return adWidth;
	}
	public void setAdWidth(String adWidth) {
		this.adWidth = adWidth;
	}
	public String getPubId() {
		return pubId;
	}
	public void setPubId(String pubId) {
		this.pubId = pubId;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdPosition() {
		return adPosition;
	}
	public void setAdPosition(String adPosition) {
		this.adPosition = adPosition;
	}
	public String getuFoldPos() {
		return uFoldPos;
	}
	public void setuFoldPos(String uFoldPos) {
		this.uFoldPos = uFoldPos;
	}
	public String getsFoldPos() {
		return sFoldPos;
	}
	public void setsFoldPos(String sFoldPos) {
		this.sFoldPos = sFoldPos;
	}
	public String getInIFrame() {
		return inIFrame;
	}
	public void setInIFrame(String inIFrame) {
		this.inIFrame = inIFrame;
	}
	public String getScreenResolution() {
		return screenResolution;
	}
	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getRefurl() {
		return refurl;
	}
	public void setRefurl(String refurl) {
		this.refurl = refurl;
	}
	public String getPageurl() {
		return pageurl;
	}
	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}
	public String getSiteurl() {
		return siteurl;
	}
	public void setSiteurl(String siteurl) {
		this.siteurl = siteurl;
	}
	
}
