using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Text;

namespace diseñoComponentes
{
    public partial class ventana : Form
    {
        private void button2_Click(object sender, EventArgs e)
        {
            using (ventanaPrestamos ventanaPrestamos = new ventanaPrestamos(nombre.Text))
                ventanaPrestamos.ShowDialog();
        }
        public ventana()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            solicitarPrestamo.Enabled = false;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        public void controlBotones()
        {
            if (nombre.Text.Trim() != string.Empty && nombre.Text.All(char.IsLetter))
            {
                solicitarPrestamo.Enabled = true;
                errorProvider1.SetError(nombre, "");
                solicitarPrestamo.BackColor = Color.DarkOrange;
                solicitarPrestamo.ForeColor = Color.Green;
            }
            else
            {
                if (!(nombre.Text.All(char.IsLetter)))
                {
                    errorProvider1.SetError(nombre, "El nombre solo debe contener letras");
                }
                else
                {
                    errorProvider1.SetError(nombre, "Debe incluir su nombre");
                }
                solicitarPrestamo.Enabled = false;
                nombre.Focus();
            }
        }

        private void nombre_TextChanged(object sender, EventArgs e)
        {
            controlBotones();
        }


    }
}