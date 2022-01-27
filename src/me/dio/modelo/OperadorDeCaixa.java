package me.dio.modelo;

public class OperadorDeCaixa extends FuncionarioCLT {

  public OperadorDeCaixa(String nome, String documento, me.dio.modelo.Endereco endereco, Double valorSalario) {
    super(nome, documento, endereco, valorSalario);
  }

  public OperadorDeCaixa() {
  }

  @Override
  public String toString() {
    return "OperadorDeCaixa{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", Endereco=" + Endereco.getRua() +
        ", valorSalario=" + valorSalario +
        '}';
  }
}
