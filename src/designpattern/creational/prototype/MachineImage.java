package designpattern.creational.prototype;

public class MachineImage  implements Cloneable{
    StringBuilder image ;

    public MachineImage(String os, String antivirus) {
        image = new StringBuilder();
        image.append(os).append("+"+antivirus);
    }
    public MachineImage(String sw) {
        image = new StringBuilder(sw);
    }
    public void install(String sw){
        image.append(sw);
    }
    public void printSw(){
        System.out.println(image);
    }

    @Override
    protected MachineImage clone() throws CloneNotSupportedException {
        return new MachineImage(this.image.toString());
    }
}
