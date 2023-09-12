package org.example.models;

public class Seguro {
    private String PessoaFisica;
    private String PessoaJuridica;
    private String TipoDeSeguro;

    public Seguro(String PessoaFisica, String PessoaJuridica, String TipoDeSeguro) {
        this.PessoaFisica = PessoaFisica;
        this.PessoaJuridica = PessoaJuridica;
        this.TipoDeSeguro = TipoDeSeguro;
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

    public String getTipoDeSeguro() {
        return this.TipoDeSeguro;
    }

    public void setTipoDeSeguro(String TipoDeSeguro) {
        this.TipoDeSeguro = TipoDeSeguro;
    }

    public static void main(String[] args) {
        Seguro seguro = new Seguro("", "", "");
        System.out.println("Detalhes do Seguro:");
        System.out.println("Pessoa Física: " + seguro.getPessoaFisica());
        System.out.println("Pessoa Jurídica: " + seguro.getPessoaJuridica());
        System.out.println("Tipo de Seguro: " + seguro.getTipoDeSeguro());
        seguro.setPessoaFisica("");
        seguro.setTipoDeSeguro("");
        seguro.setPessoaJuridica("");
        System.out.println("\nSeguro modificado:");
        System.out.println("Pessoa Física: " + seguro.getPessoaFisica());
        System.out.println("Pessoa Jurídica: " + seguro.getPessoaJuridica());
        System.out.println("Tipo de Seguro: " + seguro.getTipoDeSeguro());
    }
}
