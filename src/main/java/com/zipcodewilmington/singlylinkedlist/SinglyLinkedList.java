package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
   private Integer size;
    Node first;
    Node last;

    public SinglyLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;

    }

    public Node getFirstNode(){
        return this.first;

    }

    public Node getLastNode(){
        return this.last;

    }



    public void addNode(Node node){
        if(!(first == null)){
            this.last.setNextNode(node);
            last=node;
            size++;
        }
        if(first == null){
            first = node;
            last = node;
            size++;
        }

    }

    public void removeNode(Integer index){

        Node currentNode = first;
        Node currentMinusOne = last;
        if(!(currentNode.getNextNode() == null)) {

            for (int i = 0; i < index-1 ; i++) {
                currentMinusOne = currentNode;
                currentNode = currentNode.getNextNode();
            }
            if(currentNode.getNextNode() == null){

                last = currentMinusOne;
                size--;
            }else {
                currentMinusOne.setNextNode(currentNode.getNextNode());
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                size--;
            }
        }
    }


    public int find(Node lookingFor){
        Node currentNode = first;
        for (int i = 0; i <size ; i++) {
            if(lookingFor.equals(currentNode)){
                return i;
            } else{
                currentNode = currentNode.getNextNode();
            }
        }
        return -1;
    }

    public Boolean contains(Node lookingFor){
        Node currentNode = first;
        for (int i = 0; i <size ; i++) {
            if(lookingFor.equals(currentNode)){
                return true;
            } else{
                currentNode = currentNode.getNextNode();
            }
        }
        return false;



    }

    public Integer size(){
        return this.size;
    }

    public Node get(Integer index){
        Node currentNode=first;
        for (int i = 0; i <= index ; i++) {
            if(i+1 == index){
                return currentNode;
            }
            currentNode=currentNode.getNextNode();

        }
        return null;
    }
}
