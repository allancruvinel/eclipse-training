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

public class CadastroLocal extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLocal frame = new CadastroLocal();
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
	public CadastroLocal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 118, 96, 20);
		contentPane.add(textField_1);

		JLabel lblCodigoLocal = new JLabel("Codigo Local");
		lblCodigoLocal.setBounds(152, 93, 153, 20);
		contentPane.add(lblCodigoLocal);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 187, 96, 20);
		contentPane.add(textField_2);

		JLabel lblDescrioLocal = new JLabel("Descri\u00E7\u00E3o Local");
		lblDescrioLocal.setBounds(152, 162, 153, 20);
		contentPane.add(lblDescrioLocal);

		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.setBounds(152, 328, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_MenuPrincipal tela = new Frm_MenuPrincipal();
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(377, 328, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
