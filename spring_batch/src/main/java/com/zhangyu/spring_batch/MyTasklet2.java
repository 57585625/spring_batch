package com.zhangyu.spring_batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTasklet2 implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		System.out.println("执行任务222222。。。。。。。。");
		return RepeatStatus.FINISHED;
	}

}
