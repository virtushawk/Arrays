package edu.epam.array.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberArray {

   private final List<Integer> array;

   public NumberArray() {
       array = new ArrayList<>();
   }

    public NumberArray(List<Integer> array) {
        this.array = array;
    }

    public NumberArray(Integer... array){
       List<Integer> list = Arrays.asList(array);
       this.array = new ArrayList<>(list);
    }

    public List<Integer> getArray() {
        return new ArrayList<>(array);
    }

    public int get(int index){
       return array.get(index);
    }

    public void set(int index,int number){
       array.set(index,number);
    }

    public void add(int number){
       array.add(number);
    }

    public int size(){
       return array.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberArray{");
        sb.append("array=").append(array);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray that = (NumberArray) o;
        return array.equals(that.array);
    }

    @Override
    public int hashCode() {
        int hashcode = 1 ;
        for (Integer integer :array) {
            hashcode = 31 * hashcode + integer;
        }
        return  hashcode;
    }
}
