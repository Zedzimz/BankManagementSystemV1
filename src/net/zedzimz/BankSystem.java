package net.zedzimz;

public class BankSystem {

    public static void main(String[] args) {


        Persons Kyle = new Persons("Kyle", "Alton", "Hatch", "26", "123-45-6789");
        Persons Angelica = new Persons("Angelica", "Grace", "Pizana", "28", "987-65-4321");
        Persons Nic = new Persons("Nic", "N/A", "Pizana", "24", "246-89-1011");
        Persons Rachel = new Persons("Rachel", "N/A", "S.","24","135-79-1113");

        System.out.println(Kyle.age);
    }
}