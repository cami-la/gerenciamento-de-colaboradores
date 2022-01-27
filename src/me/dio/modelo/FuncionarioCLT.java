package me.dio.modelo;

public abstract class FuncionarioCLT {

  protected String nome;
  protected String documento;

  protected Endereco Endereco;

  protected Double valorSalario;

  public FuncionarioCLT(String nome, String documento, Endereco endereco, Double valorSalario) {
    this.nome = nome;
    this.documento = documento;
    this.Endereco = endereco;
    this.valorSalario = valorSalario;
  }

  public FuncionarioCLT() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public me.dio.modelo.Endereco getEndereco() {
    return Endereco;
  }

  public void setEndereco(me.dio.modelo.Endereco endereco) {
    Endereco = endereco;
  }

  public Double getValorSalario() {
    return valorSalario;
  }

  public void setValorSalario(Double valorSalario) {
    this.valorSalario = valorSalario;
  }

  @Override
  public String toString() {
    return "FuncionarioCLT{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", Endereco=" + Endereco +
        ", valorSalario=" + valorSalario +
        '}';
  }
}
