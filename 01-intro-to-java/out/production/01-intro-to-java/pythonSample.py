def main():      
   x = 5
   y = 12.3456
   letter = 'A'
   make = 'Santa Cruz'  #Can only use double quotes in Java
   model = "Bronson" #Are strings mutable, or immutable in Python?
   scores = [83, 42, 77, 92, 73, 95, "Good", 'Uh...Study more.'] #Can't mix types in java

   x = 10

   if x == 10 and model == "Bronson":
      x = 34
      print ("Great bike!")

   # Three different ways of going through a list
   for i in range(len(scores)): # No 'in' or 'range' in java
      print("Score " + str(i) + ": " + str(scores[i]))
      
   for val in scores: 
      print(val)
      
   i = 0
   while i < 8:
      print(scores[i])
      i += 1

   # Two ways to print the string, one character at a time
   for c in model:
      print(c)

   i = 0
   while i < len(model):
      print(model[i])  # Cannot index into a string like this in Java
      i += 1
      
   z = x**3 # No ** operator (also no // operator)
   print(z)

   printMult(model, 10)
   printMult(10, 5)   
   #printMult("Hey", "You")   

def printMult(s, n):
   for i in range(n):
      print(s)

if __name__ == "__main__":
   main()
