
package mainbaru;

import java.util.*;

public class Main {

    Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
     
        Main run = new Main();
        run.Main();
        
    }
                
       void Main() {
        
        ArrayList <kopi> kops = new ArrayList<>();
        ArrayList <topping> tops = new ArrayList<>();
        
        kopi arabica = new kopi();
        kopi robusta = new kopi();
        kopi flores = new kopi();
        
        topping susu = new topping();
        topping oreo = new topping();
        
        arabica.setKopi("Arabica ");
        arabica.setAsal("Timur Tengah");
        arabica.setStokK(75);
        kops.add(arabica);
        
        robusta.setKopi("Robusta ");
        robusta.setAsal("Eropa");
        robusta.setStokK(50);
        kops.add(robusta);
        
        arabica.setKopi("Flores ");
        arabica.setAsal("Asia");
        arabica.setStokK(100);
        kops.add(flores);
        
        susu.setTopping("Susu ");
        susu.setStokT(100);
        tops.add(susu);
        
        oreo.setTopping("Oreo ");
        oreo.setStokT(100);
        tops.add(oreo);
        
        System.out.println("MENU KOPI : ");
        for (int i = 0; i < kops.size(); i++) {
            int j = i + 1;
            System.out.println(j + " " + kops.get(i).getKopi());
        }
        
        try {
            
            kops.size();
            System.out.print("Inputkan Pesanan : ");
            int pil = s.nextInt() - 1;
            System.out.println("Pesanan Anda :\nKopi " + kops.get(pil).getKopi() + "yang berasal  dari " + kops.get(pil).getAsal());
            System.out.println("Sisa Stok Kopi : " + kops.get(pil).getStokK());
        } catch (Exception e) {
            
            System.out.println("\nInputan Salah");
            System.out.println(e+"\n");
            Main();
        }
        
        
        
        
        
        
        
        
        
    }}
    

