
package exo.pkg1;

/**
 * Frederick Rat
 * BDML 3
 * TP0:
 * Partie 1 à 3
 */

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        // Partie 1 :
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est vôtre prenom ?");
        prenom = sc.nextLine();
        
        // Partie 2:
        int nb;
        int result;
        int ind;
        //nb=5;
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        result=0;
        
        ind=1;
        while (ind <= nb){
            result=result+ind;
            System.out.println(result);
            ind++;
        }
        
        System.out.println();
        System.out.println("La somme des "+nb+" entiers est : "+result);
        
        // Partie 3 : Calculator
        System.out.println("\n Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo ");
        int operateur=sc.nextInt();
        if (operateur>5 || operateur<0){
            System.out.println("Erreur lors du choix de l'opérateur");
            System.exit(0);
        }
        System.out.println("Choisissez une première valeur");
        float operande1=sc.nextFloat();
        System.out.println("Choisissez une deuxième valeur");
        float operande2=sc.nextFloat();
        float res;
        switch (operateur){
            case 1:
                res = operande1+operande2;
                System.out.println("L'addition de "+operande1+" et "+operande2+" est "+res);
                break;
            case 2:
                res = operande1-operande2;
                System.out.println("La soustraction de "+operande1+" et "+operande2+" est "+res);
                break;
            case 3:
                res = operande1*operande2;
                System.out.println("La multiplication de "+operande1+" et "+operande2+" est "+res);
                break;
            case 4:
                res = operande1/operande2;
                System.out.println("La division de "+operande1+" et "+operande2+" est "+res);
                break;
            case 5:
                res = operande1%operande2;
                System.out.println("Le modulo de "+operande1+" et "+operande2+" est "+res);
                break;
            default:
                System.out.println("Erreur lors du choix de l'opérateur");
        }
          
        
    }
    
}
