// See https://aka.ms/new-console-template for more information
/*
1. Lee una frase y muestra cuántas vocales tiene
2. Muestra los números impares entre el 0 y 100 . Además cuenta cuántos números impares hay
3. Pedir el nombre del día de la semana al usuario y decirle si es fin de semana o no. En caso de error, indicarlo.
4. Realizar la tabla de multiplicar de un número entre 0 y 10 solicitado al usuario, deforma que se visualice de la siguiente forma: 4x1 = 4
*/

//1
Console.WriteLine("Escribeme una frase y te dire cuantas vocales tiene: ");
String frase = Console.ReadLine();
int contador = 0;
string vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
foreach (char letra in frase)
{
    if (vocales.Contains(letra))
    {
        contador++;
    }
}
Console.WriteLine("Número de vocales en la frase: " + contador);

//2
Console.WriteLine("Números impares del 0-100");
int contadorImpares = 0;
for (int i = 1; i <= 100; i++)
{
    Console.WriteLine(i);

    if (i % 2 != 0) // Si el número es impar
    {
        contadorImpares++;
    }
}
Console.WriteLine("Cantidad de números impares: " + contadorImpares);

//3
Console.WriteLine("Dime un dia de la semana y te dire si es fin de semana o no: ");
String fraseSemana = Console.ReadLine();
if (fraseSemana == "Lunes"||fraseSemana == "Martes"||fraseSemana == "Miércoles"||fraseSemana == "Miercoles"||fraseSemana == "Jueves"||fraseSemana == "Viernes"||fraseSemana == "lunes"||fraseSemana == "martes"||fraseSemana == "miercoles"||fraseSemana == "miércoles"||fraseSemana == "Miercoles"||fraseSemana == "jueves"||fraseSemana == "viernes")
{
    Console.WriteLine("Es día de semana");
}
else if(fraseSemana == "Sabado"||fraseSemana == "Domingo"||fraseSemana == "sábado"||fraseSemana == "domingo"||fraseSemana == "sabado")
{
    Console.WriteLine("Es fin de semana");
}
else
{
    Console.WriteLine("Error. Escribe un dia de la semana válido");
}

//4
Console.WriteLine("Dime un número y te diré su tabla de multiplicar: ");
int num = int.Parse(Console.ReadLine());
for (int i = 1; i <= 10; i++)
{
    int resultado = num * i;
    Console.WriteLine($"{num} x {i} = {resultado}");
}

Console.WriteLine("Pulsa cualquier tecla para cerrar");
Console.ReadKey();