package by.itstep.aniskovich.java.lesson22.model.entity;

public class Array {
    public int[] array;

    public Array(int[] array) {
        this.array = new int[0];
    }

    public void add(int value) {
        int size = array.length + 1;
        int[] temp = new int[size];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[array.length] = value;

        array = temp;
    }

    public void remove(int index) {
        if (index >= 0 && index < array.length) {
            int size = array.length - 1;
            int[] temp = new int[size];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    temp[j++] = array[i];
                }
            }

            array = temp;
        }


    }

    public String convert(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(" ");
        }

        return array.length != 0 ? builder.toString() : "Container is empty";
    }

}
