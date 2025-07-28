import java.util.List;

public class ManipularArrayNumeros {

    public static void adicionarNumero(List<Integer> numeros, Integer valor) throws Exception {
            if (numeros.contains(valor)) {
                throw new Exception("Numero jah contido na lista");
            }
            numeros.add(valor);
    }

    public static int buscarPosicaoNumero(List<Integer> numeros, Integer valor) {
        return numeros.indexOf(valor);
    }

    public static void removerNumero(List<Integer> numeros, int i) throws Exception {
        int posicao = buscarPosicaoNumero(numeros, i);
        if (posicao >=0) {
            numeros.remove(posicao);
        } else {
            throw new Exception("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) throws Exception {
        Integer posicao = buscarPosicaoNumero(numeros, numeroSubstituir);
        if (posicao >=0) {
            numeros.set(posicao, numeroSubstituto);
        } else {
            adicionarNumero(numeros, numeroSubstituto);
        }
    }


    
}
