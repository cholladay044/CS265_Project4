public class InventoryQueue extends Inventory implements Cloneable {
    private Inventory[] queue;
    private static final int DEFAULT_CAPACITY = 10;
    private int front, back, count;
    
    InventoryQueue(){
        this.queue = new Inventory[DEFAULT_CAPACITY];
        this.count = this.back = this.front = 0;
    }
    InventoryQueue(int capacity){
        this.queue = new Inventory[capacity];
        this.count = this.back = this.front = 0;
    }
    public void enqueue(Inventory i){
        this.queue[this.back] = i;
        this.back = (this.back++) % this.queue.length;
        this.count++;
    }
    public Inventory dequeue(){
        Inventory results = this.queue[this.front];
        this.front = (this.front++) % this.queue.length;
        return results;
    }
    public Inventory front(){
        return this.queue[this.front];
    }
    public Inventory back(){
        return this.queue[this.back -1];
    }
    public boolean isEmpty(){
        return this.front == this.back;
    }
    public int size(){
        return count;
    }
    public void expandCapacity(){
        Inventory[] larger = new Inventory[this.queue.length * 2];
        
        for (int i=0; i < count; i++){
            larger[i] = this.queue[this.front];
            this.front = (this.front +1) % this.queue.length;
        }
        this.front = 0;
        this.back = this.count;
        this.queue = larger;
    }
    @Override
    public String toString(){
        String results = " :";
        for (int i=0; i<queue.length; i++){
            results = "Serial Number: " +queue[i].getSerialNum()+
                      " Manufacturer Date: " +queue[i].getManufacturerDate()+
                      " Lot Number: " +queue[i].getLotNum();
        }
        return results;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (InventoryQueue)super.clone();
    }
}
