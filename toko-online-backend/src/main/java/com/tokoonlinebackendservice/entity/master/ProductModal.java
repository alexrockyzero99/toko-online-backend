package com.tokoonlinebackendservice.entity.master;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_PRODUCT_MODAL")
public class ProductModal extends BaseEntity {

	@Id
	@Column(name = "PRODUCT_MODAL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productModalId;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@Column(name = "PRODUCT_FROM")
	private String productFrom;
	
	@Column(name = "CURRENT_PRICE")
	private Double currentPrice;
	
	@Column(name = "CURRENT_STOCK")
	private Integer currentStock;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "productModal", orphanRemoval = true)
	@OrderBy("productModalDetailId")
	private List<ProductModalDetail> productModalDetailList;
	
}
