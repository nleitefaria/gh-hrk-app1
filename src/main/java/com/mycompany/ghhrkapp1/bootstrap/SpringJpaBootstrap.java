package com.mycompany.ghhrkapp1.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.mycompany.ghhrkapp1.entity.Departments;
import com.mycompany.ghhrkapp1.entity.Jobs;
import com.mycompany.ghhrkapp1.entity.Products;
import com.mycompany.ghhrkapp1.repositories.DepartmentRepository;
import com.mycompany.ghhrkapp1.repositories.JobRepository;
import com.mycompany.ghhrkapp1.repositories.ProductRepository;
import java.math.BigDecimal;

@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> 
{
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	JobRepository jobRepository;

	private Logger log = LogManager.getLogger(SpringJpaBootstrap.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) 
	{
		loadProducts();
		loadDepartments();
		loadJobs();
	}

	private void loadProducts() 
	{
		Products shirt = new Products();
		shirt.setDescription("Spring Framework Guru Shirt");
		shirt.setPrice(new BigDecimal("18.95"));
		shirt.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
		shirt.setProductId("235268845711068308");
		productRepository.save(shirt);

		Products mug = new Products();
		mug.setDescription("Spring Framework Guru Mug");
		mug.setImageUrl("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_coffee_mug-r11e7694903c348e1a667dfd2f1474d95_x7j54_8byvr_512.jpg");
		mug.setProductId("168639393495335947");
		mug.setPrice(new BigDecimal("11.95"));
		productRepository.save(mug);
	}
	
	private void loadDepartments() 
	{		
		Departments department1 = new Departments(1, "Dept 1");
		departmentRepository.save(department1);
		
		Departments department2 = new Departments(2, "Dept 2");
		departmentRepository.save(department2);		
	}
	
	private void loadJobs()
	{
		Jobs job1 = new Jobs("ceo", "CEO");
		jobRepository.save(job1);
		
		Jobs job2 = new Jobs("cio", "CIO");
		jobRepository.save(job2);
		
		Jobs job3 = new Jobs("cto", "CTO");
		jobRepository.save(job3);	
	}

}
