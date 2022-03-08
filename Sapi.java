public class Sapi extends Hewan{
    public String makanan(){
        System.out.println(super.makanan());
        return "Sapi makan rumput";
    }
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return "Sapi berkembangbiak dengan cara beranak";
    }
}
