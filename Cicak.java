public class Cicak extends Hewan{
    public String makanan(){
        System.out.println(super.makanan());
        return "Cicak makan laron";
    }
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return "Cicak berkembangbiak dengan cara bertelur";
    }
}
