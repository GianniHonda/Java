/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author gigi_
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gianni";
        String nome2 = "Gianni";
        String nome3 = new String("Gianni");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
              
        
    }
    
}
