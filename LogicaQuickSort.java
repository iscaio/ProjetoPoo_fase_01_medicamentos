public class LogicaQuickSort {

    public static void quickSort (Medicamento[] lista, int inicio, int fim) {
        
        if(inicio <  fim ){
            int pivo = particionar(lista, inicio, fim);

            quickSort(lista, inicio, pivo -1);
            quickSort(lista, pivo +1 , fim);
        }
    }

    private static int particionar( Medicamento[] lista, int inicio, int fim) {
        
        Medicamento pivo = lista[fim];
        int item = inicio -1; 

        for (int j = inicio; j < fim; j++){
            if (lista[j].getDosagemMg() >= pivo.getDosagemMg()){

                item++;

                Medicamento temp = lista [item];
                lista[item] = lista[j];
                lista[j] = temp;

            }
        }

        Medicamento temp = lista [item+ 1];
        lista[item+1] = lista[fim];
        lista[fim] = temp;

        return item + 1;
    }
}