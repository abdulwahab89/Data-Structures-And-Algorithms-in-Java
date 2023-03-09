
class ArrayStack implements Stack{
    private Object[] a;
    private int size;
    public ArrayStack(int capacity){
        a=new Object[capacity];
    }
    public boolean isEmpty(){
        return (size==0);
    }

    @Override
    public Object peek() {
        if(isEmpty())throw new IllegalStateException("Stack Empty");
        return a[size-1];
    }

    @Override
    public Object pop() {
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }

    private void resize(){
        Object[] aa=a;
        a=new Object[2*aa.length];
        System.arraycopy(aa,0,a,0,size);
    }
    @Override
    public  void push(Object obj) {
        if(size==a.length)resize();
        a[size++]=obj;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String b = " [";
        for(int i=0;i<size;i++)
        {
            b = b +""+(String.valueOf(a[i]))+"] [";
        }

        return b;
    }
    public  ArrayStack reverse(ArrayStack s)
    {
        ArrayStack obj2 = new ArrayStack(s.size());
        int i;
        for( i=s.size();i>0;i--)
        {
            obj2.push(s.a[i]);
        }
        return obj2;
    }
    public boolean Check(Object b,int pos)
    {
        return (a[pos]==b);
    }

}

