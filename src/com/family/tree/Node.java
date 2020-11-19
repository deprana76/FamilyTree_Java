package com.family.tree;

import java.util.LinkedList;
import java.util.List;

//Node structure
class Node{
    private Integer id;
    private Integer parentId;
    private String name;
    //Kids of the current node
    private List<Node> nodes;

    public Node(){
        nodes=new LinkedList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Node convertToNode(String input) {
        String[] split = input.split(",");
        Node node=new Node();
        if(!split[0].equals("null")){
            node.setParentId(Integer.valueOf(split[0]));
        }
        node.setId(Integer.valueOf(split[1]));
        node.setName(split[2]);
        return node;
    }
}
