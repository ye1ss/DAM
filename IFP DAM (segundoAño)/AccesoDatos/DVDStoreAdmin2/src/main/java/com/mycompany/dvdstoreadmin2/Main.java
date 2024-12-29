/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdstoreadmin2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.hibernate.query.Query;
import java.util.List;

/**
 *
 * @author Alumno
 */

public class Main extends JFrame {

    private JTextArea textArea;
    private JButton executeButton;
    private static SessionFactory sessionFactory;

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Consulta Sakila");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        executeButton = new JButton("Ejecutar Consulta");
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarConsulta();
            }
        });
        panel.add(executeButton, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    private void ejecutarConsulta() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query<Actor> query = session.createQuery("from Actor", Actor.class);
            List<Actor> actors = query.list();
            StringBuilder sb = new StringBuilder();

            for (Actor actor : actors) {
                sb.append(actor.getActorId()).append(": ").append(actor.getFirstName()).append(" ").append(actor.getLastName()).append("\n");
            }
            textArea.setText(sb.toString());
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
