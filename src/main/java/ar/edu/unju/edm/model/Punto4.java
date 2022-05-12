package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto4 {

    private int [] nums = new int [8];

    public Punto4() {
    }

    public Punto4(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    
    
}
