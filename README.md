# basic interview questions

## 1.How do you reverse a string?

```java
class Main{
    
    public static void main(String[] args)
    {
       String str = "aBBBa";
       String str1 = "";
       
       int size = str.length();
       
       for(int i=size-1; i>=0; i--)
       {
           str1 = str1+str.charAt(i);
       }
       System.out.println(str1);
    }
}
```

## 2. How do you determine if a string is a palindrome?

```java
class Main{
    
    public static void main(String[] args)
    {
       String str = "aBBBa";
       String str1 = "";
       
       int size = str.length();
       
       for(int i=size-1; i>=0; i--)
       {
           str1 = str1+str.charAt(i);
       }
       System.out.println(str1);
       
       if(str.equals(str1))
       {
           System.out.println("palindrome");
       }
       else
       {
           System.out.println("Not a palindrome");
       }
    }
}
```

## 3.How do you calculate the number of numerical digits in a string?

```java
class Main{
    
    public static void main(String[] args)
    {
       String str = "Hello12My name is 44";
       int size = str.length();
       int digits = 0;
       
       for(int i=0; i<=size-1; i++)
       {
           if(str.charAt(i)>=48 && str.charAt(i)<=57)
           {
               digits++;
           }
       }
       System.out.println(digits);
      
    }
}
```
## 4.How do you find the count for the occurrence of a particular character in a string?

```java
class Main{
    
    public static void main(String[] args)
    {
       String str = "Hello";
       int size = str.length();
       char c = 'l';
       int count = 0;
       
       for(int i=0; i<=size-1; i++)
       {
           if(str.charAt(i) == c)
           {
               count++;
           }
       }
       System.out.println(count);
      
    }
}
```

## 5.How do you find out if the two given strings are anagrams?

```java
import java.util.Arrays;
class Main{
    
    public static void main(String[] args)
    {
        String str = "Listen";
		String str1 = "Silent";
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		if(str.length() == str1.length())
		{
			char[] str2 = str.toCharArray();
			char[] str3 = str1.toCharArray();
		
			
			Arrays.sort(str2);
			Arrays.sort(str3);
			
			boolean result = Arrays.equals(str2, str3);
			
			if(result)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
			
		}
		else
		{
			System.out.println("Not anagram");
		}
      
    }
}
```

## 6.How do you find the non-matching characters in a string?

```java
import java.util.Arrays;
class Main{
    
    public static void main(String[] args)
    {
        String str = "Hello";
		String str1 = "Hallo";
		
		if(str.length() != str1.length())
		{
		    System.out.println("Strings of different length");
		    
		}
		else
		{
		    for(int i=0; i<=str.length()-1; i++)
		    {
		        if(str.charAt(i) != str1.charAt(i))
		        {
		            System.out.println("Character not matched at index : "+i);
		        }
		    }
		}
      
    }
}
```

## 7.How do you calculate the number of vowels and consonants in a string?

