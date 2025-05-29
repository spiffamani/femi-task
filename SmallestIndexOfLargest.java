public class SmallestIndexOfLargest {

public static int smallestAndlargest(int[] number){

int largest = 0;
int indexcount = 0;

for(int index = 0; index < number.length; index++){
if(largest < number[index]  && largest != number[index]){
int temp = number[index];
largest = temp;
indexcount = index;
}
}
return indexcount;
}
public static void main(String[] args){
int[] number = {1, 5, 3, 4, 5, 5};
System.out.print("the smallest index is " + SmallestIndexOfLargest.smallestAndlargest(number));
  
}
}
