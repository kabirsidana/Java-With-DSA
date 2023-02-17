public class CustomArrayList {
    static int i = 0;
    int[] list;
    int defaultsize = 5;

    CustomArrayList() {
        this.list = new int[defaultsize];

    }

    public void pleaseadd(int num) {
        if (isfull(list)) {
            list = doublekaro(list);
        }
        list[i] = num;
        i++;
    }

    public void pleasechange(int newint, int index) {
        list[index]=newint;
    }

    private boolean isfull(int[] list) {
        if (list.length == i) {
            return true;
        }
        return false;
    }

    private int[] doublekaro(int[] list) {
        int temp[] = new int[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        return temp;
    }

    public void pleaseshow() {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
        }
        System.out.print("]");
        System.out.println(" \n The size is " + list.length);
    }
}
