using System.Media;

namespace MiInterfaz
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            String momento, mensaje = "";
            if (comboBox1.SelectedItem != null)
            {
                momento = comboBox1.SelectedItem.ToString();
                switch (momento)
                {
                    case "Mañana":
                        mensaje = "Buenos días, Yeismil";
                        BackColor = Color.LightYellow;
                        break;
                    case "Tarde":
                        mensaje = "Buenas tardes, Yeismil";
                        BackColor = Color.LightBlue;
                        break;
                    case "Noche":
                        mensaje = "Buenas noches, Yeismil";
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
            label2.Text = mensaje;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            button1.Text = "Holaa";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            SoundPlayer cancion = new SoundPlayer();
            cancion.SoundLocation = "D:\\YeismilIFP\\1Trimestre\\DesarrolloInterfaces\\MiInterfaz\\RapDeMinecraft.wav";
            cancion.Play();

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (button3_Click != null)
            {
                //Form1.ActiveForm.pictureBox3_Click = new Bitmap("D:\\YeismilIFP\\1Trimestre\\DesarrolloInterfaces\\MiInterfaz\\char.png");
                // D:\\YeismilIFP\\1Trimestre\\DesarrolloInterfaces\\MiInterfaz\\char.png

            }
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            if (button3_Click != null)
            {
                //Form1.ActiveForm.BackgroundImage = new Bitmap("D:\\YeismilIFP\\1Trimestre\\DesarrolloInterfaces\\MiInterfaz\\char.png");
            }
        }
    }
}