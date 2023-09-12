package org.example.models;

public class Saude {

    private String PessoaJuridica;
    private String TipoDeSaude;

    public Saude(String PessoaJuridica, String TipoDeSaude) {
        this.PessoaJuridica = PessoaJuridica;
        this.TipoDeSaude = TipoDeSaude;
    }

    public String getPessoaJuridica() {
        return this.PessoaJuridica;
    }

    public void setPessoaJuridica(String PessoaJuridica) {
        this.PessoaJuridica = PessoaJuridica;
    }

    public String getTipoDeSaude() {
        return this.TipoDeSaude;
    }

    public void setTipoDeSaude(String TipoDeSaude) {
        this.TipoDeSaude = TipoDeSaude;
    }

    public static void main(String[] args) {
        Saude saude = new Saude("", "");
        System.out.println("Detalhes do Saude:");
        System.out.println("Pessoa Jurídica: " + saude.getPessoaJuridica());
        saude.setTipoDeSaude("");
        saude.setPessoaJuridica("");
        System.out.println("\nSaude modificado:");
        System.out.println("Pessoa Jurídica: " + saude.getPessoaJuridica());
        System.out.println("Tipo de Saude: " + saude.getTipoDeSaude());
    }
}
