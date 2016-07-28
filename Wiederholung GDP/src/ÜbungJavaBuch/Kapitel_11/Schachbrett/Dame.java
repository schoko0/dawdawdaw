package ÜbungJavaBuch.Kapitel_11.Schachbrett;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class Dame extends Schachfigur {

    public Dame(String startpos){
       super(startpos);
   }

   @Override
   public String ermittleZiele(){
       StringBuilder zuege = new StringBuilder();
       for(int i=-7; i<=7; i++) {
           if(i==0)
               continue;
           //Horizontale und Vertikale
           zuege.append(position(spalte+i, reihe));
           zuege.append(position(spalte, reihe+i));

           //Diagonalen
           zuege.append(position(spalte+i, reihe+i));
           zuege.append(position(spalte+i, reihe-i));

       }
       return zuege.substring(0, zuege.length() - 1);
   }
}
