package org.smarttechies.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private String prodName;
	private double prodPrice;
	private String prodDesc;
	private boolean active;
	private Map<String,String> features;
	
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param pProdName the prodName to set
	 */
	public void setProdName(String pProdName) {
		prodName = pProdName;
	}
	/**
	 * @return the prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}
	/**
	 * @param pProdPrice the prodPrice to set
	 */
	public void setProdPrice(double pProdPrice) {
		prodPrice = pProdPrice;
	}
	/**
	 * @return the prodDesc
	 */
	public String getProdDesc() {
		return prodDesc;
	}
	/**
	 * @param pProdDesc the prodDesc to set
	 */
	public void setProdDesc(String pProdDesc) {
		prodDesc = pProdDesc;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param pActive the active to set
	 */
	public void setActive(boolean pActive) {
		active = pActive;
	}
	
	/**
	 * @param pFeatures the features to set
	 */
	public void setFeatures(Map<String, String> pFeatures) {
		features = pFeatures;
	}
	/**
	 * @return the features
	 */
	public Map<String, String> getFeatures() {
		return features;
	}
}
