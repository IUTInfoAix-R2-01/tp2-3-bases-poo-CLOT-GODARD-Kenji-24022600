public class TestPersonne{

    public static void main(String[] args) {
        Personne personne = new Personne("Agostinelli","Laurence");
        
        System.out.println(personne.toString());
        System.out.println(personne.getNom());
        System.out.println(personne.getPrenom());
    }
}
