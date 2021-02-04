import java.util.*;
// OVERRIDE THE METHODS OF LINKED LIST 
class LinkedList<E> implements IList<E>
{

    public class Element
    {

        public Element(E e)
        {

            this.value = e;

        }

        E value;
        Element next = null;

        @Override
        public String toString()
        {
            StringBuilder s = new StringBuilder();

            s.append(this.next);
//            StringBuilder s = new StringBuilder();
//            return s.toString();
            return s.toString();

        }

    }

    Element sentinel;
    E head;

    private class InnerIterator implements Iterator<E>
    {

        Element elem;

        public InnerIterator()
        {

            elem = sentinel;

        }


        @Override
        public boolean hasNext()
        {

            return elem.next != null;

        }


        @Override
        public E next() throws NullPointerException
        {

            if (hasNext())
            {
                elem = elem.next;
                return elem.value;
            }
            else throw new NullPointerException("InnerIterator.next");

        }

    }

    public LinkedList()
    {

        sentinel = new Element(null);

    }


    @Override
    public Iterator<E> iterator()
    {

        return new InnerIterator();

    }


    @Override
    public ListIterator<E> listIterator()
    {

        throw new UnsupportedOperationException();

    }


    @Override
    public boolean add(E e)
    {
//        if (size() == 0)
//            head = e;
//        else
        add(size(), e);
        return true;

    }


    @Override
    public void add(int index, E e) throws NoSuchElementException
    {

        if (index > size()) throw new NoSuchElementException();
        Element elem = sentinel;
        for (int x = 0; true; x++)
        {
            if (x == index)
            {
                Element temp = elem.next;
                elem.next = new Element(e);
                elem.next.next = temp;
                return;
            }
            else elem = elem.next;
        }
    }


    @Override
    public void clear()
    {

        sentinel.value = null;
        sentinel.next = null;

    }


    @Override
    public boolean contains(E element)
    {

        for (E e : this) {
            if (e == element) return true;
        }
        return false;

    }


    @Override
    public E get(int index) throws NoSuchElementException
    {

        if (index >= size()) throw new NoSuchElementException("get");

        Iterator<E> it = this.iterator();
        for (int x = 0; true; x++)
        {
            if (x == index) return it.next();
            it.next();
        }

    }


    @Override
    public E set(int index, E element) throws NoSuchElementException
    {

        E temp = remove(index);
        add(index, element);
        return temp;

    }


    public int indexOf(E element)
    {

        Iterator<E> it = this.iterator();
        for (int x = 0; it.hasNext(); x++)
        {
            if (it.next().equals(element)) return x;
        }
        return -1;

    }


    @Override
    public boolean isEmpty()
    {

        return sentinel.value == null && sentinel.next == null;

    }


    @Override
    public E remove(int index) throws NoSuchElementException
    {

        if (index >= size()) throw new NoSuchElementException();

        Element elem = sentinel;
        for (int x = 0; true; x++)
        {
            if (x == index)
            {
                E temp = elem.next.value;
                elem.next = elem.next.next;
                return temp;
            }
            elem = elem.next;
        }

    }


    @Override
    public boolean remove(E e)
    {

        int temp = indexOf(e);
        if (temp == -1) return false;
        remove(temp);
        return true;

    }


    @Override
    public int size()
    {

        Iterator<E> it = this.iterator();
        int x = 0;
        for (; it.hasNext(); x++) it.next();
        return x;

    }
    public LinkedList<E> reverse(){
        LinkedList<E> res = new LinkedList<>();
        Iterator<E> iterator = new InnerIterator();
        E currele = iterator.next();
        E nextElement = iterator.next();
        for (int i = 0; i < size();) {
            while (iterator.hasNext()) {
                E temp = currele;
                currele = nextElement;
                nextElement = temp;
                res.add(currele);
                iterator.next();
            }
            currele = iterator.next();
        }

        return res;
    }
    private void swap(E element1, E element2){
        E temp = element1;
        element1 = element2;
        element2 = temp;
    }


    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            s.append(this.get(i)).append(" ");
        }
        return s.toString();

    }

}