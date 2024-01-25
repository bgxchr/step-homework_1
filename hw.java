//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. 1.Declarați o variabilă de tip int și atribuiți-i o valoare.

        int a = 1; System.out.println(a);

//2. Declarați o variabilă de tip double și atribuiți-i o valoare.

        double b = 2.5; System.out.println(b);

//3. Declarați o variabilă de tip boolean și atribuiți-i o valoare.

        boolean c = true; System.out.println(c);

//4. Declarați o variabilă de tip String și atribuiți-i o valoare.

        String d = "Mihaela"; System.out.println(d);

//5. Declarați două variabile int și efectuați o adunare între ele.

        int e = 2;  int f = 4; System.out.println(e+f);

//6. Declarați două variabile int și efectuați o scădere între ele.

        int g = 2;  int h = 4; System.out.println(g-h);

//7. Declarați două variabile int și efectuați o înmulțire între ele.

        int i = 2;  int j = 4; System.out.println(i*j);

//8. Declarați două variabile int și efectuați o împărțire între ele.

        int k = 2;  int l = 4; System.out.println(k/l);

//9. Declarați o variabilă int și o variabilă double și efectuați o conversie de la int la double.

        int m = 4; double n = 2.5;
        m = (int) n;
        System.out.println(b);

//10. Declarați o variabilă double și efectuați o conversie de la double la int.
        double o = 2.5; int p = 6;
        o = (int) p;
        System.out.println(a);

//11. Declarați o variabilă de tip int și efectuați incrementarea cu 1.

        int q = 5;

        q++;

        System.out.println("Variabila int după incrementare: " + q);

//12. Declarați o variabilă de tip int și efectuați decrementarea cu 1.

        int r = 7;

        r--;

        System.out.println("Variabila int după decrementare: " + r);

//13. Declarați o variabilă de tip double și efectuați rotunjirea la întreg.

        double s = 7.8;

        long rezultatRotunjire = Math.round(s);

        System.out.println("Variabila double: " + s);
        System.out.println("Rezultatul rotunjirii: " + rezultatRotunjire);


//14. Declarați o variabilă de tip double și efectuați extragerea părții întregi in alta variabila.
        double t = 15.75;

        int parteIntreaga = (int) t;


        System.out.println("Variabila double: " + t);
        System.out.println("Partea întreagă: " + parteIntreaga);


        //15. Declarați o variabilă de tip int și verificați dacă este pară sau impară.

        int u = 23;

        if (u % 2 == 0) {
            System.out.println("Variabila int este pară.");
        } else {
            System.out.println("Variabila int este impară.");

        }
}
}
