package projrh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDepartamentos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDepartamentos frame = new CadastroDepartamentos();
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
	public CadastroDepartamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(162, 105, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Codigo Departamento");
		lblNewLabel.setBounds(162, 80, 153, 20);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 161, 96, 20);
		contentPane.add(textField_1);

		JLabel lblNomeDepartamento = new JLabel("Nome Departamento");
		lblNomeDepartamento.setBounds(162, 136, 153, 20);
		contentPane.add(lblNomeDepartamento);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 223, 96, 20);
		contentPane.add(textField_2);

		JLabel lblCodigoLoca = new JLabel("Codigo Local");
		lblCodigoLoca.setBounds(162, 198, 153, 20);
		contentPane.add(lblCodigoLoca);

		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBounds(162, 327, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_MenuPrincipal tela = new Frm_MenuPrincipal();
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(370, 327, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
