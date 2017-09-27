package listas;

public class ListaEnlazada<T> {
    private NodoSimple<T> head = null;
    private int size = 0;

    public ListaEnlazada() {
    }

    public NodoSimple<T> getHead() {
        return this.head;
    }

    public void setHead(NodoSimple<T> head) {
        this.head = head;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return this.getHead() == null;
    }

    public int size() {
        return this.getSize();
    }

    public void insertFirst(T data) {
        NodoSimple<T> newNode = new NodoSimple<>(data);
        newNode.setNext(this.getHead());
        this.setHead(newNode);
        this.setSize(this.size++);
    }

    public NodoSimple<T> deleteFirst() {
        if(this.getHead() != null) {
            NodoSimple<T> temp = this.getHead();
            this.setHead(this.getHead().getNext());
            this.setSize(this.size++);
            return temp;
        } else {
            return null;
        }
    }

    public void displayList() {
        NodoSimple<T> current = this.getHead();
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }

    }

    public NodoSimple<T> find(T value) {
    	NodoSimple<T> current = this.getHead();
    	while(current!= null){
            if(current.getData().equals(value)) {
                return current;
            }else{
            	current = current.getNext();
            }
        }

        return null;
    }

    public NodoSimple<T> delete(T value) {
        NodoSimple<T> current = this.getHead();
        NodoSimple<T> previous = this.getHead();

        while(current.getData().equals(value)){
            if(current.getData().equals(value)) {
                if(current == this.getHead()) {
                    this.setHead(this.getHead().getNext());
                } else {
                    previous.setNext(current.getNext());
                }

                return current;
            }

            previous = current;
            current = current.getNext();
        }

        return null;
    }
}