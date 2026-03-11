public abstract class itensHospitalar {
    private String codigo;
    private String descricao;

    public itensHospitalar(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
        "\n Descrição: " + descricao;
    }  

}
