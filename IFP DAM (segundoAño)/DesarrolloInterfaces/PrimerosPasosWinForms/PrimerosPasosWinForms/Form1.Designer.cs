namespace PrimerosPasosWinForms
{
    partial class Form1
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            label1 = new Label();
            comboBox1 = new ComboBox();
            label2 = new Label();
            textBox1 = new TextBox();
            label3 = new Label();
            label4 = new Label();
            radioButtonSr = new RadioButton();
            radioButtonSrta = new RadioButton();
            radioButtonSra = new RadioButton();
            pictureBox1 = new PictureBox();
            label5 = new Label();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.BackColor = SystemColors.ActiveCaption;
            label1.Font = new Font("Tahoma", 9F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.Purple;
            label1.Location = new Point(514, 217);
            label1.Name = "label1";
            label1.Size = new Size(157, 42);
            label1.TabIndex = 0;
            label1.Text = "Saludar";
            label1.TextAlign = ContentAlignment.MiddleCenter;
            label1.Click += label1_Click;
            // 
            // comboBox1
            // 
            comboBox1.FormattingEnabled = true;
            comboBox1.Items.AddRange(new object[] { "mañana", "tarde", "noche" });
            comboBox1.Location = new Point(514, 72);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(121, 23);
            comboBox1.TabIndex = 1;
            comboBox1.SelectedIndexChanged += comboBox1_SelectedIndexChanged;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(318, 80);
            label2.Name = "label2";
            label2.Size = new Size(101, 15);
            label2.TabIndex = 2;
            label2.Text = "Momento del día:";
            label2.Click += label2_Click;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(514, 119);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(121, 23);
            textBox1.TabIndex = 3;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(287, 127);
            label3.Name = "label3";
            label3.Size = new Size(150, 15);
            label3.TabIndex = 4;
            label3.Text = "Nombre de a quien saludo:";
            label3.Click += label3_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(318, 173);
            label4.Name = "label4";
            label4.Size = new Size(97, 15);
            label4.TabIndex = 5;
            label4.Text = "Título del saludo:";
            label4.Click += label4_Click;
            // 
            // radioButtonSr
            // 
            radioButtonSr.AutoSize = true;
            radioButtonSr.Location = new Point(514, 169);
            radioButtonSr.Name = "radioButtonSr";
            radioButtonSr.Size = new Size(35, 19);
            radioButtonSr.TabIndex = 6;
            radioButtonSr.TabStop = true;
            radioButtonSr.Text = "Sr";
            radioButtonSr.UseVisualStyleBackColor = true;
            radioButtonSr.CheckedChanged += radioButton1_CheckedChanged;
            // 
            // radioButtonSrta
            // 
            radioButtonSrta.AutoSize = true;
            radioButtonSrta.Location = new Point(555, 169);
            radioButtonSrta.Name = "radioButtonSrta";
            radioButtonSrta.Size = new Size(45, 19);
            radioButtonSrta.TabIndex = 7;
            radioButtonSrta.TabStop = true;
            radioButtonSrta.Text = "Srta";
            radioButtonSrta.UseVisualStyleBackColor = true;
            radioButtonSrta.CheckedChanged += radioButton2_CheckedChanged;
            // 
            // radioButtonSra
            // 
            radioButtonSra.AutoSize = true;
            radioButtonSra.Location = new Point(606, 169);
            radioButtonSra.Name = "radioButtonSra";
            radioButtonSra.Size = new Size(41, 19);
            radioButtonSra.TabIndex = 8;
            radioButtonSra.TabStop = true;
            radioButtonSra.Text = "Sra";
            radioButtonSra.UseVisualStyleBackColor = true;
            radioButtonSra.CheckedChanged += radioButton3_CheckedChanged;
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(1, 12);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(280, 540);
            pictureBox1.TabIndex = 9;
            pictureBox1.TabStop = false;
            pictureBox1.Click += pictureBox1_Click;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Segoe UI", 15.75F, FontStyle.Italic, GraphicsUnit.Point);
            label5.ForeColor = Color.FromArgb(255, 128, 0);
            label5.Location = new Point(514, 289);
            label5.Name = "label5";
            label5.Size = new Size(84, 30);
            label5.TabIndex = 10;
            label5.Text = "MiTexto";
            label5.Click += label5_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(958, 563);
            Controls.Add(label5);
            Controls.Add(pictureBox1);
            Controls.Add(radioButtonSra);
            Controls.Add(radioButtonSrta);
            Controls.Add(radioButtonSr);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(textBox1);
            Controls.Add(label2);
            Controls.Add(comboBox1);
            Controls.Add(label1);
            Icon = (Icon)resources.GetObject("$this.Icon");
            Name = "Form1";
            Text = "MiPrimeraVentana";
            Load += Form1_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private ComboBox comboBox1;
        private Label label2;
        private TextBox textBox1;
        private Label label3;
        private Label label4;
        private RadioButton radioButtonSr;
        private RadioButton radioButtonSrta;
        private RadioButton radioButtonSra;
        private PictureBox pictureBox1;
        private Label label5;
    }
}