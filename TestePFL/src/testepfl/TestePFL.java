/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepfl;

/**
 *
 * @author Marcio
 */
public class TestePFL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaDin P = new PilhaDin();

        FilaDin F = new FilaDin();

        ListaOrd L = new ListaOrd();

        for (int i = 3; i < 8; i += 3) {
            F.enqueue(i + 1);

            P.push(i - 1);

        }

        while (!F.qIsEmpty()) {
            L.ins(F.dequeue());
        }

        while (!P.isEmpty()) {
            L.ins(P.pop());
        }

        L.print();
    }

}
