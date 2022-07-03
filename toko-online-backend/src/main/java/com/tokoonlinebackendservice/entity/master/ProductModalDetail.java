package com.tokoonlinebackendservice.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_PRODUCT_MODAL_DETAIL")
public class ProductModalDetail extends BaseEntity {

	@Id
	@Column(name = "PRODUCT_MODAL_DETAIL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productModalDetailId;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_MODAL_ID")
	private ProductModalDetail productModalDetail;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "STOCK")
	private Integer stock;
	
}
