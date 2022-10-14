import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Servico {

	private int id;
	private int codigoServico;
	private String nomePrestador;
	private String nomeServico;
	private String descricaoServico;
	private double custo;
	private String nomeCliente;
	private String data;
	private String horario;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoServico() {
		return codigoServico;
	}
	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}
	public String getNomePrestador() {
		return nomePrestador;
	}
	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void inserirDados() {
		this.id = (int) (Math.random()*5);
		this.codigoServico = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código de Serviço: "));
		this.nomePrestador = JOptionPane.showInputDialog("Digite o Nome do Prestador de Serviço: ");
		this.descricaoServico = JOptionPane.showInputDialog("Descreva como foi realizado o Serviço: ");
		this.custo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de custo: "));
		this.nomeCliente = JOptionPane.showInputDialog("Digite o Nome do Cliente: ");
		this.data = JOptionPane.showInputDialog("Digite a Data do Serviço DD/MM/AAAA: ");
		this.horario = JOptionPane.showInputDialog("Digite o Horário do Serviço Hrs:Min:Seg: ");
		
	}
	public double calculoServico(double taxa) {
		this.custo += this.custo * taxa /100;
		return this.custo;
		
	}
	
	public void mostrarDados() {
		String mensagem = "O objeto servico foi criado apartir da classe Servico";
		
		mensagem += "\nID: " + this.id;
		mensagem += "\nCodigo do Servico: " + this.codigoServico;
		mensagem += "\nNome do Prestador: " + this.nomePrestador;
		mensagem += "\nDescrição do Serviço: " + this.descricaoServico;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();

		mensagem += "\nCusto : " + formatar.format(this.custo);
		mensagem += "\nNome do Cliente: " +  this.nomeCliente;
		mensagem += "\nData DD//MM/AAAA: " + this.data;
		mensagem += "\nHorario Horas : Minutos : Segundo: " + this.horario;
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
