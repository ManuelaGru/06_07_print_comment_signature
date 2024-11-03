public class Wohnung
{
    private String ort;         // "Wien"
    private boolean balkon;     //true
    private boolean gefordert;  //false
    private int preis;          //200000
    private int anzZimmer;      //4

    public Wohnung()
    {
        setOrt("Wien");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }

    public Wohnung(String ort, boolean balkon, boolean gefordert, int preis, int anzZimmer)
    {
        setOrt("Wien");
        setBalkon(true);
        setGefordert(true);
        setPreis(10000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String neuort, boolean neubalkon, int neupreis)
    {
        setOrt("Wien");
        setBalkon(true);
        setPreis(150000);
    }
    
    public Wohnung(String neuOrt, boolean neuBalkon)
    {
        setOrt(ort);
        setBalkon(balkon);
    }
    
    public Wohnung(String neuOrt, int neuPreis, boolean neuGefordert)
    {
        setOrt(ort);
        setPreis(preis);
        setGefordert(gefordert);
    }
    
    public Wohnung(String neuOrt)
    {
        setOrt(ort);
    }

    public void setOrt(String ort)
    {
        this.ort = ort;
    }

    public void setBalkon(boolean Balkon)
    {
        this.balkon = balkon;
    }

    public void setGefordert(boolean gefordert)
    {
        this.gefordert = gefordert;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    public void setAnzZimmer(int AnzZimmer)
    {
        this.anzZimmer = anzZimmer;
    }

    public String getOrt()
    {
        return ort;
    }

    public boolean getBalkon()
    {
        return balkon;
    }

    public boolean getGefordert()
    {
        return gefordert;
    }

    public int Preis()
    {
        return preis;
    }
    
    public int AnzZimmer()
    {
        return anzZimmer;
    }

    public void printWohnung()
    {
        System.out.println("Wohnung:\t" + ort + "\t" + balkon + "\t" + gefordert + "\t" + preis + "\t" + anzZimmer + "\t");
    }
}
