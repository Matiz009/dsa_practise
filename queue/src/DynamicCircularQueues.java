public class DynamicCircularQueues extends CircularQueues {
    public DynamicCircularQueues(){
        super();
    }
    public DynamicCircularQueues(int item){
        super(item);
    }
    public boolean insert(int item){
        if (isFull()){
            int [] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i) % data.length];
            }
            front=0;
            end= data.length;
            data=temp;
            size++;
        }

        return super.insert(item);
    }
}