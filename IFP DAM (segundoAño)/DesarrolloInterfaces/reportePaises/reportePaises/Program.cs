using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data;
namespace reportePaises
{

    public partial class Form : Form
    {
        /// <summary>
        /// inicia los componentes
        /// </summary>
        public Form1()
        {
            InitializeComponent();
        }


        private void Form_Load(object sender, EventArgs e)
        {
            this.reportViewer1.RefreshReport();
        }
    }
    /// <summary>
    /// accede a la base de datos, crea consultas, las ejecuta, las cierra, crear bucles y guarda datos
    /// </summary>
    /// <param name="sender"></param>
    /// <param name="e"></param>
    private void Form1_Load(object sender, EventArgs e)
    {
        //especifica los detalles de la conexión
        string connstr = "server=localhost; user=root; password=root1234;database=world; port=3306";
        //se crea una instancia 
        MySqlConnection conn = new MySqlConnection(connstr);
        try
        {
            //se intenta abrir conexion con la base de datos
            conn.Open();
            //ejecución de consulta sql
            string sql = "SELECT code, name, continent FROM country";
            //creación de un comando
            MySqlCommand cmd = new MySqlCommand();
            //ejecición de consultas
            cmd.Connection = conn;
            cmd.CommandText = sql;
            //cierre de lector de datos
            MySqlDataReader rdr = cmd.ExecuteReader();
            List<ReportePaises> lrp = new List<ReportePaises>();
            while (rdr.Read())
            {
                ReportePaises rp = new ReportePaises();
                rp.code = rdr[0].ToString();
                rp.name = rdr[1].ToString();
                rp.continent = rdr[2].ToString();
                lrp.Add(rp);
                rp = null;
            }
            rdr.Close();
            //preparación  de los datos para el informe
            ReportDataSource rds = new ReportDataSource("ReportePaises", lrp);
            this.reportViewer1.LocalReport.ReportEmbeddedResource = "ReportePaises.Report1.rdlc";
            this.reportViewer1.LocalReport.DataSources.Clear();
            this.reportViewer1.LocalReport.DataSources.Add(rds);
            //actualización de los informes
            this.reportViewer1.RefreshReport();
        }
        //manejo de errores
        catch (Exception ex)
        {
            MessageBox.Show(ex.ToString());
        }
        conn.Close();
    }
}
