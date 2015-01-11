package com.concollections.demo;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by ADMIN on 1/11/2015.
 */
public class DelayedJob implements Delayed {

    private String name;
    private long scheduledTime;

    @Override
    public long getDelay(TimeUnit unit) {
        long delay=this.scheduledTime-System.currentTimeMillis();
        long returnValue=unit.convert(delay,TimeUnit.MILLISECONDS);

        return returnValue;
    }

    public DelayedJob(String name, long scheduledTime) {
        this.name = name;
        this.scheduledTime = scheduledTime;
    }

    @Override
    public int compareTo(Delayed o) {
      if(this.getDelay(TimeUnit.MILLISECONDS)>o.getDelay(TimeUnit.MILLISECONDS)){
          return 1;
      }else{
          return -1;
      }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(long scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
