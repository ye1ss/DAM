// See https://aka.ms/new-console-template for more information
using System.Drawing;

namespace DocumentacionCordenadas
{
    class Program
    {
        static void Main(string[] args)
        {

         /*este es un tipo
         * de comentario
         *multilínea*/

            Point myPoint = new Point(5, 21);
            Console.WriteLine(myPoint.GetCoordinates());
            Console.WriteLine(myPoint.GetSimpleCoordinates());
            Console.ReadKey();
        }
    }

    /// <summary>
    /// Clase Point Yeismil
    /// </summary>
    
    public class Point
    {
        
        public int X { get; set; }
        public int Y { get; set; }

        /// <summary>
        /// Parámetros de x e y
        /// </summary>
        /// <param name="x"></param>
        /// <param name="y"></param>
        public Point(int x, int y)
        {
            X = x;
            Y = y;
        }

        /// <summary>
        /// 
        /// <example> Por ejemplo: </example>
        /// <code>
        /// Point p= new Point(3, 5);
        /// p.GetCordinates();
        /// </code>
        /// <see cref=">GetCoordinates"/>
        /// </summary>
        /// <returns></returns>
        public string GetCoordinates()
        {
            return $"({X},{Y})";
        }
        public string GetSimpleCoordinates()
        {
            return $"({X},{Y})";
        }

        

        ///Este es otro tipo
        
        
        
        

    }
}