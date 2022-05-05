class Stacks{
	int a[]=new int[10];
	int n=a.length;
	int top1=n/2;
	int top2 =n/2-1;
	  
	  void pushby1(int value){
		 if(top1>0){
		 a[--top1]=value;
		 }
		 else{
			 System.out.println("Stack is full");
		 }
	  }
	  
	  void pushby2(int value){
		 if(top2<n){
		 a[++top2]=value;
		 }
		 
		 else{
			 System.out.println("Stack is full");
		 }
	  }
	  
	  void popfor1(){
		  if(top1>n/2){
			  System.out.println("Stack is Empty");
		  }
		  int x=a[top1];
		  top1=top1+1;
		  System.out.println("Popped out element is :"+x);
	  }
	  
	   void popfor2(){
		  if(top1<n/2-1){
			  System.out.println("Stack is Empty");
		  }
		  int y=a[top2];
		  top2=top2-1;
		   System.out.println("Popped out element is :"+y);
	  }
	  
	  void display(){
		  for(int i=top1 ;i<=top2;i++){
			  System.out.println(a[i]+" ");
		  }
	  }
	  
	public static void main(String args[]){
		Stacks s =new Stacks();
		s.pushby1(5);
		s.pushby2(10);
		s.pushby2(15);
		s.pushby1(11);
		s.pushby2(7);
		s.pushby2(40);
		s.display();
		System.out.println();
		s.popfor1();
		s.popfor2();
		s.display();
	}
}