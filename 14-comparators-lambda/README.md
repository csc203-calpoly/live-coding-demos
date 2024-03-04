# 20 – Comparators and lambda

- Comp<Student> comp = (Student s1, Student s2) -> s1.getAge() – s2.getAge();
- Why? Functional interface. One abstract method. Show javadocs.
    - [https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html)
- Comp<Student> comp = (s1, s2) -> s1.getAge() – s2.getAge();
- Show more complex version:
    
    (Student s1, Student s2) ->
    {
    
    if (s1.getAge() < s2.getAge()) return -1;
    if (s1.getAge() > s2.getAge()) return 1;
    return 0;
    
    }
    
    Create a comparator using a key extraction (using comparing)
    
- Comp<Student> = Comparator.comparing(Student::getAge);
- Sorted by key, based on the key’s Natural Ordering
    
    Comparator based on lastName:
    
- Lamda: Comp<Student> c = (s1, s2) -> s1.getLastName().CompareTo(s2.getLastName());
- Key Extraction: Comp<Student> c = Comparator.comparing(Student::getLastName());
    
    Using the thenComparing
    
- Using comparators

o Comparator<Student>comp1=newStudentAgeComparator());
o Comparator<Student>comp2=comp1.thenComparing(Student::getLastName);
o Comparator<Student>comp2=comp1.thenComparing(

(s1, s2) -> s1.getLastName().CompareTo(s2.getLastName());

---
