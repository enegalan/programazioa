package Ariketak5Collections.Ariketa4;

import java.util.*;

public class Agenda {
    private Map<String, Integer[]> agenda = new HashMap<String, Integer[]>();
    private String nombre;
    private Integer[] telefono;
    private int maxEntradas;
    public Agenda(int max){
        this.maxEntradas = max;
    }
    public void addEntry(String name, Integer[] phoneNumbers) {
        Scanner sc = new Scanner(System.in);
        if (agenda.size() == maxEntradas) {
            System.out.println("Agenda completa");
        }
        else if (agenda.containsKey(name)) {
            System.out.print("Su agenda contiene estos números de teléfono para " + name + ": ");
            for (int i = 0; i < agenda.get(name).length; i++) {
                System.out.print(agenda.get(name)[i]);
                // Para no poner coma al final.
                if (i != agenda.get(name).length - 1) {
                    System.out.print(", ");
                }
                else{
                    System.out.println(".");
                }
            }
            System.out.println("\n¿Quieres reemplazarlos por otros nuevos? Sí (1) o no (0)");
            int res = sc.nextInt();
            if (res == 0 || res == 1){
                if (res == 1){
                    agenda.put(name, phoneNumbers);
                    System.out.println("Zenbakiak sartuta.");
                }
            }
            else{
                System.out.println("Ez duzu erantzun egoki sartu.");
            }

        } else {
            agenda.put(name, phoneNumbers);
        }
    }
    public void display(){
        Iterator<String> it = agenda.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            Integer[] telefonoa = agenda.get(key);
            System.out.println(key + " ");
            for (int i = 0; i < telefonoa.length;i++){
                System.out.println(telefonoa[i]+" ");
            }
        }
    }
    public String searchName(String name){
        Integer[] telefonoak = agenda.get(name);
        String res = "";
        if (telefonoak == null){
            System.out.println(name +" is not in the agenda");
        }
        else {
            for (Integer telefonoa : telefonoak){
                res+=telefonoa+" ";
            }
        }
        return res;
    }
    public int numberOfPhones(Integer num){
        int cont = 0;
        Iterator<String> it = agenda.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            Integer[] telefonoak = agenda.get(key);
            for (int i = 0; i < telefonoak.length;i++){
                if (telefonoak[i].equals(num)){
                    cont++;
                }
            }
        }
        return cont;
    }
}
