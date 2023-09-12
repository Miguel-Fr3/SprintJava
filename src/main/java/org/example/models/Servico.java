package org.example.models;

public class Servico {
    private String PessoaFisica;
    private String TipoDeServico;

    public Servico(String PessoaFisica, String TipoDeServico) {
        this.PessoaFisica = PessoaFisica;
        this.TipoDeServico = TipoDeServico;
    }

    public String getPessoaFisica() {
        return this.PessoaFisica;
    }

    public void setPessoaFisica(String PessoaFisica) {
        this.PessoaFisica = PessoaFisica;
    }

    public String getTipoDeServico() {
        return this.TipoDeServico;
    }

    public void setTipoDeServico(String TipoDeServico) {
        this.TipoDeServico = TipoDeServico;
    }

    public static void main(String[] args) {
        Servico servico = new Servico("", "");
        System.out.println("Detalhes do Serviço:");
        System.out.println("Pessoa Fisica: " + servico.getPessoaFisica());
        servico.setTipoDeServico("");
        servico.setPessoaFisica("");
        System.out.println("\nServiço modificado:");
        System.out.println("Pessoa Fisica: " + servico.getPessoaFisica());
        System.out.println("Tipo de Serviço: " + servico.getTipoDeServico());
    }
}
