public abstract class Medicamento extends itensHospitalar {

    public double dosagemMg;

    public Medicamento(String codigo, String descricao, double dosagemMg) {
        super(codigo, descricao);
        this.dosagemMg = dosagemMg;
    }

    public double getDosagemMg() {
        return dosagemMg;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "Dosagem Mg: " + dosagemMg + "mg" ;
    }

   
}
