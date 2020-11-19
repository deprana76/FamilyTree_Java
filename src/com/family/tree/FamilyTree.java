package com.family.tree;

public class FamilyTree {

    public static void main(String[] args) {
        String sampleInput="null,0,grandpa|0,1,son|0,2,daughter|0,7,daughter2|1,3,grand-kid1|1,4,grand-kid2|2,5,grand-kid3|5,6,great-grand-kid1|7,8,grand-kid4";
        FamilyTree solution=new FamilyTree();
        solution.printFamilyTree(sampleInput);
    }

    private void printFamilyTree(String sampleInput) {
        String[] nodes= sampleInput.split("\\|");
        Tree tree=new Tree(Node.convertToNode(nodes[0]));
        for(String node : nodes){
            tree.insert(tree.getRoot(),Node.convertToNode(node));
        }
        tree.print();
    }
}
