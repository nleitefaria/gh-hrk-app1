package com.mycompany.ghhrkapp1.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> 
{
	private Logger logger = LogManager.getLogger(SpringJpaBootstrap.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) 
	{
		logger.info("Started @ --> " + event.getTimestamp());		
	}
}
