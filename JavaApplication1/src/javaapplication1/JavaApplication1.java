
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in); 
        System.out.println("Entrer votre age");
        float age = sc.nextFloat();
        System.out.println(age);
        System.out.println("Entrer l'âge de votre père et de votre mère");
        float age1 = sc.nextFloat();
        float age2 = sc.nextFloat();
        System.out.println("Voici le resultats de l'addition de l'âge de vos parents");
        System.out.println(age1 + age2);
        System.out.println("Voici le resultats de la multiplication de l'âge de vos parents");
        System.out.println(age1*age2);
        System.out.println("Voici le resultats de la division de l'âge de vos parents");
        System.out.println(age1/age2);



    }
    
}
