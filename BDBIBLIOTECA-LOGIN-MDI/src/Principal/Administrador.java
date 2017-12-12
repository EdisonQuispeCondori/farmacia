package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
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
	public Administrador() {
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("BIBLIOTECA (Administrador)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		JMenuItem mntmLibros = new JMenuItem("Libros");
		mntmLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Libro x = new Libro();
				x.setVisible(true);
				desktopPane.add(x);
			}
		});
		mnArchivos.add(mntmLibros);
		
		JMenuItem mntmEstudiantes = new JMenuItem("Estudiantes");
		mntmEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estudiante y = new Estudiante();
				y.setVisible(true);
				desktopPane.add(y);
			}
		});
		mnArchivos.add(mntmEstudiantes);
		
		JMenuItem mntmPrestamo = new JMenuItem("Prestamo");
		mnArchivos.add(mntmPrestamo);
		
		JMenuItem mntmAutor = new JMenuItem("Autor");
		mnArchivos.add(mntmAutor);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n =JOptionPane.showConfirmDialog(rootPane, "Desear salir?", "Seleccione su opcion", JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION)
					System.exit(0); 
			}
		});
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArchivos.add(mntmSalir);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);
		
		JMenuItem mntmVerRegistro = new JMenuItem("Ver escritorio");
		mntmVerRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios c = new Usuarios();
				c.setVisible(true);
				desktopPane.add(c);
			}
		});
		
		JMenuItem mntmVerUsuarios = new JMenuItem("Ver usuarios");
		mntmVerUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usu k = new usu();
				k.setVisible(true);
				desktopPane.add(k);
				
			}
		});
		mnUsuarios.add(mntmVerUsuarios);
		mnUsuarios.add(mntmVerRegistro);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(51, 51, 102));
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
}
