# 26 – Exception handling

## Topics

- Exceptions — what they are
- `try catch`
- `try catch` semantics — code tracing exercises
- Checked exceptions
    - Exception must be `catch`ed or specified in the method’s signature using `throws` before code can compile. Example: `FileNotFoundException`
- Unchecked exceptions
    - Code will compile without the exception being handled. Example: `NullPointerException`

## Example1

```java
public static void main(String[] args) {	
	// someMethod(3);
	try
	{
		junkFunc(null);
		someMethod(5);
	} catch (NullPointerException e) {
	   System.out.println("NullPointer Exception: " + e.getMessage());
	   return;
	} catch (ArithmeticException e) {
	   System.out.println("Arithmetic Exception: " + e.getMessage());
	} catch (Exception e) {
	   System.out.println("Exception caught: " + e.getMessage());
	} finally {
	   System.out.println("out of try-catch block");
	}
	
	System.out.println("Continuing main...");
}
```
