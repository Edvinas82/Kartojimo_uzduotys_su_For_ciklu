public class Main {
    public static void main(String[] args) {
        isvestSkaiciusNuo20Iki37();
        isvestiBruksnelius();
        isvestiSkaicisiusNuo15IkiMinus21();
    }

    public static void isvestSkaiciusNuo20Iki37 (){
        for (int i = 20; i < 37; i++) {
            System.out.println(i);
        }
    }
    public static void isvestiSkaicisiusNuo15IkiMinus21 (){
        for (int i = 15; i > -21; i--){
            System.out.println(i);
        }
    }
    public static void  isvestiBruksnelius (){
        System.out.println("------------------------");
    }
}