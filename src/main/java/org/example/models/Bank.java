package org.example.models;

public class Bank {
    private String PessoaFisica;
    private String PessoaJuridica;
    private String TipoDeBank;

    public Bank(String PessoaFisica, String PessoaJuridica, String TipoDeBank) {
        this.PessoaFisica = PessoaFisica;
        this.PessoaJuridica = PessoaJuridica;
        this.TipoDeBank = TipoDeBank;
    }

    public String getPessoaFisica() {
        return this.PessoaFisica;
    }

    public void setPessoaFisica(String PessoaFisica) {
        this.PessoaFisica = PessoaFisica;
    }

    public String getPessoaJuridica() {
        return this.PessoaJuridica;
    }

    public void setPessoaJuridica(String PessoaJuridica) {
        this.PessoaJuridica = PessoaJuridica;
    }

    public String getTipoDeBank() {
        return this.TipoDeBank;
    }

    public void setTipoDeBank(String TipoDeBank) {
        this.TipoDeBank = TipoDeBank;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("", "", "");
        System.out.println("Detalhes do Bank:");
        System.out.println("Pessoa Física: " + bank.getPessoaFisica());
        System.out.println("Pessoa Jurídica: " + bank.getPessoaJuridica());
        System.out.println("Tipo de Bank: " + bank.getTipoDeBank());
        bank.setPessoaFisica("");
        bank.setTipoDeBank("");
        bank.setPessoaJuridica("");
        System.out.println("\nBank modificado:");
        System.out.println("Pessoa Física: " + bank.getPessoaFisica());
        System.out.println("Pessoa Jurídica: " + bank.getPessoaJuridica());
        System.out.println("Tipo de Bank: " + bank.getTipoDeBank());
    }
}
