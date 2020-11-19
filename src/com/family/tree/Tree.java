package com.family.tree;

import java.util.Objects;

public class Tree{
    //Root element
    private Node root;

    public Tree(Node root){
        this.root=root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(Node node, Node nextValue){
        if(Objects.equals(node.getId(), nextValue.getParentId())){
            //add to the current node if id is same as parent id
            node.getNodes().add(nextValue);
        }else{
            //Iterate over the next set of nodes and set the node if id matches with parent id
            if(!node.getNodes().isEmpty()) {
                for (int i = 0; i < node.getNodes().size(); i++) {
                    insert(node.getNodes().get(i), nextValue);
                }
            }
        }
    }

    public void print(){
        printData(root,"");
    }

    public void printData(Node node,String indent) {
        if (node != null) {
            System.out.println(indent+"|-"+node.toString());
            for (int i = 0; i < node.getNodes().size(); i++) {
                printData(node.getNodes().get(i),indent+"    ");
            }

        }
    }
}
