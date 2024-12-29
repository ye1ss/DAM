namespace diseñoComponentes
{
    partial class ventanaPrestamos
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(ventanaPrestamos));
            saludo = new Label();
            volver = new Button();
            confirmarSolicitud = new Button();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            datosPersonales = new Panel();
            lugarOrigen = new ComboBox();
            razas = new ComboBox();
            label5 = new Label();
            label4 = new Label();
            datosPrestamo = new Panel();
            montoPrestamo = new TextBox();
            cuotas = new ComboBox();
            label7 = new Label();
            label6 = new Label();
            errorProvider1 = new ErrorProvider(components);
            datosPersonales.SuspendLayout();
            datosPrestamo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)errorProvider1).BeginInit();
            SuspendLayout();
            // 
            // saludo
            // 
            saludo.AutoSize = true;
            saludo.Font = new Font("Segoe UI", 15.75F, FontStyle.Bold, GraphicsUnit.Point);
            saludo.Location = new Point(242, 46);
            saludo.Name = "saludo";
            saludo.Size = new Size(135, 30);
            saludo.TabIndex = 0;
            saludo.Text = "Bienvenido, ";
            saludo.Click += saludo_Click;
            // 
            // volver
            // 
            volver.BackColor = Color.FromArgb(192, 64, 0);
            volver.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            volver.ForeColor = Color.White;
            volver.Location = new Point(690, 395);
            volver.Name = "volver";
            volver.Size = new Size(98, 43);
            volver.TabIndex = 1;
            volver.Text = "volver";
            volver.UseVisualStyleBackColor = false;
            volver.Click += volver_Click;
            // 
            // confirmarSolicitud
            // 
            confirmarSolicitud.BackColor = Color.FromArgb(128, 64, 0);
            confirmarSolicitud.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            confirmarSolicitud.ForeColor = SystemColors.ControlLightLight;
            confirmarSolicitud.Location = new Point(336, 323);
            confirmarSolicitud.Name = "confirmarSolicitud";
            confirmarSolicitud.Size = new Size(129, 67);
            confirmarSolicitud.TabIndex = 2;
            confirmarSolicitud.Text = "Confirmar Solicitud";
            confirmarSolicitud.UseVisualStyleBackColor = false;
            confirmarSolicitud.Click += confirmarSolicitud_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.BackColor = Color.Peru;
            label1.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.White;
            label1.Location = new Point(12, 127);
            label1.Name = "label1";
            label1.Size = new Size(144, 21);
            label1.TabIndex = 3;
            label1.Text = "Datos personales:";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(377, 142);
            label2.Name = "label2";
            label2.Size = new Size(0, 15);
            label2.TabIndex = 4;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.BackColor = Color.Peru;
            label3.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label3.ForeColor = Color.White;
            label3.Location = new Point(488, 127);
            label3.Name = "label3";
            label3.Size = new Size(180, 21);
            label3.TabIndex = 5;
            label3.Text = "Detalles del préstamo:";
            // 
            // datosPersonales
            // 
            datosPersonales.BackColor = Color.SandyBrown;
            datosPersonales.Controls.Add(lugarOrigen);
            datosPersonales.Controls.Add(razas);
            datosPersonales.Controls.Add(label5);
            datosPersonales.Controls.Add(label4);
            datosPersonales.Location = new Point(12, 166);
            datosPersonales.Name = "datosPersonales";
            datosPersonales.Size = new Size(332, 144);
            datosPersonales.TabIndex = 6;
            // 
            // lugarOrigen
            // 
            lugarOrigen.DropDownStyle = ComboBoxStyle.DropDownList;
            lugarOrigen.FlatStyle = FlatStyle.Flat;
            lugarOrigen.FormattingEnabled = true;
            lugarOrigen.Location = new Point(181, 87);
            lugarOrigen.Name = "lugarOrigen";
            lugarOrigen.Size = new Size(138, 23);
            lugarOrigen.TabIndex = 3;
            // 
            // razas
            // 
            razas.DropDownStyle = ComboBoxStyle.DropDownList;
            razas.FlatStyle = FlatStyle.Flat;
            razas.FormattingEnabled = true;
            razas.Location = new Point(181, 23);
            razas.Name = "razas";
            razas.Size = new Size(138, 23);
            razas.TabIndex = 2;
            razas.SelectedIndexChanged += razas_SelectedIndexChanged;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            label5.Location = new Point(50, 86);
            label5.Name = "label5";
            label5.Size = new Size(125, 20);
            label5.TabIndex = 1;
            label5.Text = "Lugar de Origen:";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            label4.Location = new Point(129, 26);
            label4.Name = "label4";
            label4.Size = new Size(46, 20);
            label4.TabIndex = 0;
            label4.Text = "Raza:";
            // 
            // datosPrestamo
            // 
            datosPrestamo.BackColor = Color.SandyBrown;
            datosPrestamo.Controls.Add(montoPrestamo);
            datosPrestamo.Controls.Add(cuotas);
            datosPrestamo.Controls.Add(label7);
            datosPrestamo.Controls.Add(label6);
            datosPrestamo.Location = new Point(456, 166);
            datosPrestamo.Name = "datosPrestamo";
            datosPrestamo.Size = new Size(332, 144);
            datosPrestamo.TabIndex = 7;
            // 
            // montoPrestamo
            // 
            montoPrestamo.Location = new Point(180, 23);
            montoPrestamo.Name = "montoPrestamo";
            montoPrestamo.Size = new Size(140, 23);
            montoPrestamo.TabIndex = 3;
            // 
            // cuotas
            // 
            cuotas.DropDownStyle = ComboBoxStyle.DropDownList;
            cuotas.FlatStyle = FlatStyle.Flat;
            cuotas.FormattingEnabled = true;
            cuotas.Location = new Point(182, 87);
            cuotas.Name = "cuotas";
            cuotas.Size = new Size(138, 23);
            cuotas.TabIndex = 2;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            label7.Location = new Point(115, 87);
            label7.Name = "label7";
            label7.Size = new Size(61, 20);
            label7.TabIndex = 1;
            label7.Text = "Cuotas:";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point);
            label6.Location = new Point(18, 26);
            label6.Name = "label6";
            label6.Size = new Size(156, 20);
            label6.TabIndex = 0;
            label6.Text = "Monto del préstamo:";
            // 
            // errorProvider1
            // 
            errorProvider1.ContainerControl = this;
            // 
            // ventanaPrestamos
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = Color.Peru;
            ClientSize = new Size(800, 450);
            Controls.Add(datosPrestamo);
            Controls.Add(datosPersonales);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(confirmarSolicitud);
            Controls.Add(volver);
            Controls.Add(saludo);
            Icon = (Icon)resources.GetObject("$this.Icon");
            Name = "ventanaPrestamos";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Préstamos";
            Load += prestamos_Load_1;
            datosPersonales.ResumeLayout(false);
            datosPersonales.PerformLayout();
            datosPrestamo.ResumeLayout(false);
            datosPrestamo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)errorProvider1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label saludo;
        private Button volver;
        private Button confirmarSolicitud;
        private Label label1;
        private Label label2;
        private Label label3;
        private Panel datosPersonales;
        private Panel datosPrestamo;
        private ComboBox lugarOrigen;
        private ComboBox razas;
        private Label label5;
        private Label label4;
        private TextBox montoPrestamo;
        private ComboBox cuotas;
        private Label label7;
        private Label label6;
        private ErrorProvider errorProvider1;
    }
}