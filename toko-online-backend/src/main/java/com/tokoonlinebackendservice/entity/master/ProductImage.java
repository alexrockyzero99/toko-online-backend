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
@Table(name = "MST_PRODUCT_IMAGE")
public class ProductImage extends BaseEntity {

	@Id
	@Column(name = "PRODUCT_IMAGE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productImageId;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@Column(name = "IMAGE_FILE")
	private byte[] imageFile;
	
	@Column(name = "IMAGE_NAME")
	private String imageName;
	
}
