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
