using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace diseñoComponentes
{
    public partial class ventanaPrestamos : Form
    {

        string nombre_cliente;
        string[] razas_disponibles = { "Humano mágico", "Humano no mágico", "Demonio", "Elfo", "Angel", "Enano", "Espíritu", "Bestias mágicas" };
        int[] cuotas_disponibles = { 12, 24, 36, 60, 120, 180, 240 };
        string[] lugares_disponibles;
        Dictionary<int, double> intereses_base;


        public ventanaPrestamos(string nombre)
        {
            InitializeComponent();
            nombre_cliente = nombre;
            saludo.Text = saludo.Text + nombre_cliente;

            string listado_ciudades = Properties.Resources.lugar.ToString();
            lugares_disponibles = listado_ciudades.Split(new[] { "\n" }, StringSplitOptions.RemoveEmptyEntries);

            intereses_base = new Dictionary<int, double>();
            int i;
            double intereses;
            for (i = 0, intereses = 3.0; i < cuotas_disponibles.Length; i++, intereses += 0.5)
            {
                intereses_base[cuotas_disponibles[i]] = intereses;
            }
            popularCuotas();
            popularRazas();
            popularCiudades();

        }

        private void Prestamos_Load(object sender, EventArgs e)
        {



        }

        void popularCuotas()
        {
            for (int i = 0; i < cuotas_disponibles.Length; i++)
            {
                cuotas.Items.Add(cuotas_disponibles[i]);
            }
        }


        void popularRazas()
        {
            for (int i = 0; i < razas_disponibles.Length; i++)
            {
                razas.Items.Add(razas_disponibles[i]);
            }
        }


        void popularCiudades()
        {
            for (int i = 0; i < lugares_disponibles.Length; i++)
            {
                lugarOrigen.Items.Add(lugares_disponibles[i]);
            }
        }



        private void BtnVolver_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        int validaciones()
        {
            if ((razas.SelectedIndex <= -1) || (lugarOrigen.SelectedIndex <= -1))
            {
                return 1;
            }
            else
            {
                if (!(montoPrestamo.Text.All(Char.IsDigit)) || (montoPrestamo.Text == "") || (cuotas.SelectedIndex <= -1))
                {
                    return 2;
                }
                else
                {
                    return 0;
                }
            }
        }


        double calcularInteres()
        {
            int cuotas_pedidas = (int)cuotas.SelectedItem;
            string raza_seleccionada = razas.SelectedItem.ToString().ToLower();
            string lugar_seleccionado = lugarOrigen.SelectedItem.ToString().ToLower();
            double interes = intereses_base[cuotas_pedidas];
            if (new[] { "Humano mágico", "Humano no mágico", "Demonio", "Elfo", "Angel", "Enano", "Espíritu", "Bestias mágicas" }.Contains(raza_seleccionada))
            {
                interes += 0.3;
            }
            if (new[] { "rivendell", "tirion", "valinor", "hobbiton", "bree", "gondor" }.Contains(lugar_seleccionado))
            {
                interes -= 0.3;
            }
            return interes;
        }

        private void prestamos_Load_1(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void confirmarSolicitud_Click(object sender, EventArgs e)
        {
            switch (validaciones())
            {
                case 0:
                    {
                        errorProvider1.SetError(datosPersonales, "");
                        errorProvider1.SetError(datosPrestamo, "");
                        double interes_mensual = calcularInteres();
                        double monto_pedido = double.Parse(montoPrestamo.Text);
                        int cuotas_pedidas = (int)cuotas.SelectedItem;
                        double interes_total = monto_pedido * (interes_mensual / 100) * cuotas_pedidas;
                        double monto_a_pagar = monto_pedido + interes_total;
                        string mensaje = "Su préstamo por " + monto_pedido + " en " + cuotas_pedidas + " cuotas se concederá con un interés del " + interes_mensual + "% mensual.\nEl monto final asciende a " + monto_a_pagar;
                        MessageBoxButtons botones = MessageBoxButtons.OK;
                        MessageBox.Show(mensaje, "Cálculo de intereses", botones);
                        break;
                    }
                case 1:
                    {
                        errorProvider1.SetError(datosPersonales, "Debe completar todos los datos personales");
                        errorProvider1.SetError(datosPrestamo, "");
                        break;
                    }
                case 2:
                    {
                        errorProvider1.SetError(datosPrestamo, "Debe ingresar un monto numérico y una cantidad de cuotas");
                        errorProvider1.SetError(datosPersonales, "");
                        break;
                    }
            }
        }

        private void saludo_Click(object sender, EventArgs e)
        {

        }

        private void volver_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
