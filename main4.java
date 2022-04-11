class main4 {
    String idiomas;

    main4 (String falado) {
        idiomas = falado;
        System.out.println(idiomas + "É falado no mundo");
    }

    public static void main(String[] args){
        Main obj1 = new main4("Alemão");
        Main obj2 = new main4("Inglês");
        Main obj3 = new main4("Português");
        System.out.println(obj1.idiomas);
    }
}
