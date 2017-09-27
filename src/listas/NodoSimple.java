package listas;

public class NodoSimple<T> {
    private T data;
    private NodoSimple<T> next = null;

    public NodoSimple(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoSimple<T> getNext() {
        return this.next;
    }

    public void setNext(NodoSimple<T> next) {
        this.next = next;
    }
}
