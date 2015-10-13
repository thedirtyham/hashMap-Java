package hashMap;

public class Toy2 {
	private double number;
	private String name;
	
	public Toy2(String name, double number)
	{
		this.number = number;
		this.name = name;
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Toy2) 
	     {
	        Toy2 another = (Toy2) obj;
		    return ((this.number == another.number) &&
		  	     (this.name.equals(another.name)));
	    }
	    else
	        return false;

	}
	
	public String toString(){
		return name  + " " + number;
	}
}

