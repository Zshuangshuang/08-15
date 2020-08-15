/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-15
 * Time:20:58
 **/

class MyArrayList{
    private int[] elem;
    private int usedSize;
    public final  int SIZE = 30;

    public MyArrayList() {
        this.elem = new int[SIZE];
        this.usedSize = 0;
    }
    public void add(int pos,int data){
        if (pos < 0 || pos > this.usedSize){
            return;
        }
        for (int i = this.usedSize; i <= pos ; i++) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind){
                return i;
            }
        }
        return  -1;
    }
    public void remove(int toRemove){
        int ret = search(toRemove);
        if (ret == -1){
            return;
        }
        for (int i = ret; i <= this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


        }

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,25);
        myArrayList.add(2,40);
        myArrayList.display();
        myArrayList.remove(25);
        myArrayList.display();
    }
}
