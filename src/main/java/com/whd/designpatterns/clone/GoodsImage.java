package com.whd.designpatterns.clone;

public class GoodsImage implements Cloneable {
	
	private Integer imgId;
	private String imgAddress;
	
	public GoodsImage() {
	}
	public GoodsImage(Integer imgId, String imgAddress) {
		this.imgId = imgId;
		this.imgAddress = imgAddress;
	}
	public Integer getImgId() {
		return imgId;
	}
	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}
	public String getImgAddress() {
		return imgAddress;
	}
	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}

	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
