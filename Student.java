
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
    
    public String getInitialen(){
        String initialen;
        int pos; /* Diese Zahl merkt sich die Position des Leerzeichens im Namen.*/
        
        initialen = name.substring(0,1); 
        pos = name.indexOf(" ")+1;
        /* Der Code sucht nach dem Leerzeichen 
        im Namen (zwischen Vor- und Nachname) und geht einen Schritt weiter – 
        also zur ersten Stelle des Nachnamens.*/
        
        initialen = initialen + name.substring(pos,pos + 1);
        /* weil pos ist der Stelle der erstes Buchstabe und pos + 1 ist der
           nächster Wert*/
        return initialen;
        
    }
    
    public String getVorname(){
        int pos;
        
        pos = name.indexOf(" ");
        return name.substring(0,pos);
        
    }
    
    public String getNachname(){
        int pos;
        
        pos = name.indexOf(" ") + 1;
        return name.substring(pos);
    }
    
    public String getNachnameVorname(){
        return getNachname() + " " + getVorname();
    }
    
    public String getAccount(){
        String nachname, nachname4;
        nachname = getNachname();
        nachname4 = nachname.substring(0,4);
        return nachname4.toUpperCase() + alter;
        
        /* zum Lernen, nicht ganz klar*/
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
