package org.smarttechies.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.smarttechies.model.Product;

@Path("/")
public class ProductDetailsService {
	
	@GET
	@Path("/products")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProdName("Giordano Analog Watch - For Men (Silver)");
		product1.setProdPrice(1699);
		product1.setProdDesc("No description available");
		product1.setActive(true);
		Map<String, String> features1 = new HashMap<String, String>();
		features1.put("Type", "Analog");
		features1.put("Strap Material", "Metal Strap");
		features1.put("Dial Color", "Black");
		product1.setFeatures(features1);
		
		Product product2 = new Product();
		product2.setProdName("Nikon Coolpix L28 Point & Shoot (Black)");
		product2.setProdPrice(5772);
		product2.setProdDesc("Compact Digital Camera, Lens Construction: 6 Elements in 5 Groups, Focus-area Selection Center, 5 Level Brightness Adjustment, Frame Coverage Shooting Mode: 98% Horizontal and 98% Vertical, Frame Coverage Playback Mode: 98% Horizontal and 98% Vertical, Continuous Shooting: Single, Continuous (Six Images are Captured Continuously at Rate of About 1.1 fps), BSS (Best Shot Selector), 16 Multi-shot, Exposure Metering Mode: Matrix, Center-weighted, Spot, Exposure Control: Programmed Auto Exposure, Exposure Compensation: -2.0 - +2.0 EV in increment of 1/3 EV, Shutter: Mechanical and Charge-coupled Electronic Shutter, 2 Steps Aperture Range, Flash Control: TTL Auto Flash with Monitor Preflashes, Data Transfer Protocol: MTP, PTP, Input / Output Terminal: Audio / Video (A/V) Output, Digital Input / Output (USB), 1/4 inch Tripod Socket, Temperature: 0 - 40° C, Humidity: 85%, One-touch 720p HD Movie Recording, Smart Portrait System, Motion Blur Reduction, Easy-to-hold Handgrip Design Stylish Body with High-grade Metallic Exterior, Color Variations for Aluminum Lens Ring and Lens Barrel, EXPEED C2 Image Processing System, Wireless Transfer, Frame the Perfect Shot, Motion Detection");
		product2.setActive(true);
		Map<String, String> features2 = new HashMap<String, String>();
		features2.put("Battery Type", "AA Alkaline Battery");
		features2.put("USB Cable", "Hi-speed USB");
		features2.put("Lens Type", "NIKKOR Lens");
		product2.setFeatures(features2);
		
		products.add(product1);
		products.add(product2);
		return products;
	}
	
	@GET
	@Path("/product/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Product getProduct(@PathParam("id") String id) {
		Product product = new Product();
		product.setProdName("Giordano Analog Watch - For Men (Silver)");
		product.setProdPrice(1699);
		product.setProdDesc("No description available");
		product.setActive(true);
		Map<String, String> features = new HashMap<String, String>();
		features.put("Type", "Analog");
		features.put("Strap Material", "Metal Strap");
		features.put("Dial Color", "Black");
		product.setFeatures(features);
		return product;
	}
}
