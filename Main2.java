class Main2{
    private String nome;
    // contrutor

    Main2() {
        System.out.println("Construtor Chamado: ");
        nome = "Programa JAVA";
        }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        System.out.println("Qual construtor foi chamado? " + obj.nome);
    }
}