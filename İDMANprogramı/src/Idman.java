
public class Idman {
    
    private int burpee_sayısı;
    private int pushup_sayısı;
    private int situp_sayısı;
    private int squat_sayısı;
    
    public void hareketYap(String hareketTürü,int sayı){
         
        if(hareketTürü.equals("burpee")){
             burpeeYap(sayı);
        }else if(hareketTürü.equals("pushup")){
            pushupYap(sayı);
            
        }else if(hareketTürü.equals("situp")){
            situpYap(sayı); 
        }else if(hareketTürü.equals("squat")){
            squatYap(sayı);
        }else {
            System.out.println("geçersiz hareket");
        }
    }
    public Idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
    }    
    public void burpeeYap(int sayı){
        if(burpee_sayısı==0){
            System.out.println("yapacak burpee kalmadı.");
        }if(burpee_sayısı-sayı<0){
            System.out.println("hedefledigin burpee sayısını geçtin tebrikler");
            burpee_sayısı=0;
            System.out.println("kalan burpee sayısı : " + burpee_sayısı);
        }else{
            burpee_sayısı -=sayı;
            System.out.println("kalan burpee sayısı : " + burpee_sayısı );
        }
    } 
    public void pushupYap(int sayı){
        if(pushup_sayısı==0){
            System.out.println("yapacak burpee kalmadı.");
        }if(pushup_sayısı-sayı<0){
            System.out.println("hedefledigin burpee sayısını geçtin tebrikler");
            pushup_sayısı=0;
            System.out.println("kalan burpee sayısı : " + pushup_sayısı);
        }else{
            pushup_sayısı -=sayı;
            System.out.println("kalan burpee sayısı : " + pushup_sayısı );
        }
    }  public void situpYap(int sayı){
        if(situp_sayısı==0){
            System.out.println("yapacak burpee kalmadı.");
        }if(situp_sayısı-sayı<0){
            System.out.println("hedefledigin burpee sayısını geçtin tebrikler");
            situp_sayısı=0;
            System.out.println("kalan burpee sayısı : " + situp_sayısı);
        }else{
            situp_sayısı -=sayı;
            System.out.println("kalan burpee sayısı : " + situp_sayısı );
        }
    }  public void squatYap(int sayı){
        if(squat_sayısı==0){
            System.out.println("yapacak burpee kalmadı.");
        }if(squat_sayısı-sayı<0){
            System.out.println("hedefledigin burpee sayısını geçtin tebrikler");
            squat_sayısı=0;
            System.out.println("kalan burpee sayısı : " + squat_sayısı);
        }else{
            squat_sayısı -=sayı;
            System.out.println("kalan burpee sayısı : " + squat_sayısı );
        }
    }  public  boolean idmanBittiMi(){
        
        return ((burpee_sayısı==0)&&(pushup_sayısı==0)&&(situp_sayısı==0)&&(squat_sayısı==0));
    }
    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }
 
    
}
