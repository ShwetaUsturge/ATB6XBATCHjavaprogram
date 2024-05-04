package ex20042024;

public class lab024 {
    public static void main(String[] args) {
        // new is used by only non primitive
        //int a= new int(8);
        String apitoken = "1212";
        String password = new String("@89190!");
        String Passwerd1 = "Shweta@1234";
        String passu = Passwerd1.toLowerCase();
        System.out.println(passu);
        System.out.println(passu== Passwerd1);
        System.out.println(passu.equals(Passwerd1));
        System.out.println(passu.equalsIgnoreCase(Passwerd1));
        System.out.println(passu.substring(0,3));
        System.out.println(passu.indexOf("t"));


        }
}
