//

@FunctionalInterface
interface High{
   public void hello();
  // public void bonjour();
}
class Plane{
    public void planeFlies(){
        System.out.println("Plane is flying");
    }
}

class cargoPlane extends Plane{
    @Override
    public void planeFlies(){
        System.out.println("Cargo plane flies high");
    }
}
public class Annotation1 {
    public static void main(String[] args) {
        cargoPlane cp=new cargoPlane();
        cp.planeFlies();
    }
}
