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