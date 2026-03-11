import java.util.ArrayList;

public class ListaMedicamentos {
    private ArrayList<Medicamento> lista = new ArrayList<>();

    public void add (Medicamento medicamento){
        lista.add(medicamento);
    }

    public void remover( int indice){
        lista.remove(indice);
    }

    public int contarItens(){
        return lista.size();
    }

    public Medicamento buscarPorMedicamento(String codigo){
        return lista.stream()
                .filter(medicamento -> medicamento.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Medicamento não encontratado.\n Tente um codigo valido."));
    }
    
    public Medicamento[] transformarEmArray(){
        return lista.toArray(new Medicamento[0]);
    }

    public void exibirTodos(){
        for (Medicamento medicamento : lista){
            System.out.println(medicamento);
        }
    }
}
