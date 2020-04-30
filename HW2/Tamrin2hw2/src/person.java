
public class person implements Cloneable{
    
    public String haircolor;
    public String name;
    public int hight;
    public person(String name,String haircolor,int hight) {
        this.haircolor=haircolor;
        this.name=name;
        this.hight=hight;
    }
    public Object clone()throws CloneNotSupportedException{ 
        return super.clone();
    }
    
    
        
    
}
