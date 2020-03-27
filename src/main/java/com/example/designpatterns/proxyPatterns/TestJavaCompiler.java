package com.example.designpatterns.proxyPatterns;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @ClassName TestJavaCompiler
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 17:01
 * @Version 1.0
 **/
public class TestJavaCompiler {

    public static void main(String[] args) {
        //编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //初始化诊断收集器
        DiagnosticCollector<JavaFileObject> collector = new DiagnosticCollector<>();
        //构建编译任务
//        Boolean result = compiler.getTask(null, manager, collector, options, null,
//                Arrays.asList(javaFileObject));
        collector.getDiagnostics().forEach(item -> System.out.println(item.toString()));
    }
}
