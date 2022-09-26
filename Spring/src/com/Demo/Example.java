package com.Demo;

public class Example {
	
	public void prime() {
		for(int j=200,n=j,i=2;j<500;j++) {
			for(;(i<=n/2)&&(n%i++ !=0);) 
				if(i>n/2) { 
					String s=Integer.toString(j);
					if(s.contains("3") || s.contains("7")) 
						System.out.println(j);
				}
		}
	}
	public void sum(int n) {
		n=123456;
		int r=0;
		int sum=0;
		while(n>0) {
		r=r*10+n%10;
		n=n/10;
		}
		while(r>0) {
			sum=sum+r%10;
			System.out.print(r%10);
			if(r/10!=0)
			System.out.print("+");
			r=r/10;
			}
		System.err.print("="+sum);
		
	}
	public void replace8(int n) {
		int p=1,t;
		n=458983;
		t=n;
		while (n>0) {
			n=n/10;
			p=p*10;
		}
		p=p/10;
		int sum=0;
		int d=0;
		n=t;
		while(n>0) {
			d=n/p;
			n=n%p;
			p=p/10;
			if(d==8)
				sum=sum*10+7;
			else
			sum=sum*10+d;
			
		}
		System.out.println(sum);
	}
	public void countDigits(int n) {
		int p=1,t;
		n=458983;
		t=n;
		while (n>0) {
			n=n/10;
			p=p*10;
		}
		int p1=p;
		p=p/10;
		int d=0;
		n=t;
		int a[]=new int [10];
		while(n>0) {
			d=n/p;
			n=n%p;
			p=p/10;
			a[d]++;
		}
		n=t;
		while(n>0) {
			d=n/p1;
			n=n%p1;
			p1=p1/10;
			if(d>0)
			System.out.print(d+" "+a[d]+"\n");
			
		}
	}
	
	
}	


