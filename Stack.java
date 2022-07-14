public class Stack<T> {

    private int size = 0;

    private T[] array;

    public Stack(){
        array=(T[]) new Object[10];
    }

    public void push(T element){
        if(size==array.length){
            T[] newArray=(T[]) new Object[array.length*2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array=newArray;
        }
        array[size]=element;
        size++;
    }

    public T pop(){
        if(size==0){
            return null;
        }
        T element=array[size-1];
        array[size-1]=null;
        size--;
        return element;
    }

    public T peek(){
        if(size==0){
            return null;
        }
        return array[size-1];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void clear(){
        array=(T[]) new Object[10];
        size=0;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=size-1;i>=0;i--){
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
