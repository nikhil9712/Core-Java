package Thread;

public class CompanyMain {

	
	public static void main(String[] args) {
		
		Company company=new Company();
		Produce produce=new Produce(company);
		Consumer consumer=new Consumer(company);
		
		produce.start();
		consumer.start();
	}
}
