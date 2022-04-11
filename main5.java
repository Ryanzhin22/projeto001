class main5 {
    int a;
    boolean b;

    private main5() {
        a = 0;
        b = false;
    }    
    public static void main5(String[] args){
        main5 obj = new main5();
        System.out.println("Valores padrão: ");
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);
    } 
}
