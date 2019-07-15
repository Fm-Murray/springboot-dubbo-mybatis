package com.yx.controller;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkController {
    @RequestMapping("/zk")
    public String getZk(){
        Watcher watcher=new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("receive event"+watchedEvent);
            }
        };
       String  value="";
       try {
           ZooKeeper zookeeper=new ZooKeeper("127.0.0.1:2181", 999999, watcher);
           final byte[] data = zookeeper.getData("/node_1", watcher, null);
           value = new String(data);
           zookeeper.close();
       }catch (Exception e){

       }
       return "获取 node_1 节点值为 [" + value + "]";

    }

}
