
package boletin2.pkg2;

import java.util.Scanner;

/**@author mpereirasalgado*/
public class Boletin22 
{
    public static void main(String[] args) 
    {
        float base;
        System.out.println("Calculo del cuadrado\nIntroducir lado: ");
        Scanner dato = new Scanner(System.in);
        base=dato.nextFloat();
        System.out.println("el area del cuadrado es "+Math.pow(base,2));
        
    }
    
}
