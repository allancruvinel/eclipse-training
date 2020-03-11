package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilitaries.Imovel;
import utilitaries.Pessoa;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Informa_Dados extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nome;
	private JTextField txt_cpf;
	private JTextField txt_telefone;
	private JTextField txt_numero;
	private JTextField txt_rua;
	private JTextField txt_bloco;
	private JLabel lblCpf;
	private JLabel lblTelefone;
	private JLabel lblNumero;
	private JLabel lblRua;
	private JLabel lblBloco;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informa_Dados frame = new Informa_Dados();
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
	List<Imovel> list = new ArrayList<>();

	public Informa_Dados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txt_nome = new JTextField();
		txt_nome.setBounds(209, 19, 272, 26);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);

		txt_cpf = new JTextField();
		txt_cpf.setBounds(208, 66, 273, 26);
		contentPane.add(txt_cpf);
		txt_cpf.setColumns(10);

		txt_telefone = new JTextField();
		txt_telefone.setColumns(10);
		txt_telefone.setBounds(209, 109, 273, 26);
		contentPane.add(txt_telefone);

		txt_numero = new JTextField();
		txt_numero.setColumns(10);
		txt_numero.setBounds(209, 168, 61, 26);
		contentPane.add(txt_numero);

		txt_rua = new JTextField();
		txt_rua.setColumns(10);
		txt_rua.setBounds(209, 216, 273, 26);
		contentPane.add(txt_rua);

		txt_bloco = new JTextField();
		txt_bloco.setColumns(10);
		txt_bloco.setBounds(209, 253, 61, 26);
		contentPane.add(txt_bloco);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(37, 31, 110, 14);
		contentPane.add(lblNewLabel);

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(37, 78, 121, 14);
		contentPane.add(lblCpf);

		lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(37, 121, 135, 14);
		contentPane.add(lblTelefone);

		lblNumero = new JLabel("Numero");
		lblNumero.setBounds(37, 180, 121, 14);
		contentPane.add(lblNumero);

		lblRua = new JLabel("Rua");
		lblRua.setBounds(37, 228, 110, 14);
		contentPane.add(lblRua);

		lblBloco = new JLabel("Bloco");
		lblBloco.setBounds(37, 265, 110, 14);
		contentPane.add(lblBloco);

		btnNewButton = new JButton("Registrar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa treccia = new Pessoa(txt_nome.getText(), txt_cpf.getText(), txt_telefone.getText());
				Imovel imovel = new Imovel(treccia, txt_numero.getText(), txt_rua.getText(), txt_bloco.getText());
				System.out.println("Cliente Cadastrado");
				System.out.println(imovel.toString());
				list.add(imovel);
			}
		});

		btnNewButton.setBounds(194, 314, 199, 67);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Listar Cadastrados no console");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Usuários Registrado...");
				System.out.println("___________________________________________________");
				for (Imovel listado : list) {
					System.out.println(listado.toString());
				}
			}
		});
		btnNewButton_1.setBounds(423, 314, 250, 67);
		contentPane.add(btnNewButton_1);
	}

}
