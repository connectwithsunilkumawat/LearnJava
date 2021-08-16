package Sorting;

public class Sorting 
{
	
 static void printArray(int arr[])
  {
	 int n = arr.length;
	  for (int i=0; i<n; ++i)
	     System.out.print(arr[i]+" ");
	     System.out.println();
  }	

 static void bubbleSort(int[] arr)    
   {  
	 int n = arr.length;  
	 int temp;  
	 for(int i=0; i < n; i++)
	 {  
	    for(int j=1; j < (n-i); j++)
	    {  
	      if(arr[j-1] > arr[j])
	      {            
	         temp = arr[j-1];  
	         arr[j-1] = arr[j];  
	         arr[j] = temp;  
	      }                         
        }  
      }    
    }
 public static void selectionSort(int[] arr)
 {   
	 int n = arr.length;
     for (int i = 0; i < n - 1; i++)  
     {  
         int MinimumIndex = i;  
         for (int j = i + 1; j < n; j++)
         {  
             if (arr[j] < arr[MinimumIndex])
             {  
            	 MinimumIndex = j;//searching for lowest index  
             }  
         }  
         int smallerNumber = arr[MinimumIndex];   
         arr[MinimumIndex] = arr[i];  
         arr[i] = smallerNumber;  
     }  
 } 
	public static void main(String[] args)
	{
		int arr[] ={3,60,35,2,45,320,5};
		int arr1[] ={3,60,35,2,45,320,5};
		System.out.println("Array Before Bubble Sort");  
		printArray(arr);
		System.out.println(); 
		bubbleSort(arr);
		System.out.println("Array After Bubble Sort");  
		printArray(arr);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("Array Before Selection Sort");  
		printArray(arr1);
		
		System.out.println(); 
		selectionSort(arr1);
		System.out.println("Array After Selection Sort");  
		printArray(arr1);
		
	}

}
