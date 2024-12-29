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
            label1 = new Label();
            salir = new Button();
            label2 = new Label();
            nombre = new TextBox();
            solicitarPrestamo = new Button();
            errorProvider1 = new ErrorProvider(components);
            pictureBox1 = new PictureBox();
            label3 = new Label();
            ((System.ComponentModel.ISupportInitialize)errorProvider1).BeginInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.Font = new Font("Segoe UI Black", 26.25F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.Black;
            label1.Location = new Point(264, 218);
            label1.Name = "label1";
            label1.Size = new Size(279, 51);
            label1.TabIndex = 1;
            label1.Text = "Black Clover";
            label1.TextAlign = ContentAlignment.TopCenter;
            label1.Click += label1_Click;
            // 
            // salir
            // 
            salir.BackColor = Color.Red;
            salir.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            salir.ForeColor = Color.White;
            salir.Location = new Point(697, 397);
            salir.Name = "salir";
            salir.Size = new Size(91, 41);
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
            label2.Location = new Point(200, 303);
            label2.Name = "label2";
            label2.Size = new Size(116, 25);
            label2.TabIndex = 3;
            label2.Text = "Su nombre:";
            // 
            // nombre
            // 
            nombre.Location = new Point(322, 305);
            nombre.Name = "nombre";
            nombre.Size = new Size(246, 23);
            nombre.TabIndex = 4;
            nombre.TextChanged += nombre_TextChanged;
            // 
            // solicitarPrestamo
            // 
            solicitarPrestamo.BackColor = Color.FromArgb(255, 128, 0);
            solicitarPrestamo.Font = new Font("Segoe UI", 9.75F, FontStyle.Bold, GraphicsUnit.Point);
            solicitarPrestamo.ForeColor = Color.White;
            solicitarPrestamo.Location = new Point(283, 361);
            solicitarPrestamo.Name = "solicitarPrestamo";
            solicitarPrestamo.Size = new Size(208, 61);
            solicitarPrestamo.TabIndex = 5;
            solicitarPrestamo.Text = "Solicitar Préstamo";
            solicitarPrestamo.UseVisualStyleBackColor = false;
            solicitarPrestamo.Click += button2_Click;
            // 
            // errorProvider1
            // 
            errorProvider1.ContainerControl = this;
            // 
            // pictureBox1
            // 
            pictureBox1.Image = Properties.Resources.toros;
            pictureBox1.Location = new Point(283, 12);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(208, 203);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.TabIndex = 6;
            pictureBox1.TabStop = false;
            // 
            // label3
            // 
            label3.Font = new Font("Segoe UI Black", 26.25F, FontStyle.Bold, GraphicsUnit.Point);
            label3.ForeColor = Color.Black;
            label3.Location = new Point(246, 218);
            label3.Name = "label3";
            label3.Size = new Size(279, 51);
            label3.TabIndex = 1;
            label3.Text = "Black Clover";
            label3.TextAlign = ContentAlignment.TopCenter;
            label3.Click += label1_Click;
            // 
            // ventana
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            AutoScroll = true;
            BackColor = Color.Orange;
            ClientSize = new Size(800, 450);
            Controls.Add(pictureBox1);
            Controls.Add(solicitarPrestamo);
            Controls.Add(nombre);
            Controls.Add(label2);
            Controls.Add(salir);
            Controls.Add(label3);
            Controls.Add(label1);
            Icon = (Icon)resources.GetObject("$this.Icon");
            Name = "ventana";
            Text = "Black Clover";
            Load += Form1_Load;
            ((System.ComponentModel.ISupportInitialize)errorProvider1).EndInit();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Label label1;
        private Button salir;
        private Label label2;
        private TextBox nombre;
        private Button solicitarPrestamo;
        private ErrorProvider errorProvider1;
        private PictureBox pictureBox1;
        private Label label3;
    }
}