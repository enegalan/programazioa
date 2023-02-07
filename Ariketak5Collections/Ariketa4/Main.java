package Ariketak5Collections.Ariketa4;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);
        agenda.addEntry("Iban",new Integer[]{664232670, 664232670});
        agenda.addEntry("Aitor", new Integer[]{644223679, 99542324});
        agenda.addEntry("Aitor", new Integer[]{634499999, 66655555});
        agenda.display();
        System.out.println("Num. de personas con telefono 634499999: " + agenda.numberOfPhones(634499999));
        System.out.println("Telefonos de Iban: " + agenda.searchName("Iban"));
    }
}
