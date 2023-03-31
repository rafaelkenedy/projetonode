package com.projetonode;

public class Node<T> {

    private T conteudo;
    private Node<T> proximoNode;

    public Node(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNode = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximoNode(Node<T> proximoNode) {
        this.proximoNode = proximoNode;
    }

    public Node getProximoNode() {
        return proximoNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}