namespace diseñoComponentes
{
    partial class ventana
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(ventana));
            pictureBox1 = new PictureBox();
            label1 = new Label();
            salir = new Button();
            label2 = new Label();
            nombre = new TextBox();
            solicitarPrestamo = new Button();
            errorProvider1 = new ErrorProvider(components);
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            ((System.ComponentModel.ISupportInitialize)errorProvider1).BeginInit();
            SuspendLayout();
            // 
            // pictureBox1
            // 
            pictureBox1.BackgroundImage = (Image)resources.GetObject("pictureBox1.BackgroundImage");
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(87, 84);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(145, 89);
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
            pictureBox1.TabIndex = 0;
            pictureBox1.TabStop = false;
            pictureBox1.Click += pictureBox1_Click;
            // 
            // label1
            // 
            label1.Font = new Font("Segoe UI Black", 26.25F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.Black;
            label1.Location = new Point(238, 103);
            label1.Name = "label1";
            label1.Size = new Size(469, 51);
            label1.TabIndex = 1;
            label1.Text = "Banco de la Tierra Media";
            label1.TextAlign = ContentAlignment.TopCenter;
            label1.Click += label1_Click;
            // 
            // salir
            // 
            salir.BackColor = Color.FromArgb(192, 64, 0);
            salir.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            salir.ForeColor = Color.White;
            salir.Location = new Point(694, 387);
            salir.Name = "salir";
            salir.Size = new Size(94, 51);
            salir.TabIndex = 2;
            salir.Text = "SALIR";
            salir.UseVisualStyleBackColor = false;
            salir.Click += button1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 14.25F, FontStyle.Bold, GraphicsUnit.Point);
            label2.ForeColor = Color.Black;
            label2.Location = new Point(238, 199);
            label2.Name = "label2";
            label2.Size = new Size(116, 25);
            label2.TabIndex = 3;
            label2.Text = "Su nombre:";
            // 
            // nombre
            // 
            nombre.Location = new Point(360, 204);
            nombre.Name = "nombre";
            nombre.Size = new Size(291, 23);
            nombre.TabIndex = 4;
            nombre.TextChanged += nombre_TextChanged;
            // 
            // solicitarPrestamo
            // 
            solicitarPrestamo.BackColor = Color.FromArgb(128, 64, 0);
            solicitarPrestamo.Font = new Font("Segoe UI", 9.75F, FontStyle.Bold, GraphicsUnit.Point);
            solicitarPrestamo.ForeColor = Color.White;
            solicitarPrestamo.Location = new Point(360, 272);
            solicitarPrestamo.Name = "solicitarPrestamo";
            solicitarPrestamo.Size = new Size(112, 67);
            solicitarPrestamo.TabIndex = 5;
            solicitarPrestamo.Text = "Solicitar Préstamo";
            solicitarPrestamo.UseVisualStyleBackColor = false;
            solicitarPrestamo.Click += button2_Click;
            // 
            // errorProvider1
            // 
            errorProvider1.ContainerControl = this;
            // 
            // ventana
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            AutoScroll = true;
            BackColor = Color.Peru;
            ClientSize = new Size(800, 450);
            Controls.Add(solicitarPrestamo);
            Controls.Add(nombre);
            Controls.Add(label2);
            Controls.Add(salir);
            Controls.Add(label1);
            Controls.Add(pictureBox1);
            Icon = (Icon)resources.GetObject("$this.Icon");
            Name = "ventana";
            Text = "Banco Tierra Media";
            Load += Form1_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ((System.ComponentModel.ISupportInitialize)errorProvider1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private PictureBox pictureBox1;
        private Label label1;
        private Button salir;
        private Label label2;
        private TextBox nombre;
        private Button solicitarPrestamo;
        private ErrorProvider errorProvider1;
    }
}