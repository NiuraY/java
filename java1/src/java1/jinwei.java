package java1;
import java.util.Arrays;
import java.util.Scanner;
	class PersonOverride{
	private String name;
		private boolean gender;
		private int age;
		public PersonOverride(String name,int age,boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public boolean isGender() {
			return gender;
		}
		public int getAge() {
			return age;
		}
		public PersonOverride(){
			this("default",1,true);
		}
		public String toString(){
			return (name+"-"+age+"-"+gender);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PersonOverride other = (PersonOverride) obj;
			if (age != other.age)
				return false;
			if (gender != other.gender)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}
	public class jinwei {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n1=sc.nextInt();
			PersonOverride []person1 = new PersonOverride[n1];
			for(int i=0;i<n1;i++){
		    person1[i] = new PersonOverride();
		    }
		    int n2 = sc.nextInt();
		    int k = 0;
		    PersonOverride []person2 = new PersonOverride[n2];
		    for(int i = 0;i<n2;i++){
		    	PersonOverride p = new PersonOverride(sc.next(),sc.nextInt(),sc.nextBoolean());
		    	int flag=0;
		    	if(k==0){
		    		person2[i]=p;
		    		k++;
		    		flag=1;
		    	}
		    	for(int j=0;j<i;j++){
		    		if(p.equals(person2[j])){
		    			flag=1;
		    		}
		    	}
		    	if(flag==0){
		    		person2[k]=p;
		    		k++;
		    	}
		    }
		    for(int i1=0;i1<n1;i1++){
	    		System.out.println(person1[i1].toString());
	    	}
	    	for(int i1=0;i1<k;i1++){
	    		System.out.println(person2[i1].toString());
	    	}
	    	System.out.println(k);
	    	System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
		}

	}

		

