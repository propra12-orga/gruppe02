package Koordinaten;

import Prog1Tools.IOTools;

public interface Koordinaten {

  public static void main (String[] args) {
    Spielfigur gegner, spieler;

    if (spieler.trifft(gegner))
      System.out.println("Treffer! Sie (als Spieler) haben gewonnen");
    else {
      System.out.println("Die Gegner-Figur steht woanders!");
      System.out.println("Sie haben noch 10 Bomben, um die Gegner-Figur zu treffen.");
      for (int i=1; i <= 10; i++) {
        System.out.println("Bewegen Sie Ihre " + spieler);
        richtung = IOTools.readChar("Wollen Sie nach rechts (-), links (|) " +
                                    "unten (/) oder oben (\\) laufen? ");
        switch (richtung) {
          case '-'  : str = "(< 0 nach rechts, > 0 nach rechts) "; break;
          case '|'  : str = "(< 0 nach links,  > 0 nach links ) "; break;
          case '/'  : str = "(< 0 nach unten, > 0 nach unten ) "; break;
          case '\\' : str = "(< 0 nach oben,  > 0 nach oben) "; break;
        }

      

        if (spieler.trifft(gegner)) {
          System.out.println("Treffer! Sie (als Spieler) haben gewonnen");
          break;
        }
        else if (i < 10)
          System.out.println("Leider kein Treffer!");
        else {
          System.out.println("Auch zuletzt kein Treffer!");
          System.out.println("Der Gegner: " + gegner);
          System.out.println("hat gewonnen!");
        }
      }
    }
  }

}
