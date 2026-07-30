class class1{
    public void playmusic(){
        System.out.println("MUsic playing...");
    }

    public String cal(){
        return "FIVE";
    }
    
}
class MAD{
    public static void main(String[] args) {
        class1 obj = new class1();
        obj.playmusic();
        String str = obj.cal();
        System.out.println(str);
    }
}