class Program
{
    static void Main()
    {
        List<ProdottoSoftware> prodotti = new List<ProdottoSoftware>();
        prodotti.Add(new WebApp("web", 10.00m, 100, 100m));
        prodotti.Add(new MobileApp("app", 5.00m, 500, 200m));
        prodotti.Add(new MobileApp("app2", 2.00m, 200, 150m));

        decimal guadagnoTot = 0m;
        foreach(var prod in prodotti){
            guadagnoTot += prod.calcolaGuadagno();
        }

        Console.WriteLine($"Il guadagno totale è: {guadagnoTot}");


    }
}

public abstract class ProdottoSoftware
{
    public string Nome { get; protected set; }
    public decimal PrezzoVendita { get; protected set; }

    public ProdottoSoftware(string nome, decimal prezzoVendita)
    {
        Nome = nome;
        PrezzoVendita = prezzoVendita;
    }

    public abstract decimal calcolaGuadagno();
}

public class WebApp : ProdottoSoftware
{
    private int NumeroUtenti { get; set; }
    private decimal CostoServer { get; set; }

    public WebApp(string nome, decimal prezzoVendita, int numeroUtenti, decimal costoServer)
    : base(nome, prezzoVendita)
    {
        NumeroUtenti = numeroUtenti;
        CostoServer = costoServer;

    }
    public override decimal calcolaGuadagno()

    {
        return (PrezzoVendita * NumeroUtenti) - CostoServer;

    }
}

public class MobileApp : ProdottoSoftware
{
    private int NumeroUtentiMob { get; set; }
    private decimal CostoStore { get; set; }

    public MobileApp(string nome, decimal prezzoVendita, int numeroUtentiMob, decimal costoStore)
    : base(nome, prezzoVendita)
    {
        NumeroUtentiMob = numeroUtentiMob;
        CostoStore = costoStore;

    }
    public override decimal calcolaGuadagno()

    {
        return (PrezzoVendita * NumeroUtentiMob) - CostoStore;

    }
}