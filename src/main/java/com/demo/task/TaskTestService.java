package com.demo.task;

import org.springframework.stereotype.Service;

@Service("taskTestService")
public class TaskTestService {

	public void test(){
			//for(int i=0;i<10;i++){
			System.out.println(";定时任务方法 : " + Thread.currentThread().getId());
			//}
			
	}
	
}
