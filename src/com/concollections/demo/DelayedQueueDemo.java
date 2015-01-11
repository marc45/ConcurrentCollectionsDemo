package com.concollections.demo;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * Created by ADMIN on 1/11/2015.
 */
public class DelayedQueueDemo {

    public static void main(String args[]){
        BlockingQueue queue=new DelayQueue();
        //Random random=new Random();
        long currentTime=System.currentTimeMillis();
        queue.add(new DelayedJob("print job",currentTime+5000));
        queue.add(new DelayedJob("populate job",currentTime+10000));
        queue.add(new DelayedJob("balance job",currentTime+15000));

        while(!queue.isEmpty()){
            try{
                DelayedJob job=(DelayedJob)queue.take();
                System.out.println(" taken the job " + job.getName());
               // Thread.sleep(random.nextInt()*1000);
            }catch(Exception error){

            }

        }
    }
}
