public class Main {

    public static void main(String[] args) {

        ListaMedicamentos lista = new ListaMedicamentos();
        
        lista.add(new Analgesico("A1", "Dipirona", 500));
        lista.add(new Antibiotico("B1", "Benzetacil", 1000));
        lista.add(new Analgesico("A2", "Alginac", 1000));
        lista.add(new Antibiotico("B2", "Azitromicina", 500));

        System.out.println("--- LISTA ORIGINAL ---");
        lista.exibirTodos();

        System.out.println("Total de Medicamentos cadastrados: " + lista.contarItens());
        System.out.println("---\n");
        
        System.out.println("--- BUSCANDO MEDICAMENTO PELO CÓDIGO ---");

        try{
            Medicamento buscado = lista.buscarPorMedicamento("A2");
            System.out.println("Medicamento encontrado: "+ buscado.getDescricao() + "(" + buscado.getDosagemMg() + "mg)");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("---\n");

        System.out.println("-- EXECUTANDO QUICKSORT  ---");
        Medicamento[] arrayParaOrdenar = lista.transformarEmArray();

        LogicaQuickSort.quickSort(arrayParaOrdenar, 0, arrayParaOrdenar.length - 1);

        for (Medicamento medicamento : arrayParaOrdenar) {
            System.out.println(medicamento);
        } 
        
        System.out.println("\n --- REMOVENDO O PRIMEIRO MEDICAMENTO DA LISTA ---");
        lista.remover(0); 
        System.out.println("Novo total de medicamentos: " + lista.contarItens());
        
        System.out.println("\n--- LISTA ATUALIZADA APÓS REMOÇÃO ---");
        lista.exibirTodos();
    }
}