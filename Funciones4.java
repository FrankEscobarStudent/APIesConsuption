public class Funciones4 {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public static void main(String[] args) {
        Funciones4 s = new Funciones4();
        s.setName("Frank");
        String name = s.getName();
        System.out.println("The name is: "+ name );
    }
}
