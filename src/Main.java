abstract class Saeugetier{
    int gewichtKg;
    int gehegeNr;
    String name;

    static int extremitaeten=4;


    public  Saeugetier(String n, int g, int gh)
    {
        name=n;
        gewichtKg=g;
        gehegeNr=gh;
    }
    public void sagMalWas()
    {
        System.out.println("Saeugetier... Ich heisse "+name);
    }
    public static void anzExtr(int neu)
    {
        extremitaeten=neu;
    }
}

class Faultier extends Saeugetier
{
    public Faultier(String n, int g, int gh)
    {
        super(n,g,gh);
    }
    public void sagMalWas()
    {
        System.out.println(name+": Gäääähn");
    }
    public int wievielBeine()
    {
        return extremitaeten;
    }
}

class Loewe extends Saeugetier
{
    public Loewe(String n, int g, int gh)
    {
        super(n,g,gh);
    }
    public void sagMalWas()
    {
        System.out.println(name+": Rrrroaarrrr!");
    }
}




public class Main {


    public static void main(String[] args) {
         System.out.println("Willkommen im Zolli!");
         Faultier s1 = new Faultier("Sid",17,6);
         s1.sagMalWas();
         Loewe s2 = new Loewe("Simba",140,1);
         s2.sagMalWas();
         Schwein napoleon = new Schwein("Napoleon", 200, 4);
         napoleon.sagMalWas();
         Schwein.anzExtr(6);
         System.out.println("Faultier sagt: "+s1.wievielBeine());


    }
}