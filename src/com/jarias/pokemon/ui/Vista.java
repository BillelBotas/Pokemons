package com.jarias.pokemon.ui;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.jarias.pokemon.base.Pokemon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Vista {

	JFrame ventana;
	public JTextField tfNombre;
	public JTextField tfNivel;
	public JTextField tfPeso;
	public JButton btAnadir;
	public JComboBox<Pokemon.Tipo> cbTipo;
	public JScrollPane scrollPane;
	public JList<Pokemon> lPokemons;
	public DefaultListModel<Pokemon> mPokemons;
	public JLabel lblImagen;

	public Vista() {
		ventana = new JFrame();
		ventana.setBounds(100, 100, 450, 300);
		
		JLabel lblNombre = new JLabel("Nombre*");
		
		JLabel lblTipo = new JLabel("Tipo");
		
		JLabel lblNivel = new JLabel("Nivel");
		
		JLabel lblPeso = new JLabel("Peso");
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		
		tfNivel = new JTextField();
		tfNivel.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		
		btAnadir = new JButton("A\u00F1adir");
		btAnadir.setActionCommand("anadir");
		
		cbTipo = new JComboBox<>();
		ventana.setSize(700, 500);
		
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btAnadir, 19, SpringLayout.SOUTH, tfPeso);
		springLayout.putConstraint(SpringLayout.WEST, btAnadir, 0, SpringLayout.WEST, tfNombre);
		springLayout.putConstraint(SpringLayout.EAST, btAnadir, 0, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.NORTH, tfPeso, -3, SpringLayout.NORTH, lblPeso);
		springLayout.putConstraint(SpringLayout.WEST, tfPeso, 0, SpringLayout.WEST, tfNombre);
		springLayout.putConstraint(SpringLayout.EAST, tfPeso, 0, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.NORTH, tfNivel, -3, SpringLayout.NORTH, lblNivel);
		springLayout.putConstraint(SpringLayout.WEST, tfNivel, 0, SpringLayout.WEST, tfNombre);
		springLayout.putConstraint(SpringLayout.EAST, tfNivel, 0, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.NORTH, cbTipo, -3, SpringLayout.NORTH, lblTipo);
		springLayout.putConstraint(SpringLayout.WEST, cbTipo, 59, SpringLayout.WEST, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, cbTipo, 0, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.NORTH, tfNombre, -3, SpringLayout.NORTH, lblNombre);
		springLayout.putConstraint(SpringLayout.WEST, tfNombre, 6, SpringLayout.EAST, lblNombre);
		springLayout.putConstraint(SpringLayout.EAST, tfNombre, 189, SpringLayout.WEST, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblPeso, 156, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblPeso, 10, SpringLayout.WEST, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblTipo, 80, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblTipo, 10, SpringLayout.WEST, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNivel, 118, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNivel, 10, SpringLayout.WEST, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNombre, 43, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, ventana.getContentPane());
		ventana.getContentPane().setLayout(springLayout);
		ventana.getContentPane().add(lblNombre);
		ventana.getContentPane().add(lblNivel);
		ventana.getContentPane().add(lblTipo);
		ventana.getContentPane().add(tfNombre);
		ventana.getContentPane().add(tfPeso);
		ventana.getContentPane().add(tfNivel);
		ventana.getContentPane().add(cbTipo);
		ventana.getContentPane().add(btAnadir);
		ventana.getContentPane().add(lblPeso);
		
		scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 43, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 50, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 325, SpringLayout.NORTH, ventana.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 265, SpringLayout.EAST, tfNombre);
		ventana.getContentPane().add(scrollPane);
		
		lPokemons = new JList<>();
		scrollPane.setViewportView(lPokemons);
		mPokemons = new DefaultListModel<>();
		lPokemons.setModel(mPokemons);
		
		lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setIcon(new ImageIcon("C:\\Program Files\\Android\\Android Studio\\plugins\\android\\lib\\layoutlib\\data\\res\\drawable-ldpi\\ic_input_add.png"));
		springLayout.putConstraint(SpringLayout.NORTH, lblImagen, 0, SpringLayout.NORTH, lblNombre);
		springLayout.putConstraint(SpringLayout.WEST, lblImagen, 28, SpringLayout.EAST, scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblImagen, -22, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.EAST, lblImagen, -23, SpringLayout.EAST, ventana.getContentPane());
		ventana.getContentPane().add(lblImagen);
		
		ventana.setVisible(true);
		
		
	}
}
