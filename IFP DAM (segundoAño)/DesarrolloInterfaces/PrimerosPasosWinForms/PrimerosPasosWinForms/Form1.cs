using System.Diagnostics.Eventing.Reader;
using System.Windows.Forms;

namespace PrimerosPasosWinForms
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            /*
            MessageBox.Show("Hola mundo con WinForm"); //Saca una ventanita con el mensaje
            Application.Exit(); //Para que al darle al aceptar del message box se cierre sola la ventana
            */
        }

        private void label1_Click(object sender, EventArgs e)
        {
            //label5.Text = "Saludo";
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            String momento, mensaje = "", titulo;
            if (comboBox1.SelectedItem != null)
            {
                momento = comboBox1.SelectedItem.ToString();
                switch (momento)
                {
                    case "mañana":
                        mensaje = "Buenos días";
                        BackColor = Color.LightYellow;
                        break;
                    case "tarde":
                        mensaje = "Buenas tardes";
                        BackColor = Color.LightBlue;
                        break;
                    case "noche":
                        mensaje = "Buenas noches";
                        BackColor = Color.LightSlateGray;
                        break;
                    default:
                        mensaje = "Buenas...";
                        break;
                }
            }
            else
            {
                mensaje = "Buenas...";
                BackColor = Color.White;

            }
            titulo = ",";
            if (radioButtonSr.Checked == true)
            {
                titulo = titulo + "Sr. ";
            }
            else if (radioButtonSra.Checked == true)
            {
                titulo = titulo + "Sra. ";
            }
            else if (radioButtonSrta.Checked == true)
            {
                titulo = titulo + "Srta. ";
            }
            

            label5.Text = mensaje + ", " + textBox1.Text;



        }



        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {


        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}