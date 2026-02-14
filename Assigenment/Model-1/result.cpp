#include<stdio.h>
main(){
	int science ,Maths;
	int History;
	int result;
	float average;
	printf("Enter Science Mark:");
	scanf("%d",&science);
	printf("Enter Maths Mark:");
	scanf("%d",&Maths);
	printf("Enter History Mark:");
	scanf("%d",&History);
	
	printf("\nScience:%d",science);
	printf("\nMaths:%d",Maths);
	printf("\nHistory:%d",History);
	
	result = science+Maths+History;
	printf("\n\nResult:%d",result);
	
	average = result/3.0;
	printf("\n\nAverage out of 3 subject:%.2f",average);
	
	if (average>=90){
		printf("\n\nExellence");
	}
	else if(average>=70){
		printf("\n\nVery Good");
	}
	else if(average>=50){
		printf("\n\nGood");
	}
	else if(average>=30){
		printf("\n\nTrain hard");
	}
	else {
		printf("\n\nReel Kam dekh lale");
	}
}
