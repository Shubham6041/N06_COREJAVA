## 1.How do you sort an array of 0 and 1?
```java

class Main {
    public static void sort(int arr[])
    {
        int countZero = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                countZero++;
            }
        }
        
        for(int i=0; i<countZero; i++)
        {
            arr[i] = 0;
        }
        
        for(int i=countZero; i<arr.length; i++)
        {
            arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 0};
        
        sort(arr);
        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }
}
```
## 2. how do you rotate an array k times?
```java

class Main {
    public static void rotate(int arr[], int k)
    {
        if(k==0)
        {
            return;
        }
        
        int n = arr.length;
        k = k % n;
        
        for(int i=0; i<n; i++)
        {
            if(i<k)
            {
                System.out.print(arr[n+i-k]+" ");
            }
            else
            {
                System.out.print(arr[i-k]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 2;
        rotate(arr, k);
        
    }
}
```
## 3.How do you sort an array of 0's and 1's?
```java

class Main {
    public static void rotate(int arr[])
    {
       int countZero = 0;
       
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i]==0)
           {
               countZero++;
           }
       }
       
       for(int i=0; i<countZero; i++)
       {
           arr[i] = 0;
       }
       
       for(int i=countZero; i<arr.length; i++)
       {
           arr[i] = 1;
       }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1};
        rotate(arr);
        
        for(int n : arr)
        {
            System.out.print(n+" ");
        }
        
    }
}
```
## 4.Two sum of an array: In this question you will be given an array arr and a target. You have to return the indices of the two numbers such that they add up to target.
```java
class One {
	
	public static int[] twoSum(int arr[], int target)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j] == target)
				{
					return new int[] {i, j};
				}
			}
		}
		return new int[] { };
	}
	
	public static void main(String [] args)
	{
		int [] arr = {2, 4, 3, 6, 1, 7};
		
		int target = 7;
		int result[] = twoSum(arr, target);
		if(result.length == 2)
		{
			System.out.print(result[0]+" "+result[1]);
		}
		else
		{
			System.out.println("No sum found");
		}
			
	}
		
}
```
