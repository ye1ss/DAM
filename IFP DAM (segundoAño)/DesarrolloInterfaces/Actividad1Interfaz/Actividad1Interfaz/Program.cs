// See https://aka.ms/new-console-template for more information

using System.ComponentModel.Design;

bool salir = false;
while (!salir) {
    Console.Clear();
    Console.ForegroundColor = ConsoleColor.Blue;
    Console.WriteLine("                                       [--]----------------------------------[--]");
    Console.WriteLine("(\"`-''-/\").___..--''\"`-._" + "              [--]Creado por: Yeismil               [--]");
    Console.WriteLine("`6_ 6  )   `-.  (     ).`-.__.`)" + "       [--]Versión: 1.0                      [--]");
    Console.WriteLine("(_Y_.)'  ._   )  `._ `. ``-..-'" + "        [--]Nombre clave: Actividad1 Interfaz [--]");
    Console.WriteLine("_..`--'_..-_/  /--'_.' ,'" + "              [--]Sigeme en GitHub: ye1ss           [--]");
    Console.WriteLine("(il),-''(li),'  ((!.-'" + "                 [--]----------------------------------[--]");
    Console.WriteLine(" ");
    Console.ForegroundColor = ConsoleColor.Red; Console.WriteLine("Elige que quieres hacer:\n 1.Vocales\n 2.Números\n 3.Semanas\n 4.Tabla multiplicar\n 5.Salir");
    Console.Write("Elige una opción:"); String operacion = Console.ReadLine();

    switch (operacion)
    {
        case "1":
            Console.ForegroundColor = ConsoleColor.Yellow; Console.WriteLine("1.Vocales");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Escribe una frase y te diré cuantas vocales tiene: ");
            String frase = Console.ReadLine();
            int contador = 0;
            string vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
            foreach (char letra in frase)
            {
                if (vocales.Contains(letra))
                {
                    contador++;
                    Console.WriteLine("Vocal encontrada: "+letra);
                }
                
            }
            
            Console.WriteLine("Número de vocales en la frase: "+ contador);
            break;
        case "2":
            Console.ForegroundColor = ConsoleColor.Yellow; Console.WriteLine("2.Números");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Números impares del 0-100");
            int contadorImpares = 0;
            for (int i = 1; i <= 100; i++)
            {
                Console.Write(i+ "-");

                if (i % 2 != 0) // Si el número es impar
                {
                    contadorImpares++;
                }
                if(i% 10 ==0)
                {
                    Console.Write("\n");
                }
            }
            Console.WriteLine("Cantidad de números impares: " + contadorImpares);
            break;
        case "3":
            Console.ForegroundColor = ConsoleColor.Yellow; Console.WriteLine("3.Semanas");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Dime un día de la semana y te diré si es fin de semana o no: ");
            String fraseSemana = Console.ReadLine(); //Poner un String.ToUpper() para que ignore las mayúsculas
            String semanaMayus= fraseSemana.ToUpper();
            if (semanaMayus == "LUNES" || semanaMayus == "MARTES" || semanaMayus == "MIERCOLES" || semanaMayus == "MIÉRCOLES" || semanaMayus == "JUEVES" || semanaMayus == "VIERNES" )
            {
                Console.WriteLine("Es día de semana");
            }
            else if (semanaMayus == "SABADO" || semanaMayus == "SÁBADO" || semanaMayus == "DOMINGO")
            {
                Console.WriteLine("Es fin de semana");
            }
            else
            {
                Console.WriteLine("Error. Escribe un día de la semana válido");
            }
            break;
        case "4":
            Console.ForegroundColor = ConsoleColor.Yellow; Console.WriteLine("4.Tabla de multiplicar");
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("Dime un número y te diré su tabla de multiplicar: ");
            int num = int.Parse(Console.ReadLine());

            if (num < 0)
            {
                Console.WriteLine("Esto no es un número valido escribe un numero mayor que 0");
            }
            else
            {
                for (int i = 1; i <= 10; i++)
                {
                    int resultado = num * i;
                    Console.WriteLine($"{num} x {i} = {resultado}");
                }
            }
            break;
        case "5":
            Console.WriteLine("Has salido.");
            salir = true;
            break;

        default:
            Console.WriteLine("Opción no válida, introduce un número del 1 al 5");
            break;
    }
        if (!salir)
        {
            Console.WriteLine("Pulsa cualquier tecla para volver a consola.");
            Console.ReadKey();
        }
    
}
       

