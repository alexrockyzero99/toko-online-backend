package com.tokoonlinebackendservice.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@Configuration
public class MulterFile {
	
	@Bean  
    public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		
		// Maximum file size
		factory.setMaxFileSize(DataSize.ofGigabytes(1073741824));
		// / Set the total upload data size
        factory.setMaxRequestSize(DataSize.ofGigabytes(1073741824));  
        return factory.createMultipartConfig();
	}
	
}