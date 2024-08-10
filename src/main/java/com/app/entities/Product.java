package com.app.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(nullable = false)
	@JsonIgnore
	private Farmer farmer;
	
	@Column(name="Inventory_Count",length = 100)
    private long inventoryCount;
	
	private String farmerName;
	
	private String imageName;

	private String city;
	
	@Column(name = "productName")
	private String productName;
	
	private String productDescription;
	
	@Column(name = "inStock")
	private int inStock;
	
	@Column(name = "weight_measure")
	private String weight_measure;
	
	@Column(name = "price")
	private double price =0;
	
	@Column(name = "total_sales")
	private int totalSales=0;
	
	@Column(name = "total_earnings")
	private double  totalEarnings = 0.0;
	
	
	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public String getWeight_measure() {
		return weight_measure;
	}

	public void setWeight_measure(String weight_measure) {
		this.weight_measure = weight_measure;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public double getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getInventoryCount() {
		return inventoryCount;
	}

	public void setInventoryCount(long inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	

	
	
}
