package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class V�istlus{
    private Random rand1 = new Random();
 Scanner scn  = new Scanner(System.in);
    private String nimi = "";
    private int raskustase;
    private static final String[] nimed1 = {"Ray'","Juhani","Ilmari","Vladimiri","Joosepi","Borislavi","Ignati"};
    private static final String[] nimed2 = {"M�ngumaa", "Pillerkaar", "Tarakanis�iduparadiis", "Koletisviuhlemised"}; //siin kuni public V�itsluseni on suurte ambitsioonide varemed
    private String[] toimunud = new String[500];
    public V�istlus(int raskus){
        this.raskustase = raskus;
    }
 public int getRaskustase() {
  return raskustase;
 }
 public void setRaskustase(int raskustase) {
  this.raskustase = raskustase;
 }

 public String[] korralda_v�idus�it(Prussakas [] osalejad){
     String[] tulemus = new String[osalejad.length];
     Prussakas[] joonis = new Prussakas[osalejad.length]; //loon koopia osalevatest prussakatest
     int j = -1;
     for (Prussakas elem: osalejad){
      j++;
      joonis[j] = elem;
     }
     int fini��eerinud = 0; //iks dee 2 �-d
     boolean s�it = true;
     String prussakas_parim = "";
     int number = 0;
     String rada = "";
     String[] rajad = new String[osalejad.length];
     j = 0;
     
     while (s�it == true){
      int i = -1; //et eemaldada k�rgeim 
      int I = 0; // i abistaja
      double maksimum = Double.MIN_VALUE;
      for (Prussakas pruss: osalejad){
       i++;
       if (pruss.getKiirus() > maksimum){
        I = i;
        maksimum = pruss.getKiirus();
        prussakas_parim = pruss.getNimi(); //siin toimub parima v�lja selgitamine
       }
      }
      tulemus[number] = prussakas_parim; //lisame parimad
      fini��eerinud++;
      if (fini��eerinud == osalejad.length){ //kui k�ik osalejad on fini�isse j�udnud
       s�it = false;
      }
      number++; // creative I know
     }     
  return tulemus;
 }
 
 
 
// In honor of Anton the following code will remain...
// public Prussakas[] korralda_v�idus�it_alt(ArrayList<Prussakas> osalejad){
//     Prussakas[] tulemus = new Prussakas[osalejad.size()];
//     int palju1,palju2,fini��eerinud = 0;
//     double koht,max;
//     boolean s�it = true;
//     String prussakas_parim = "";
//     String kujutlus = "";
//     double [] pos = new double[osalejad.size()];
//     for (int i = 0; i < osalejad.size(); i++)pos[i] = 0;
//     ArrayList<Prussakas> l�pus = new ArrayList<Prussakas>();
//     while (s�it == true){
//      l�pus.clear();
//      scn.next();
//      for (Prussakas pruss : osalejad){
//       koht = pos[osalejad.indexOf(pruss)];
//       if (koht < 100 && koht != -10){
//        palju1 = (int) Math.round(koht);
//        palju2 = 99 - palju1;
//        kujutlus = "|" + new String(new char[palju1]).replace("\0", "-")
//           + "#" + new String(new char[palju2]).replace("\0", "-") + "|" + pruss.getNimi();
//        pos[osalejad.indexOf(pruss)] += pruss.getKiirus();
//        if (koht >= 100 && (l�pus.indexOf(pruss) != -1)){
//         l�pus.add(pruss);
//         fini��eerinud++;
//        }else if (koht >= 100 || koht == -10){
//         kujutlus = "|" + new String(new char[99]).replace("\0", "-")+ "#" + "|"+ pruss.getNimi();
//        }
//       }
//       System.out.println(kujutlus);
//      }
//      for (int i = 0; i < osalejad.size(); i++){
//      max = 0;
//       if (pos[i] > 100){
//        for (int p = 0; p < osalejad.size(); p++){
//         if (pos[i] > max){
//          max = pos[i];
//         } 
//        }
//        pos[i] = -10;
//        tulemus[i] = osalejad.get(i);
//       }
//      }
//      if (fini��eerinud > 0)s�it=false;
//     }
//     return tulemus;
// }
}
