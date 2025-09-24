
public class Student{
    private String name;
    private int alter;
    private boolean matura;
    
    public Student(String name, int alter, boolean matura){
        setName(name);
        setAlter(alter);
        setMatura(matura);
    }
    public Student(String name, int alter){
        setName(name);
        setAlter(alter);
        setMatura(false);
    }
    
    public Student(String name){
        setName(name);
        setAlter(14);
        setMatura(false);
    }
    public Student(){
        setName("UNKN");
        setAlter(14);
        setMatura(false);
    }
    
    public String getName(){
        return name;
    }
    
    public int getAlter(){
        return alter;
    }
    
    public boolean getMatura(){
        return matura;
    }
    
    /* name (rechts) ist der Parameter, den du an die Methode übergibst.
    this.name (links) ist das Feld/Attribut(Eigenschaft) des Objekts.
    „Setze mein Attribut(Eigenschaft) name gleich dem Wert, den ich als Parameter 
    name bekomme.“
    */
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAlter(int alter){
        this.alter = alter;
    }
    
    public void setMatura(boolean matura){
        this.matura = matura;
    }
    
    public void printStudent(){
        if(matura == true){
            System.out.println("Name:" + name + "." + "Alter:" + alter + 
            "." + "hat Matura.");
        }
        else{
            System.out.println("Name:" + name + "." + "Alter:" + alter + 
            "." + "Hat keine Matura");
        }
    }
}
