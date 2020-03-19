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

public class CadastroEmpregado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEmpregado frame = new CadastroEmpregado();
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
	public CadastroEmpregado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(152, 127, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("codigo empregado");
		lblNewLabel.setBounds(152, 103, 143, 20);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 182, 369, 20);
		contentPane.add(textField_1);

		JLabel lblNomeEmpregado = new JLabel("nome empregado");
		lblNomeEmpregado.setBounds(152, 158, 143, 20);
		contentPane.add(lblNomeEmpregado);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 245, 369, 20);
		contentPane.add(textField_2);

		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(152, 221, 143, 20);
		contentPane.add(lblEndereo);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 315, 96, 20);
		contentPane.add(textField_3);

		JLabel lblCidade = new JLabel("cidade");
		lblCidade.setBounds(152, 291, 143, 20);
		contentPane.add(lblCidade);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(152, 72, 96, 20);
		contentPane.add(textField_4);

		JLabel lblCodigoDepartamento = new JLabel("codigo departamento");
		lblCodigoDepartamento.setBounds(152, 48, 143, 20);
		contentPane.add(lblCodigoDepartamento);

		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.setBounds(206, 379, 89, 23);
		contentPane.add(btnNewButton);

		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_MenuPrincipal tela = new Frm_MenuPrincipal();
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btn_cancelar.setBounds(389, 379, 89, 23);
		contentPane.add(btn_cancelar);
	}
}
