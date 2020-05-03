package com.huangmaojie.duomall.goods.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * IdWorker测试类
 *
 * @author huangmaojie
 * @date 2020/5/3
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IdWorkerTest {

    @Test
    public void productId(){
        System.out.println("新生成的id是:");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
        System.out.println(new IdWorker().nextId() + "");
    }
}
