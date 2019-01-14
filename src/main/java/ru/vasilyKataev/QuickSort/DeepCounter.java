package ru.vasilyKataev.QuickSort;

public class DeepCounter {
    private int counter;

    private String getDeep() {
        if(counter == 0){
            return "qsort";

        }else{
            StringBuffer stringBuffer = new StringBuffer();
            for(int i = 0;i < counter; i++) stringBuffer.append("-");
                return stringBuffer.toString()+"qsort";
        }
    }

    public void in(int left, int right) {
        System.out.println(this.getDeep() + String.format("(array, %d, %d) IN" , left, right));
        counter++;
    }

    public void out(int left, int right) {
        counter--;
        System.out.println(this.getDeep() + String.format("(array, %d, %d) OUT" , left, right));
    }
}
