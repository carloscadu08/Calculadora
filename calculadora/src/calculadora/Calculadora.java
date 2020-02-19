
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    public static void main(String[] args) {
        String firstnumber = 
              JOptionPane.showInputDialog("Digite um numero");
        System.out.println("Escolha a op. desejada: ");
        String mult="*";
        String divi="/";
        String som="+";
        String sub="-";
        int res = 0;
        
        String op = 
              JOptionPane.showInputDialog("Escolha a operação");
      
        String secondtnumber = 
              JOptionPane.showInputDialog("Digite o segundo numero");
         int number1= Integer.parseInt(firstnumber);
         int number2= Integer.parseInt(secondtnumber);
         if(op.equals("+")){
              res= number1+ number2;
             
         }else{
             if(op.equals("-")){
               res = number1- number2;
             }else{
                if(op.equals("*")){
                   res = number1*number2;
                }else{
                     if(op.equals("/")){
                        res = number1/number2;
                     }else{
                         JOptionPane.showMessageDialog(null,"Operação invalida. Resolva com o professor C. Carlão","aaa",+ JOptionPane.PLAIN_MESSAGE);
                     }
                }
                
             }
             
         }
         JOptionPane.showMessageDialog(null,"o resultado é   ="+res+"     ", "aaa", JOptionPane.PLAIN_MESSAGE);
    }
    
}
