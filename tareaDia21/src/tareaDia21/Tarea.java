package tareaDia21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Tarea extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JTextArea textArea;
	private ArrayList<String> listaNotas;
	private String archivo;
	private boolean nueva;
	private JButton btnSavedata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea frame = new Tarea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tarea() {
		setFont(new Font("Arial Black", Font.BOLD, 18));
		setSize(444, 500);
		setLocationRelativeTo(null);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea.setBounds(10, 60, 410, 198); 
		contentPane.add(textArea);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	verNota();
            }
        });
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(10, 11, 410, 38);
		contentPane.add(comboBox);
		
		JButton btnNueva = new JButton("Nueva");
		btnNueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaNota();
			}
		});
		btnNueva.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNueva.setBounds(10, 290, 101, 71);
		contentPane.add(btnNueva);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarNota();
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGuardar.setBounds(161, 290, 101, 71);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarNota();
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(298, 290, 101, 71);
		contentPane.add(btnEliminar);	
		
		btnSavedata = new JButton("Guardar en archivo");
		btnSavedata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarDatos();
			}
		});
		btnSavedata.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSavedata.setBounds(113, 381, 192, 71);
		contentPane.add(btnSavedata);
		
		listaNotas = new ArrayList<String>();
		nueva=false;
		archivo="datos.txt";
		System.out.println();
		cargarDatos();
		
	}
	
	
	private void cargarDatos() 
	{
		try {
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String lineadatos;
			while((lineadatos=bufferedReader.readLine())!=null)
			{
				listaNotas.add(lineadatos);				
			} 
			
			actualisarLista();			
			JOptionPane.showMessageDialog(null, "Datos cargados correctamente...");
			
		} catch (IOException e) {
			//e.printStackTrace(); 
		}
	}
	
	private void guardarDatos()
	{ 
		try {
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			for (String notas : listaNotas) { 
				bufferedWriter.write(notas);
				bufferedWriter.newLine();
			}

			bufferedWriter.close();
			JOptionPane.showMessageDialog(null, "Datos guardados correctamente...");
		} catch (IOException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error, datos no guardados...");
		}
	}
	
	private void actualisarLista()
	{
		comboBox.removeAllItems();
		for(int c=0;c<listaNotas.size();c++)
		{
			if(listaNotas.get(c).length()>50)
			{
				comboBox.addItem(listaNotas.get(c).toString().substring(0,50)+"...");
			}
			else
			{
				comboBox.addItem(listaNotas.get(c));
			}
			
		}		
	}
	
	private void nuevaNota()
	{
		textArea.setText(""); 
		nueva=true;
		textArea.setEnabled(true);
		textArea.setEditable(true);	 
	}
	
	private void guardarNota()
	{		
		if(nueva)
		{
			listaNotas.add(textArea.getText());
		}
		else
		{
			  String tarea = textArea.getText();
              int indice =comboBox.getSelectedIndex();
              if (indice >= 0 && !tarea.isEmpty()) {
                  listaNotas.set(indice, tarea); 
              }
		}
		
		textArea.setText(""); 
		actualisarLista();		
		textArea.setEnabled(false);
		textArea.setEditable(false);	
		textArea.setDisabledTextColor(Color.white);
		nueva=false;
	}
	
	public void verNota()
	{
        int indice =comboBox.getSelectedIndex();
        if (indice >= 0) {
        	textArea.setText(listaNotas.get(indice)); 
        	textArea.setEnabled(true);
    		textArea.setEditable(true); 
        	nueva=false;
        }
	}
	
	public void eliminarNota()
	{
		int indice =comboBox.getSelectedIndex();
        if (indice >= 0) {
            listaNotas.remove(indice);
            textArea.setText(""); 
    		actualisarLista();		
    		textArea.setEnabled(false);
    		textArea.setEditable(false);	
    		textArea.setDisabledTextColor(Color.white);
    		nueva=false;
        }
	}
	
}
