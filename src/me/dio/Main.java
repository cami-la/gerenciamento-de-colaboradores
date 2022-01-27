package me.dio;

import me.dio.modelo.Endereco;
import me.dio.modelo.Gerente;
import me.dio.modelo.OperadorDeCaixa;
import me.dio.modelo.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("rua1", "complemento rua 1", "Bairro 1");
        //Vendedor vendedor = new Vendedor();

        Vendedor vendedor = new Vendedor("Vendedor", "222.222.222-22", endereco, 1000d);
        vendedor.calcularBonificacao(0.1d);
        System.out.println(vendedor);

        vendedor.getNome();

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de Caixa", "222.222.22-222", endereco, 1500d);
        System.out.println(operadorDeCaixa);


        Gerente gerente = new Gerente();

        gerente.setNome("Gerente");
        gerente.setDocumento("11.111.111/0001-11");
        gerente.setHorasTrabalhadas(40);
        gerente.setValorHora(50d);
        gerente.setEndereco(endereco);

        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(0.2);

        System.out.println(gerente);



    }

}
