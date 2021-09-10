public class Functions4 {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public static void main(String[] args) {
        Functions4 s = new Functions4();
        s.setName("Frank");
        String name = s.getName();
        System.out.println("The name is: "+ name );
        System.out.println("The name is: "+ s.getName());
    }
}
