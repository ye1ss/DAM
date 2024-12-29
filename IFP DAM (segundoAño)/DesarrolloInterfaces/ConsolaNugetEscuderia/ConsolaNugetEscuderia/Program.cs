using EscuderiasNuget;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolaNugetEscuderia
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Carrera carrera = new Carrera();
            Escuderia resc= carrera.RescuperarEscuderia(TiposEscuderia.Ferrari);
            Console.WriteLine("Piloto: " + resc.Piloto);
            Console.WriteLine("Coche: " + resc.Nombre);
            Console.WriteLine("País: " + resc.Pais);
            
            Console.ReadKey();
        }
    }
}
