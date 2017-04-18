/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a12;
import javax.swing.JOptionPane;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double l, w, imc;
        String IMC;
        boolean flag;
        
        w=pedirDato("peso");
        l=pedirDato("altura");
        
        imc= w/Math.pow(l,2);
          if(imc>25){
              JOptionPane.showMessageDialog(null, "Usted sufre de sobrepeso. IMC =" +imc);
          }else if(imc<19){
              JOptionPane.showMessageDialog(null, "Usted sufre de desnutrición. IMC =" +imc);
          }else{
              JOptionPane.showMessageDialog(null,"Usted tiene un IMC normal. IMC =" +imc);
          }
    }
    
    public static double pedirDato(String mensaje){
        boolean flag;
        double dato=0;
            do{
                String datoP = JOptionPane.showInputDialog(null, "Introduce tu " +mensaje);
                try{
                    dato = Double.parseDouble(datoP);
                    flag=false;
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
                    flag=true;
                }
            }while(flag);
            return dato;
    }
    
}
