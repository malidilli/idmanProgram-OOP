
import java.util.Scanner;

public class İDMANprogramı {

    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        System.out.println("idman programına hoşgeldiniz");
        String idmanlar="Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun...");
        System.out.println("yapacagınız purbee sayısını giriniz  : ");
        int burpee=klavye.nextInt();
        System.out.println("yapacagınız pushup sayısını giriniz : ");
        int pushup=klavye.nextInt();
        System.out.println("yapacagınız situp sayısını giriniz :");
        int situp=klavye.nextInt();
        System.out.println("yapacagınız squat sayısını giriniz :");
        int squat=klavye.nextInt();
        klavye.nextLine();
         
        Idman idman=new Idman(burpee,pushup,situp,squat);
        
        while(idman.idmanBittiMi()==false){
            System.out.println("hareket Türü(Burpee,Pushup,situp,Squat) :  ");
            
            String tur=klavye.nextLine();
            System.out.println("bu hareketten kaç tane yapacaksınız :");
            int sayı=klavye.nextInt();
            klavye.nextLine();
            idman.hareketYap(tur, sayı);
            
        }
    }
    
}
