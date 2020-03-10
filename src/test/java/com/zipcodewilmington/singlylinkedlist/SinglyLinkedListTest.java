package com.zipcodewilmington.singlylinkedlist;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList list = new SinglyLinkedList();
    Node node1 = new Node("wah1");
    Node node2 = new Node("wah2");
    Node node3 = new Node("wah3");
    Node node4 = new Node("wah4");
    Node node5 = new Node("wah5");
    Node node6 = new Node("wah6");
    @Test
    public void sizeTest(){
    list.addNode(node1);

    Integer expected = 1;
    Integer actual = list.size();

    Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNodeValue(){

        String expected = "wah1";
        String actual = node1.getNodeInfo();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getFirstNodeWithOneNode(){
    list.addNode(node1);

    Node firstNode = list.getFirstNode();

    Assert.assertEquals(firstNode,node1);
    }

    @Test
    public void getLastNodeWithOneNode(){
        list.addNode(node1);

        Node lastNode = list.getLastNode();

        Assert.assertEquals(lastNode,node1);
    }

    @Test
    public void getLastNodeWithMultipleNodes(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);



        Node lastNode = list.getLastNode();

        Assert.assertEquals(lastNode,node5);
    }

    @Test
    public void getFirstNodeWithMultipleNodes(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);



        Node firstNode = list.getFirstNode();

        Assert.assertEquals(firstNode,node1);
    }

    @Test
    public void removeNodeFromMultipleNodes(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        list.removeNode(5);

        Assert.assertEquals(list.getLastNode(),node4);
    }
    @Test
    public void removeNodeFromMultipleNodes2(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        list.removeNode(4);

        Assert.assertEquals(list.getLastNode(),node5);

    }

    @Test
    public void removeNodeFromMultipleNodes3(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        list.removeNode(4);

        Assert.assertEquals(node3.getNextNode(),node5);

    }

    @Test
    public void findsTest1(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

       Integer actual = list.find(node3);
       Integer expected = 2;

       Assert.assertEquals(actual,expected);
    }

    @Test
    public void findsTest2(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        Integer actual = list.find(node6);
        Integer expected = -1;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void containsTest1(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        Boolean actual = list.contains(node3);
        Boolean expected = true;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void containsTest2(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        Boolean actual = list.contains(node6);
        Boolean expected = false;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void sizeTest1(){
        Integer expected = 0;
        Integer actual = list.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sizeTest2(){
        list.addNode(node1);
        Integer expected = 1;
        Integer actual = list.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sizeTest3(){
        list.addNode(node1);
        list.addNode(node2);
        list.removeNode(1);
        list.removeNode(0);
        Integer expected = 0;
        Integer actual = list.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest1(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        Node expected = node3;
        Node actual = list.get(3);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest2(){
        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        Node expected = null;
        Node actual = list.get(6);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copyTest1(){

        SinglyLinkedList test = list.copy();



        Assert.assertEquals( list.getFirstNode(),test.getFirstNode());
    }
    @Test
    public void copyTest2(){

        SinglyLinkedList test = list.copy();



        Assert.assertEquals( list.getLastNode(),test.getLastNode());
    }
}
