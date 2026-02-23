package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
