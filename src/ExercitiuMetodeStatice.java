public class ExercitiuMetodeStatice {
    public static void metodaMeaStatica() {
        System.out.println("Sunt executat de o metoda statica");
    }

    public static void main(String[] args) {
        int j = 5, v=2, p=1;
        //apelarea metodei statice
        int rezultat = AicicreamMEstat.suma(j,v,p);
        System.out.println("Suma este egala cu " + rezultat);
    }
}
