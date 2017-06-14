package com.demo.controller.admin;

import javax.annotation.Resource;

import org.quartz.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/task")
public class TaskController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
    
    
	@RequestMapping(value = "/gettask")
	public String getTaskList(){
		
		// 单例变量  
        ApplicationContext ac = new FileSystemXmlApplicationContext(  
                "classpath:spring-mybatis.xml");  
		SchedulerFactoryBean schedulerFactoryBean = (SchedulerFactoryBean) ac.getBean("schedulerFactoryBean");
		
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		log.error("TaskController_scheduler : " + scheduler);
		
		return "tasklist";
	}
 
	
	
	
}