```java
/*class Main{
    
    public static void main(String[] args)
    {
        String str = "Hello";
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0; i<str.length(); i++)
		{
		    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		    {
		        vowels++;
		    }
		    else
		    {
		        consonants++;
		    }
		}
		
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonants : "+consonants);
      
    }
}
*/
class Main{
    
    public static void main(String[] args)
    {
        String str = "Hello world";
		int vowels = 0;
		int consonants = 0;
		
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
		    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		    {
		        vowels++;
		    }
		    else if(str.charAt(i)>='a' && str.charAt(i)<='z')
		    {
		        consonants++;
		    }
		}
		
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonants : "+consonants);
      
    }
}
```
## 8.How do you total all of the matching integer elements in an array?
```java
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {1, 2, 4, 5, 3, 4};
       int target = 4;
       int sum = 0;
       
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i] == target)
           {
               sum = sum + arr[i];
           }
       }
       
       System.out.println("Sum of matching element is : "+sum);
    }
}
```
## 9.How do you reverse an array?
```java
package com.array.codingproblems;
public class reverseArray {
	
	public static void reverse(int arr[], int size)
	{
		int a[] = new int[size];
		int j = size;
		
		for(int i=0; i<size; i++)
		{
			a[j-1] = arr[i];
			j--;
		}
		
		System.out.println("Array after reverse : ");
		for(int k : a)
		{
			System.out.print(k+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 9};
		int size = arr.length;	
		reverse(arr, size);
	}
}
```
## 10. How do you find the maximum element in an array?
```java
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {1, 2, 3, 4, 5};
       int max = arr[0];
       
       for(int i=1; i<arr.length; i++)
       {
           if(arr[i]>max)
           {
               max = arr[i];
           }
       }
       System.out.println(max);
       
    }
}
```
## 11. How do you find the smallest element in an array?
```java
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {1, 2, 3, 4, 5};
       int min = arr[0];
       
       for(int i=1; i<arr.length; i++)
       {
           if(arr[i] < min)
           {
               min = arr[i];
           }
       }
       System.out.println(min);
       
    }
}
```
## 12. How do you find the second largest element in an array?
```java
import java.util.Arrays;
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {1, 2, 3, 4, 5};
       Arrays.sort(arr);
       int secondLargest = arr.length-1;
       System.out.println(secondLargest);
       
    }
}
```
## 13. How do you find the second smallest element in an array?
```java
import java.util.Arrays;
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {7, 1, 5, 6, 2};
       Arrays.sort(arr);
       int secondSmallest = arr[1];
       System.out.println(secondSmallest);
       
    }
}
```
## 14.How do you sort an array of integers in ascending order?
```java
import java.util.Arrays;
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {7, 1, 5, 6, 2};
       
       int temp = 0;
       for(int i=0; i<arr.length; i++)
       {
           for(int j=0; j<arr.length-1; j++)
           {
               if(arr[j]>arr[j+1])
               {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       
       for(int n : arr)
       {
           System.out.print(n+" ");
       }
    }
}
```
## 15.How do you print a Fibonacci sequence using recursion?
```java
class Main{
    
    public static void main(String[] args)
    {
       int num1 = 0;
       int num2 = 1;
       
       for(int i=0; i<=10; i++)
       {
           System.out.print(num1+" ");
           int num3 = num1+num2;
           num1 = num2;
           num2 = num3;
       }
    }
}
```
## 16.How do you find the average of numbers in an array?
```java
class Main{
    
    public static void main(String[] args)
    {
       int arr[] = {2, 4 , 6, 8};
       int sum = 0;
       
    //   for(int i=0; i<arr.length; i++)
    //   {
    //       sum = sum+arr[i];
    //   }
    
        for(int n : arr)
        {
            sum = sum+n;
        }
       
       int avg = sum/arr.length;
       System.out.println(avg);
    }
}
```
## 17.How do you check if an integer is even or odd?
```java
class Main{
    
    public static void main(String[] args)
    {
       int num = 12;
       
       if(num%2 == 0)
       {
           System.out.println("Number is even");
       }
       else
       {
           System.out.println("Number is odd");
       }
    }
}
```
## 18.How do you find the middle element of a linked list?
```java
import java.util.LinkedList;
class Main{
    
    public static void main(String[] args)
    {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        
        System.out.println(nums);
        
        int midIndex = nums.size()/2;
        System.out.println("Mid element: "+nums.get(midIndex));
    }
}
```
## 19.How do you implement binary search to find an element in a sorted array?
```java
class Main{
    
    public static int binarySearch(int arr[], int target)
    {
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
       int arr[] = {1, 2, 3, 4, 5, 6};
       int target = 2;
       
       int result = binarySearch(arr, target);
       
       if(result != -1)
       {
           System.out.println("Value found at index : "+result);
       }
       else
       {
           System.out.println("Value not found");
       }
    }
}
```
## 20. How would you swap two numbers without using a third variable?
```java
class Main{
    
    public static void main(String[] args)
    {
        int a = 4;
        int b = 5;
        
        b = a + b;
        a = b - a;
        b = b - a;
        
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
```
## 21.How do you remove all occurrences of a given character from the input string?
```java
class Main {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.replace("l", "");
        
        System.out.println(str);
    }
}
```
## 22.How do you check if the given number is prime?
```java
import java.util.Scanner;

class Main {
    
    public static boolean prime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        
        boolean result = prime(num);
        System.out.println(result);
        
    }
}
```
## 23. Reverse words in a given string
```java

class Main {
    public static void main(String[] args) {
        String str = "Sachin Ramesh Tendulkar";
        
        String[] words = str.split(" ");
        int size = words.length;
        
        StringBuilder s = new StringBuilder();
        for(int i=size-1; i>=0; i--){
            s.append(words[i]);
            
            if(i != 0){
                s.append(" ");
            }
        }
        
        System.out.println(s.toString());
    }
}
```
## 24. Given a set of strings, find the longest common prefix.
```java

class Main {
    public static void main(String[] args) {
        String[] str = {"Apple", "App", "Appearance"};
        
        String first = str[0];
        String last = str[str.length-1];
        
       int min = Math.min(first.length(), last.length());
       
       int i = 0;
       while(i < min && first.charAt(i) == last.charAt(i)){
           i++;
       }
       
       System.out.println(first.substring(0, i));
    }
}
```
## 25. Given a string in roman form, the task is to convert this given roman string into an integer.
```java

class Main {
    public static int value(char r){
        if(r == 'I'){
            return 1;
        }
        if(r == 'V'){
            return 5;
        }
        if(r == 'X'){
            return 10;
        }
        if(r == 'L'){
            return 50;
        }
        if(r == 'C'){
            return 100;
        }
        if(r == 'D'){
            return 500;
        }
        if(r == 'M'){
            return 1000;
        }
        return -1;
       
    }
    
    public static int romanToInt(String s){
        int length = s.length();
        int result = 0;
        
        for(int i=0; i<length; i++){
            int current = value(s.charAt(i));
            
            if(i+1 < length && current < value(s.charAt(i+1))){
                result = result - current;
            }
            else{
                result = result + current;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str = "XVI";
        int result = romanToInt(str);
        System.out.println(result);
    }
}
```
