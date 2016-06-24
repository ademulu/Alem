package alem;

public class Alem {

    
    public static void main(String[] args) {
      Otcul o=new Otcul();
      Etcil e=new Etcil();
    }
    
}
class Hayvan{
    public Hayvan(){
        System.out.println("Hayvan Sınıfı Yapıcısı");
    }
}
class DortAyakli extends Hayvan{
    public DortAyakli(){
        System.out.println("DortAyaklı Sınıfı Yapıcısı");
    }
}
class Etcil extends DortAyakli{
    public Etcil(){
        System.out.println("Etcil Sınıfı Yapıcısı");
    }
}
class Otcul extends DortAyakli{
    public Otcul(){
        System.out.println("Otcul Sınıfı Yapıcısı");
    }
}

