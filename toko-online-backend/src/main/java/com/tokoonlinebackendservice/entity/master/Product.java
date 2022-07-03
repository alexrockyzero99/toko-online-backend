package com.tokoonlinebackendservice.entity.master;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_PRODUCT")
public class Product extends BaseEntity {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(name = "SKU")
	private String sku;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "BARCODE")
	private byte[] barcode;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "TOTAL_STOCK")
	private Integer totalStock;
	
	@Column(name = "SELLING_PRICE")
	private Double sellingPrice;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "PRODUCT_CODE")
	private String productCode;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product", orphanRemoval = true)
	@OrderBy("productImageId")
	private List<ProductImage> productImageList;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product", orphanRemoval = true)
	@OrderBy("productModalId")
	private List<ProductModal> productModalList;
	
}
