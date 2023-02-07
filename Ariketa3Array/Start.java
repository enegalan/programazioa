package Ariketa3Array;

public class Start {
       public static void main(String[] args){
           Parrot[] parrots1 = new Parrot[2];
           Parrot[] parrots2 = new Parrot[2];

           Parrot[] parrots = new Parrot[parrots1.length + parrots2.length];

           for (int i = 0; i < parrots1.length; i++){
               parrots1[i].setData("Parsero");
               parrots1[i] = new Parrot(5,Bird.sex.F, Parrot.region.W, "rojo");

           }
           for (int i = 0; i < parrots1.length; i++){
               parrots2[i].setData("Pepe");
               parrots2[i] = new Parrot(5,Bird.sex.F, Parrot.region.W, "rojo");

           }

           int j = 0;
           int k = 0;
           for (int i = 0; i < parrots.length; i++){
            if(i % 2 == 0){
                parrots[i] = parrots1[j++];
            }
            else {
                parrots[i] = parrots2[k++];
            }
           }
           for (int i = 0; i < parrots.length; i++){
               parrots[i].sing();
           }
           for (int i = 0; i < parrots.length; i++){
               if (parrots[i].names.getBirdName().substring(0,3) == "Par"){
                    parrots[i].sing();
               }
           }
       }

}
