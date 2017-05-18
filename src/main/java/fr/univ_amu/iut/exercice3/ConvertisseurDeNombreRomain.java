package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i)    {
        int valeur = 0;
        int valeurChiffrePrecedent = Integer.MAX_VALUE;
        for (char chiffre : i.toCharArray()){
            int valeurChiffreCourant = valeurUnite(chiffre);
            if(valeurChiffrePrecedent < valeurChiffreCourant)
                valeur=valeur+valeurChiffreCourant-valeurChiffrePrecedent*2;
            else
                valeur += valeurUnite(chiffre);
            valeurChiffrePrecedent=valeurChiffreCourant;
        }
        return valeur;
    }
    private int valeurUnite(char chiffre){
        switch(chiffre){
            case 'I' :
                return 1;
            case  'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L':
                return  50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default:
                return 0;
        }
    }
}