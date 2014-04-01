package Mit;

/* Calculate total pay */

class Person {

    protected double basepay;
    protected double hourworks;
    protected double totalpay;

    public void setBasePay(int basepay) {
        
    	this.basepay = basepay;
    	if(basepay < 8.5 ){
    		System.out.println("A person can't work for less than the minimum wage");
    	} 
    }
    
    public void setHourWork(int hourworks){
    	
    	this.hourworks = hourworks;
    	if(hourworks > 60){
    		System.out.println("A person can't work more than 60 hours");
    	} 
    }

    public double salary() {
        
        if(hourworks <= 40){
        	totalpay = basepay * hourworks;
        }
        else if(hourworks > 40) { 
        	totalpay = (basepay * 40 + basepay * 1.5 * (hourworks-40));
        }
        
        return totalpay;
    }
}
public class FooCorporation {

	public static void main(String[] args) {
		
		Person p1 = new Person();
        p1.setBasePay(5);
        p1.setHourWork(55);
       	System.out.println("Person1 salary is " + (p1.salary()));
       	
       	Person p2 = new Person();
        p2.setBasePay(5);
        p2.setHourWork(55);
       	System.out.println("Person2 salary is " + (p2.salary()));
       	
       	Person p3 = new Person();
        p3.setBasePay(5);
        p3.setHourWork(55);
       	System.out.println("Person3 salary is " + (p3.salary()));
       	
	}
}
