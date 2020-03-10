package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

public class Node {
    String nodeInfo;
    Node nextNode;

    public Node(String nodeInfo){
        this.nextNode = null;
        this.nodeInfo = nodeInfo;

    }

    public String getNodeInfo(){
        return this.nodeInfo;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node){
        this.nextNode=node;
    }


}

