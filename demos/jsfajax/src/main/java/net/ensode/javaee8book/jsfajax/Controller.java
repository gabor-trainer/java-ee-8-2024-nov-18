package net.ensode.javaee8book.jsfajax;

import java.io.Serializable;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Controller implements Serializable {

    private String text;
    private int firstOperand;
    private int secondOperand;
    private int thirdOperand;
    private int total;

    public Controller() {
    }

    public void calculateTotal() {
        total = firstOperand + secondOperand + thirdOperand;
    }

    public String getText() {

        return text + "x";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getTotal() {
        return total;
    }

    public void setThirdOperand(int thirdOperand) {
        this.thirdOperand = thirdOperand;
    }

    public int getThirdOperand() {
        return thirdOperand;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
