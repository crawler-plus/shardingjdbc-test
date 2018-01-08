package com.yb.shardingjdbctest.conf;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSingle {

    private static ExecutorSingle sThreadPoolManager = new ExecutorSingle();

    /*
     * 线程池单例创建方法
     */
    public static ExecutorSingle newInstance() {
        return sThreadPoolManager;
    }

    private final ExecutorService mThreadPool = Executors.newCachedThreadPool();

    /*
         * 向线程池中添加任务方法
         */
    public void addExecuteTask(Runnable task) {
        if (task != null) {
            mThreadPool.execute(task);
        }
    }

    /*
         * 向线程池中添加任务方法
         */
    public Future<?> addSubmitTask(Callable task) {
        if (task != null) {
            Future<?> submit = mThreadPool.submit(task);
            return  submit;
        }
        return null;
    }
}
