public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        System.out.printf("Procurando o nome: \"%s\"\n", nome);
        int low = 0;
        int high = nomes.length - 1;
        int mid=0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int comparison = nome.compareTo(nomes[mid]); // Compare strings
            System.out.printf("Passando pelo indice: %d\n", mid);
            if (comparison == 0) { // Target found
                encontrado = true;
                break;
            } else if (comparison < 0) { // Target is smaller, search left half
                high = mid - 1;
            } else { // Target is larger, search right half
                low = mid + 1;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException(String.format("O nome %s não se encontra no array de nomes", nome));
        } else {
            System.out.printf("Nome %s encontrado na posição %d\n", nome, mid);
        }


    }
}
