class Movie
{
	String Title;
	String Studio;
	String Rating;
	
	public Movie(String Title,String Studio,String Rating)
	{
		this.Title=Title;
		this.Studio=Studio;
		this.Rating=Rating;
	}	
        public void display1()
	{
		 System.out.println("Title:"+Title);
		System.out.println(" Studio:"+Studio);
		System.out.println(" Rating:"+Rating);
	}
	public Movie(String Title,String Studio)
	{
		
		this.Title=Title;
		this.Studio=Studio;		
		this.Rating="PG";
    }
 public void display2()
	{
		 System.out.println("Title:"+Title);
		System.out.println(" Studio:"+Studio);
}
 
    public static void main(String args[])
    {

      	 Movie M1 = new Movie("Casino Royal","Eon Productions","PG-13");
	 Movie M2 = new Movie("Casino Royal","Eon Productions");
        	 M1.display1();
	 M2.display2();
    }
}
	