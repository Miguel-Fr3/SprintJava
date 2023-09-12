package org.example;

import org.example.models.Bank;
import org.example.models.Categoria;
import org.example.repositories.BankRepository;
import org.example.repositories.CategoriaRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var bankRepository = new BankRepository();
        System.out.println("Bem vindo ao cadastro da Porto, por favor digite seu cpf ou cnpj");
        var scanner = new Scanner(System.in);
        var pessoa = scanner.nextLine();
        System.out.println("Digite o tipo de banco");
        var tipo = scanner.nextLine();

        var bank = new Bank();
        bank.setPessoaFisica(pessoa);
        bank.setPessoaJuridica(pessoa);
        bank.setTipoDeBank(tipo);
        bankRepository.Save(bank);

        var categoriaRepository = new CategoriaRepository();
        System.out.println("Bem vindo ao cadastro da Porto, por favor digite seu cpf ou cnpj");
        var Categoria = scanner.nextLine();


        var categoria = new Categoria();
        categoria.setCategorias(Categoria);
        categoriaRepository.Save(categoria);
    }
}