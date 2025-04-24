package com.surajvanshsv.quadraticequationsolver;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.surajvanshsv.quadraticequationsolver.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a;
    String b ;
    String c ;
    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public MyEquation() {
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    public void soveEquation ( View view){
        // converting strings to integers
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        // calculating the discriminant
         double discrimant = b*b - 4*a*c;


         // Finding the solutions
        double x1,x2;
        if(discrimant > 0){
            // two real and distint root (solution)
            x1 = (-b + Math.sqrt(discrimant)) /(2*a);
            x2 = (-b - Math.sqrt(discrimant)) /(2*a);
            // display the result in text view
            binding.textView.setText("X1 = " + x1 + "\nX2 = " + x2);

        } else if (discrimant < 0){
            binding.textView.setText("no real solution possible ");
        }  else {
            // one real solution exists
            x1=-b / (2*a);
            binding.textView.setText("x="+x1);
        }



    }
}
