package com.corwin.lru;

import java.util.UUID;

public class Node {

    private String uuid;
    private Object value;

    public Node(String uuid, Object value) {
        this.uuid = uuid;
        this.value = value;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "uuid=" + uuid +
                ", value=" + value +
                '}';
    }
}
