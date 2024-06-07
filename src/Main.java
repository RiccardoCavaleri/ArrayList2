import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creo una lista di tipo Student
        List<Students> listaStudenti = new ArrayList<>();
        //popolo la lista con i seguenti studenti
        listaStudenti.add(new Students("Paolo", 20));
        listaStudenti.add(new Students("Marco", 19));
        listaStudenti.add(new Students("Roberto", 20));
        listaStudenti.add(new Students("Giulia", 22));
        listaStudenti.add(new Students("Michele", 20));
        listaStudenti.add(new Students("Antonella", 21));
        listaStudenti.add(new Students("Barbara", 18));
        listaStudenti.add(new Students("Andrea", 23));
        listaStudenti.add(new Students("Giulia", 28));
        listaStudenti.add(new Students("Filippo", 29));
        listaStudenti.add(new Students("Marisa", 27));
        listaStudenti.add(new Students("Giovanni", 26));
        //stampo la lista
        System.out.println("lista studenti : " + listaStudenti);
        // tramite Comparator.comparing(::) ordino la lista in questo caso in ordine nominativo (get.name)
        listaStudenti.sort(Comparator.comparing(Students::getName));
        //Stampo la lista ordinata
        System.out.println("lista organizzata per ordine nominativo : " + listaStudenti);
    }
}