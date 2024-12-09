// See https://aka.ms/new-console-template for more information
using System;

class Program
{

    static void listaNumeri()
    {
        List<int> numeri = new List<int>();


        while (true)
        {
            Console.WriteLine("Inserisci un numero o scrivi 'esci': ");
            string input = Console.ReadLine();

            if (input.ToLower() == "esci")
            {
                break;
            }

            // converte l'input in un numero intero
            int numero = int.Parse(input);
            numeri.Add(numero);

            if (numero % 2 == 0)
            {
                Console.WriteLine($"{numero} è pari");
            }
            else
            {
                Console.WriteLine($"{numero} è dispari");
            }

        }

        // stampa la lista dei numeri
        Console.WriteLine("Vuoi stampare la lista dei numeri pari o dispari?");
        string scelta = Console.ReadLine();

        if (scelta.ToLower() == "pari")
        {
            Console.WriteLine("Lista dei numeri pari: ");
            foreach (int num in numeri)
            {
                if (num % 2 == 0)
                {
                    Console.WriteLine(num);
                }

            }

        }

        if (scelta.ToLower() == "dispari")
        {
            Console.WriteLine("Lista dei numeri dispari: ");
            foreach (int num in numeri)
            {
                if (num % 2 != 0)
                {
                    Console.WriteLine(num);
                }

            }

        }
    }

    static void inserisciFrase()
    {
        while (true)
        {
            Console.WriteLine("Inserisci una frase oppure scrivi 'esci': ");
            string frase = Console.ReadLine();

            if (frase.ToLower() == "esci")
            {
                break;
            }

            string[] parole = frase.Split(' ');
            int contatoreParole = 0;

            Console.WriteLine("Parole nella frase inserita: ");
            foreach (string p in parole)
            {
                // stampa le singole parole della frase
                if (p != "")
                {
                    Console.WriteLine(p);
                    contatoreParole++;

                }

            }

            // stampa il numero delle parole nella frase
            Console.WriteLine("Numero di parole nella frase inserita: ");
            Console.WriteLine(contatoreParole);
        }

    }
    static void Main()
    {
        // listaNumeri();

        // inserisciFrase();
        FabbricaGiocattoli fabbrica = new FabbricaGiocattoli();
        fabbrica.aggiungiGiocattolo(new Giocattolo("Macchinina", "Plastica", 2.50m, 5.00m));
        fabbrica.aggiungiGiocattolo(new Giocattolo("Teddy Bear", "Peluche", 3.00m, 7.50m));
        fabbrica.stampaGiocattoli();
        fabbrica.calcolaGuadagno();
    }
}

public class Giocattolo
{
    public string Nome { get; set; }
    public string Materiale { get; set; }
    public decimal PrezzoProd { get; set; }
    public decimal PrezzoVen { get; set; }

    public Giocattolo(string nome, string materiale, decimal prezzoProd, decimal prezzoVen)
    {
        Nome = nome;
        Materiale = materiale;
        PrezzoProd = prezzoProd;
        PrezzoVen = prezzoVen;
    }

}

public class FabbricaGiocattoli{
    List<Giocattolo> listaGiocattoli = new List<Giocattolo>();

    public void aggiungiGiocattolo(Giocattolo giocattolo){
        listaGiocattoli.Add(giocattolo);
    }

    public void stampaGiocattoli(){
        foreach(Giocattolo g in listaGiocattoli){
            Console.WriteLine($"Nome: {g.Nome}, Materiale: {g.Materiale}, Prezzo Vendita: {g.PrezzoVen}");

        }
    }

    public void calcolaGuadagno(){
        decimal guadagno = 0m;
        foreach(Giocattolo g in listaGiocattoli){
            decimal margine = g.PrezzoVen - g.PrezzoProd;
            guadagno += margine;
        }
        Console.WriteLine("Guadagno totale: " + guadagno);
    }

}




