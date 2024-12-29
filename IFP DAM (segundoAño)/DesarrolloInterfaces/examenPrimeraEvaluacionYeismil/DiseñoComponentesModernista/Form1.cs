using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DiseñoComponentesModernista
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
        private void btnCerrar_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnReservar_Click(object sender, EventArgs e)
        {
            
                //textBox1
                if (textBox1.Text.Trim() != string.Empty && textBox1.Text.All(char.IsLetter))
                {
                    btnReservar.Enabled = true;
                    errorProvider1.SetError(textBox1, "");
                    btnReservar.ForeColor = Color.Green;
                }
                else
                {
                    errorProvider1.SetError(textBox1, "El apellido solo debe contener letras");

                    MessageBox.Show("El nombre solo debe contener letras");
                }

                //textBox2
                if (textBox2.Text.Trim() != string.Empty)
                {
                    btnReservar.Enabled = true;
                    errorProvider1.SetError(textBox2, "");
                    btnReservar.ForeColor = Color.Green;
                }
                else
                {
                    errorProvider1.SetError(textBox2, "El nombre solo debe contener letras");
                    MessageBox.Show("El apellido solo debe de contener letras");
                }

                //textBox3
                if (textBox3.Text.Trim() != string.Empty)
                {
                    btnReservar.Enabled = true;
                    errorProvider1.SetError(textBox3, "");
                    btnReservar.ForeColor = Color.Green;
                }
                else
                {
                    errorProvider1.SetError(textBox3, "El email debe contener @");
                }

            MessageBox.Show("Entrada reservada");

        }
    }
}
/*

*/