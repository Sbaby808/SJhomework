package com.corwin.lru;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        LruLinkedHashMap<String, Object> collector = new LruLinkedHashMap<>(5);
        Node node1 = new Node("A", "node 1");
        Node node2 = new Node("B", "node 2");
        Node node3 = new Node("C", "node 3");
        Node node4 = new Node("D", "node 4");
        Node node5 = new Node("E", "node 5");
        Node node6 = new Node("F", "node 6");

        collector.put(node1.getUuid(), node1);
        collector.put(node2.getUuid(), node2);
        collector.put(node3.getUuid(), node3);
        collector.put(node4.getUuid(), node4);
        collector.put(node5.getUuid(), node5);
        collector.put(node6.getUuid(), node6);
        collector.put(node1.getUuid(), node1);
        collector.put(node2.getUuid(), node2);
        collector.put(node3.getUuid(), node3);
        collector.put(node4.getUuid(), node4);
        collector.put(node5.getUuid(), node5);
        collector.put(node6.getUuid(), node6);
        collector.put(node1.getUuid(), node1);
        collector.put(node2.getUuid(), node2);
        collector.put(node3.getUuid(), node3);
        collector.put(node4.getUuid(), node4);
        collector.put(node5.getUuid(), node5);
        collector.put(node6.getUuid(), node6);

        System.out.println(collector.get(node3.getUuid()));
    }
}
