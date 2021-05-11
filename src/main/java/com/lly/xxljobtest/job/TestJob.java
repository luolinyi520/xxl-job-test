package com.lly.xxljobtest.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @description: some desc
 * @author: lyluo
 * @date: 2021/05/07
 */
@Component
@Slf4j
public class TestJob {

    @XxlJob("lly-test")
    public void test() throws InterruptedException {
        log.info("处理开始>>>>");
        // 模拟业务操作需要耗时30秒
        TimeUnit.SECONDS.sleep(30);
        log.info("处理结束>>>>");
    }

}
