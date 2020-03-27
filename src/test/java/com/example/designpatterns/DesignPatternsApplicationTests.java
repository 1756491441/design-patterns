package com.example.designpatterns;

import com.example.designpatterns.singletonPatterns.hungrySingleton.HungrySingleton;
import com.example.designpatterns.singletonPatterns.lazySingleton.LazySingleton;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.task.support.ConcurrentExecutorAdapter;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsApplicationTests {

    @Test
    public void testHungrySingleton(){
        HungrySingleton hungrySingletonOne = HungrySingleton.getInstance();
        HungrySingleton hungrySingletonTwo = HungrySingleton.getInstance();

        System.out.println(hungrySingletonOne);
        System.out.println(hungrySingletonTwo);
        System.out.println(hungrySingletonOne == hungrySingletonTwo);
    }



}
