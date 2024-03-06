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
