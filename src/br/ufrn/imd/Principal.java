package br.ufrn.imd;

public class Principal {

    public void facoDancar(Dancarino dancarino){
        System.out.println(dancarino.dancar());
    }

    public void facoCantar(Cantor cantor){
        System.out.println(cantor.cantar());
    }

    public static void main(String[] args) {

        Principal principal = new Principal();

        MiltonNascimento milton = new MiltonNascimento();
        principal.facoCantar(milton);
        principal.facoDancar(milton);
    }

}
