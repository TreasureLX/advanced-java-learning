package com.lx.learning.interviewquestions;

import com.sun.management.ThreadMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

/**
 * Created by Administrator on 2019/4/7.
 */
public class AllThreadStackQuestions {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean= (ThreadMXBean)ManagementFactory.getThreadMXBean();
        long[] threadIds=threadMXBean.getAllThreadIds();

        for(long id:threadIds){
            ThreadInfo threadInfo=threadMXBean.getThreadInfo(id);
            System.out.println(threadInfo.toString());
            long bytes=threadMXBean.getThreadAllocatedBytes(id);
            System.out.println(bytes/1024);
        }
    }
}
