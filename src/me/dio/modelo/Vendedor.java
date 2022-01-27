package me.dio.modelo;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

  private Double valorBonificacao;

  public Vendedor() {
  }

  public Vendedor(String nome, String documento, me.dio.modelo.Endereco endereco, Double valorSalario) {
    super(nome, documento, endereco, valorSalario);
  }

  @Override
  public void calcularBonificacao(Double porcentagemBonificacao) {
    this.valorBonificacao =  super.getValorSalario() * porcentagemBonificacao;
  }

  public Double getValorBonificacao() {
    return valorBonificacao;
  }

  public void setValorBonificacao(Double valorBonificacao) {
    this.valorBonificacao = valorBonificacao;
  }

  @Override
  public String toString() {
    return "Vendedor{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", Endereco=" + Endereco.getRua() +
        ", valorSalario=" + valorSalario +
        ", valorBonificacao=" + valorBonificacao +
        '}';
  }


}
