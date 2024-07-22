package Programs;

public class WAPtoFindThirdHighestElementInArray {
	
	public static void main(String[] args) {
		
		int a[]= {121,99,155,189,234,102};
		int k=3;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(a[i]);
			}
		}
		
		
		
		
		
	}

}
