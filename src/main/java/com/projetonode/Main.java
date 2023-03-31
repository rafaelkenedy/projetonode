package com.projetonode;

public class Main {

    public static void main(String[] args){

        Node<String> node1 = new Node<>("Conteúdo node 1");
        Node<String> node2 = new Node<>("Conteúdo node 2");
        Node<String> node3 = new Node<>("Conteúdo node 3");

        node1.setProximoNode(node2);
        node2.setProximoNode(node3);

        System.out.println(node1);
        System.out.println(node1.getProximoNode());
        System.out.println(node1.getProximoNode().getProximoNode());
        System.out.println(node1.getProximoNode().getProximoNode().getProximoNode());

    }
}
