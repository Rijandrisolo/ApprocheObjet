package fr.entites;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    //Constructeur à vide
    public AdressePostale() {

    }
    public AdressePostale(int vnumeroRue,String vlibelleRue,String vcodePostal,String vville) {
    this.numeroRue =vnumeroRue;
    this.libelleRue = vlibelleRue;
    this.codePostal = vcodePostal;
    this.ville = vville;
    }

    //
    public void changerMajVille(){
        System.out.println(ville.toUpperCase());

    }

    ///changement numeroRue
    public void setNumeroRue( int vNumRue ){
        numeroRue = vNumRue;
    }
    ///changement libelleRue
    public void setLibelleRue( String vLibrue ){
        libelleRue = vLibrue;
    }
    ///changement codePostal
    public void setCodePostal( String vCPostal ){
        codePostal = vCPostal;
    }

    ///changement ville
    public void setVille( String vVille ){
        ville = vVille;
    }

    ///get numeroRue
    public int getNumeroRue(){
       return numeroRue ;
    }
    ///get libelleRue
    public String getlibelleRue(){
        return libelleRue ;
    }
    ///get codePostal
    public String getCodePostal(){
        return codePostal ;
    }
    ///get ville
    public String getVille(){
        return ville ;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}