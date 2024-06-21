import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class person{
		String name;
		int age;
		person(String name,int age){
			this.name=name;
			this.age=age;
		}
	}
public class named {

	
	public static void main(String[] args) {
		person a=new person("akash",18);
		person b=new person("kumar",10);
		person c=new person("adi",8);
		person d=new person("loki",1);
		List<person> persons=Arrays.asList(a,b,c,d);
		Predicate <person> pm=p->p.age>=18;
		for(person person:persons) {
			if(pm.test(person)) {
				System.out.println(person.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "named [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
